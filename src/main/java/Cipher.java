public class Cipher {
    private String initialText;
    private int key;

    public Cipher(String initialText, int key){
        this.initialText = initialText;
        this.key = key;
    }

    public Cipher() {

    }

    public String getInitialText(){
        return this.initialText;
    }

    public int getKey(){
        return this.key;
    }

    public void setInitialText(String initial){
        this.initialText = initial;
    }

    public void setKey(int key){
        this.key = key;
    }

    public String encrypt(String text){
        String encrypted = "";

        return encrypted;
    }
}
