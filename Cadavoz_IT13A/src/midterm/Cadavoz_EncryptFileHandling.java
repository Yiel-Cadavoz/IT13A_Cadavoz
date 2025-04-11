package midterm;

import java.io.FileWriter;
import java.io.IOException;

public class Cadavoz_EncryptFileHandling {
    public static void main (String[] args) throws IOException{
        String encryptedMessage;
        try (FileWriter myWriter = new FileWriter("C:\Users\User\Documents\Cadavoz_Patriana_Malaya.txt")){
            int key = 6;
            String message = "I love you! \n Gwapa ko! \n Buotan si Ma'am";
            encryptedMessage = encryptMessage(message, key);
            myWriter.write(encryptedMessage);
        }
        System.out.println("Successfully wrote to the file. ");
        System.out.println("\"I love you! \\n Gwapa ko! \\n Buotan si Ma'am");
        System.out.println(encryptedMessage);
        
    }
        public static String encryptMessage(String message,int key){
            char[] chars = message.toCharArray();
            for (int a= 0; a < chars.length; a++){
                if (chars[a] != '\n'){
                    chars[a] += key;
                }
            }
        }
}