package midterm;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EncryptFileHandling {

    private static final String FILE_NAME = "secretMessage.txt";
    private static final int SHIFT = 5;

    public static void main (String[] args){
          
        try (Scanner scanner = new Scanner(System.in)){
            int message;
            
            System.out.println("Will you leave a message? ");
            
            do{
                System.out.println("\n1. Yes");
                System.out.println("2. No");
                message = scanner.nextInt();
                
                switch (message){
                    case 1 -> message(scanner);
                    case 2 -> System.out.println("\nGoodbye!");
                    default -> System.out.println("\nThat's not in the choices. Please choose again.");
                }
            } while (message != 2);
            
        }
    }
    
    private static void message(Scanner scanner){
        scanner.nextLine();
        System.out.print("Leave your message: ");
        String secretMessage = scanner.nextLine();
        
        String encryptedMessage = encryptMessage(secretMessage);

        try (FileWriter fileWriter = new FileWriter(FILE_NAME, true)){// We must use try-catch here to handle issues and avoid crashing the whole program if file writing fails.
            fileWriter.write(encryptedMessage + "\n");
            System.out.println("Secret message successfully saved!");
        } catch (IOException e){
            System.out.println("Error saving the message. Please try again.");
        }
    }
    
    private static String encryptMessage(String secretMessage){
        StringBuilder encrypted = new StringBuilder();// StringBuilder is a special tool in Java that lets you build a string step by step — like putting letters in a bag
        for (int i = 0; i < secretMessage.length(); i++){
            char c = secretMessage.charAt(i);
            if (Character.isLetter(c)){// the encryption only works on letters
                char shifted = (char) (c + SHIFT);
                encrypted.append(shifted);
                        
            } else {// if the password is a number, it stays the same. 
                encrypted.append(c);// append adds one letter at a time
            }
        }
        return encrypted.toString();
    }
}
