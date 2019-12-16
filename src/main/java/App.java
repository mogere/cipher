import java.io.Console;


public class App {
    public static void main(String[] args){
    Cipher cipher = new Cipher();
    System.out.println("Welcome to Caesar Cipher application");
    cipher.setInitialText("This word");
    cipher.setKey(4);
    System.out.println(cipher.encrypt());
    System.out.println(cipher.decrypt());
    }
}
