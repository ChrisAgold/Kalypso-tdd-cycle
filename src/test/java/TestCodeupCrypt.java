import static org.junit.Assert.*;
import org.junit.Test;

public class TestCodeupCrypt {

    @Test
    public void testIfVersionIsCorrect(){
        assertEquals(0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.2;
        assertEquals(1.2, CodeupCrypt.version, 0);
    }

    @Test
    public void testIfHashPasswordWorks(){
        // Codeup C0d39p
        assertEquals("C0d39p", CodeupCrypt.hashPassword("Codeup"));
        assertEquals("F3r", CodeupCrypt.hashPassword("Fer"));
        assertEquals("123", CodeupCrypt.hashPassword("123"));
        assertEquals("124", CodeupCrypt.hashPassword("12a"));
    }

    @Test
    public void testIfCheckPasswordsWorks(){
        assertTrue(CodeupCrypt.checkPassword("Codeup", "C0d39p"));
        assertFalse(CodeupCrypt.checkPassword("", "C0d39p"));
    }

}
