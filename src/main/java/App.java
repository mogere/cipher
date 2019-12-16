public class App {
    public static void main(String[] args){
    Cipher cipher = new Cipher();
    cipher.setInitialText("This word");
    cipher.setKey(4);
    System.out.println(cipher.encrypt());
    System.out.println(cipher.decrypt());
    }
}
