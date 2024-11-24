import org.junit.Test;
import static org.junit.Assert.*;

public class testKlass {

    @Test
    public void testRäknaTecken() {
        logikKlass logik = new logikKlass();
        String text = "Hej\nJag gillar inte Djurgården\nMen däremot gillar jag Mff";
        int förväntatTecken = 53;
        assertEquals(förväntatTecken, text.replaceAll("\n", "").length());
    }

    @Test
    public void testRäknaRader() {
        logikKlass logik = new logikKlass();
        String text = "Hej\nJag gillar inte Djurgården\nMen däremot gillar jag Mff";
        int förväntatRader = 2;
        assertEquals(förväntatRader, text.split("\n").length);    }
    @Test
    public void testStop() {
        logikKlass logik = new logikKlass();
        String text ="Hej\nJag gillar inte Djurgården\nMen däremot gillar jag Mff";;
        assertTrue(text.contains("stop"));    }}

