import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void  testCipher_instanciatesObject_object() {
        Cipher testCipher =new Cipher("word", 5);
        assertEquals(true, testCipher instanceof Cipher);
    }
}