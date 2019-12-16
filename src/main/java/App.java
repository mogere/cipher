public class App {
    public static void main(String[] args){
    Cipher cipher = new Cipher("this word", 5);
    System.out.println(cipher.encrypt());

    }
}
