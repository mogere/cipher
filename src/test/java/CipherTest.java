import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void  testCipher_instanciatesObject_object() {
        Cipher testCipher =new Cipher("word", 5);
        assertEquals(true, testCipher instanceof Cipher);
    }

    @Test
    public void  testCipher_testWordGetter_word() {
        Cipher testCipher =new Cipher("word", 5);
        assertEquals("word", testCipher.getInitialText());
    }

    @Test
    public void  testCipher_testKeyGetter_word() {
        Cipher testCipher =new Cipher("word", 5);
        assertEquals(5, testCipher.getKey());
    }
    @Test
    public void testCipher_setInitialText(){
        Cipher testCipher =new Cipher();
        testCipher.setInitialText("Welcome");
        assertEquals( "Welcome", testCipher.getInitialText());
    }

    @Test
    public void testCipher_setKey(){
        Cipher testCipher =new Cipher();
        testCipher.setKey(7);
        assertEquals( 7, testCipher.getKey());
    }

    @Test
    public void testCipher_encrypt(){
        Cipher testCipher =new Cipher("ab", 1);
        assertEquals("bc", testCipher.encrypt());
    }

    @Test
    public void testCipher_decrypt(){
        Cipher testCipher =new Cipher("bc", 1);
        assertEquals("kb", testCipher.decrypt());
    }
}