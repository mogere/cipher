public class Cipher {
    private String initialText;
    private int key;
    private String encrypted = "";

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
        if (key>26){
            this.key = key%26;
        }
        else if (key<0){
            this.key = (key%26)+26;
        }
        else
            this.key = key;

    }

    public String encrypt(){

        for(int i=0, length = initialText.length();i<length;i++ ) {
            char check = initialText.charAt(i);
            if (Character.isLetter(check)) {
                if (Character.isLowerCase(check)) {
                    char checked = encryption(check);
                    if (checked>'z'){
                        encrypted += (char)(check - (26 - key));
                    }
                    else
                    encrypted += checked;

                } else if (Character.isUpperCase(check)) {
                    char checked = encryption(check);
                    if (checked>'Z'){
                        encrypted += (char)(check - (26 - key));
                    }
                    else
                        encrypted += checked;
                }
            }
            else
                encrypted += check;
        }

        return encrypted;
    }

    public char encryption(char check){
        char checked = (char)(check + key);
        return checked;
    }


    public String decrypt(){
        String decrypted = "";
        for(int i=0, length = encrypted.length();i<length;i++ ) {
            char check = encrypted.charAt(i);
            if (Character.isLetter(check)) {
                if (Character.isLowerCase(check)) {
                    char checked = decryption(check);
                    if (checked<'a'){
                        decrypted += (char)(check + (26 - key));
                    }
                    else
                        decrypted += checked;

                } else if (Character.isUpperCase(check)) {
                    char checked = decryption(check);
                    if (checked>'Z'){
                        decrypted += (char)(check + (26 - key));
                    }
                    else
                        decrypted += checked;
                }
            }
            else
                decrypted += check;
        }
        return decrypted;
    }

    public char decryption(char check){
        char checked = (char)(check - key);
        return checked;
    }
}
