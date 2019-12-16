import java.io.Console;
import java.util.Scanner;


public class App {
    public static void main(String[] args){
    Cipher cipher = new Cipher();
    Scanner input = new Scanner(System.in);
    //Ask for user input
    System.out.println("Welcome to Caesar Cipher application");
    System.out.println("------------------------------------");
    System.out.println("Enter the text you would like encrypted:");

    //receive user input for text to encrypt
    String toEncrypt = input.nextLine();
    cipher.setInitialText(toEncrypt); //pass it to cipher class
    System.out.println("Enter the Key you would like the text to be encrypted by:");
    int key = Integer.parseInt(input.nextLine());
    cipher.setKey(key);
    System.out.println("Your Encrypted text will be: " + cipher.encrypt());
    System.out.println("If decrypted, it will be back to: " + cipher.decrypt());

    }
}
