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

    public String encrypt(){
        String encrypted = "";
        for(int i=0, length = initialText.length();i<length;i++ ) {
            char check = initialText.charAt(i);
            if (Character.isLetter(check)) {
                if (Character.isLowerCase(check)) {
                    char checked = encryption(check);
                    encrypted += checked;
                } else if (Character.isUpperCase(check)) {
                    char checked = encryption(check);;
                    encrypted += checked;
                }
            }
        }

        return encrypted;
    }

    public char encryption(char check){
        char checked = (char)(check + key);
        return checked;
    }

    public String decrypt(){
        return null;
    }
}
