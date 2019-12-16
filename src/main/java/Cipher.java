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
        for(int i=0, length = initialText.length();i<length;i++ ){
            char check = initialText.charAt(i);
            if(Character.isLetter(check)){
                if(Character.isLowerCase(check)){
                    char checked = (char)(check+key);
                    if(check>'z'){
                        encrypted += (char)(check - (26 - key));
                    }
                    else
                        encrypted += checked;
                }
            }
        }

        return encrypted;
    }
    public String decrypt(){
        return null;
    }
}
