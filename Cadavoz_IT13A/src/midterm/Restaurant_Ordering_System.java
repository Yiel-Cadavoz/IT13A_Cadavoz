package midterm;

import java.io.BufferedReader;   //we used BufferedReader due to its efficiency as it reads larger chunks of data at once
import java.io.FileReader;     //FileReader reads characters one at a time
import java.io.FileWriter;    //FileWriter creates the file users.txt where all credentials are stored
import java.io.IOException;   //IOException is used handle errors that might occur while reading the file
import java.util.Scanner;     //Used to read user input

public class Restaurant_Ordering_System {
    
    private static final String FILE_NAME = "users.txt";//name of the file where account information is saved
    private static final int SHIFT = 3;//This is for encrypting passwords. Each letter in a password will be "shifted" ny 3 characters (e.g, A = D, B = E)
    
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {//try block is used for safe resource handling. If you're reading from a file, the scanner could throw exceptions like FileNotFoundException
            int choice;// using int because we are expecting a number for the variable choice
            
            System.out.println("Welcome to SAIK Restaurant!");
            System.out.println("Savory, Authentic, and Indulgent Kitchenette ---  Where Flavor Meets Soul");
            
            do {// here, we are using a do-while loop. This method will keep showing this menu until the user chooses to exit
                System.out.println("\n1. Create Account");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.println("Choose an option(1-3): ");
                choice = scanner.nextInt();// the value of the variable choice is read by the scanner from user input.
                
                switch (choice){// switch be like: “Hey, the user gave me a number. Now I need to do something based on what number they picked.”
                    case 1 -> createAccount(scanner);
                    case 2 -> login(scanner);
                    case 3 -> System.out.println("\nThank you for visiting! Come again next time!");// \n is for aesthetic purposes. discuss lang impromptu kay di makaya i-explain sa english
                    default -> System.out.println("\nThat's not in the choices. Please choose again.");
                }
            } while (choice != 3);
        }
    }
    // we use private instead of public to avoid calling the same method in other programs. this makes it more secure
    private static void createAccount(Scanner scanner){// this function is for when the user decides to create an account
        scanner.nextLine();// the block nextLine() reads an entire line of text until the user hits Enter (Juan Dela Cruz will be read as a whole, not just Juan)
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        
        String encryptedPassword = encryptPassword(password);// Before saving the password, we encrypt it using the encryptPassword method (so it's not stored in plain text.)
       
        //The true flag means "append" (don’t erase existing data, just add to it).
        try (FileWriter fileWriter = new FileWriter(FILE_NAME, true)){// We must use try-catch here to handle issues and avoid crashing the whole program if file writing fails.
            fileWriter.write(username + "," + encryptedPassword + "\n");
            System.out.println("Account successfully created!");
        } catch (IOException e){
            System.out.println("Error saving the account information. Please try again.");
        }
    }
    // we use private instead of public to avoid calling the same method in other programs. this makes it more secure
    private static void login(Scanner scanner){
        scanner.nextLine();
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){// We must use try-catch here to handle these issues and avoid crashing the whole program if file writing fails.
            String line;
            boolean isAuthenticated = false;// false because the user hasn't logged in yet. if the program finds the match, then it sets it into true.
            
            while ((line = reader.readLine()) != null){// we used while loop to go throught the stored accounts in the file to see if any username AND password matches. keeps checking until it finds the match or reaches the end of the list
                String[] credentials = line.split(",");
                // we used nested if statements to ...
                if (credentials.length < 2) continue;// check if the line is valid
                
                String storedUsername = credentials[0];
                String storedEncryptedPassword = credentials[1];
                
                if (username.equals(storedUsername)){// check if the username matches
                    String decryptedPassword = decryptPassword(storedEncryptedPassword);
                    if (password.equals(decryptedPassword)){// check if the password matches
                        isAuthenticated = true;
                        break;// stop the loop early if the match is found
                    }
                }
            }
            // we used if-else loop to check if the username and password is existing or not
            if (isAuthenticated){//  If the user was found and logged in, let them access the menu.
                System.out.println("Login Successful!");
                showOrderingMenu(scanner);
            } else {//  If not, show an error message.
                System.out.println("Invalid username or password. Please try again.");
            }
        } catch (IOException e){
            System.out.println("Error reading the user data. Please try again.");
        }
    }
    
    private static void showOrderingMenu(Scanner scanner){
        // we use String because food names are texts, String[] menuItems is an array containing the food menu
        String[] menuItems = {"Set A: Sinigang, Rice & Pork Adobo, Ensaladang Mangga, Leche Flan, Mango Shake", "Set B: Tinolang Manok, Garlic Fried ice & Grilled Milkfish, Pickled Cucumbers, Buko Pandan, Buko Juice", "Set C: Tokwa't Baboy, Chicken Inasal & Rice, Ginisang Gulay, Halo-halo, Iced Calamansi Juice"};
        double[] itemPrices = {299.99, 279.99, 374.99};// we use double instead of int because prices have decimals
        int[] itemQuantities = new int[menuItems.length];// this creates an array to track how many of each item the user ordered. we used int because you can't order 1.5 quantity
        int choice;
        
        do {// we're using do-while loop instead of while loop because we want the menu to show at least once no matter what.
            System.out.println("\nRestaurant Menu: ");
            for (int i = 0; i < menuItems.length; i++){// This is a for loop that goes through each menu item.
            System.out.println((i + 1) + ". " + menuItems[i] + " - P" + itemPrices[i]);
            }
            System.out.println((menuItems.length + 1) + ". Exit");
            System.out.print("Choose an item to order (1-" + (menuItems.length + 1) + "): ");
            choice = scanner.nextInt();// This reads the number the user types (1–4). If it’s 4, they want to exit the menu.
            
            if (choice >= 1 && choice <= menuItems.length){// We ask how many they want. Then we add that amount to the correct spot in the itemQuantities[] array.
                System.out.print("Enter quantity for " + menuItems[choice - 1] + ": ");
                int quantity = scanner.nextInt();
                itemQuantities[choice - 1] += quantity;
                System.out.println(quantity + " " + menuItems[choice -1] + "(s) added to your order.");
            } else if (choice != menuItems.length + 1){// We show an error if they typed something that’s not an actual menu item or “exit”.
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != menuItems.length + 1); // the menu will keep on showing up until the user presses exit
        
        double totalBill = 0;
        System.out.println("\nYour Order Summary: ");
        for (int i = 0; i < menuItems.length; i++){// Repeats code for each item in a list
            if (itemQuantities[i] > 0){
                double subtotal = itemQuantities[i] * itemPrices[i];
                totalBill += subtotal;
                System.out.println(menuItems[i] + " x" + itemQuantities[i] + " = P" + subtotal + " (Subtotal)");
            }
        }
        System.out.println("Grand Total: P" + totalBill);
    }
    
    private static String encryptPassword(String password){
        StringBuilder encrypted = new StringBuilder();// StringBuilder is a special tool in Java that lets you build a string step by step — like putting letters in a bag
        for (int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if (Character.isLetter(c)){// the encryption only works on letters
                char shifted = (char) (c + SHIFT);
                encrypted.append(shifted);
            } else {// if the password is a number, it stays the same. 
                encrypted.append(c);// append adds one letter at a time
            }
        }
        return encrypted.toString();
    }
    
    private static String decryptPassword(String encryptedPassword){
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < encryptedPassword.length(); i++){
            char c = encryptedPassword.charAt(i);
            if (Character.isLetter(c)){
                char shifted = (char) (c - SHIFT);
                decrypted.append(shifted);
            } else {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }    
}
