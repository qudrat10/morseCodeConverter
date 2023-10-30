import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testConvertAtoMorseCode() {
        // Arrange
        String text = "A";
        String expected = "*-";

        // Act
        String actual = Main.convertToMorseCode(text);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertABCToEnglish() {
        // Arrange
        String morseCode = ".- -... -.-.";
        String expected = "ABC";

        // Act
        String actual = Main.convertToEnglish(morseCode);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void englishToMorseCode() {
        // Arrange
        String text = "HELLO WORLD";
        String expected = ".... . .-.. .-.. ---  .-- --- .-. .-.. -.." ;

        // Act
        String actual = Main.convertToMorseCode(text);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void morseCodeToEnglish() {
        // Arrange
        String morseCode = "- . ... - / -- --- .-. ... . / -.-. --- -.. . / - --- / . -. --. .- .- .- -.. ... ....";
        String expected = "TEST MORSE CODE TO ENGLISH";

        // Act
        String actual = Main.convertToEnglish(morseCode);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void englishToInvalidMorseCode() {
        // Arrange
        String morseCode = ".....";
        String expected = "Invalid Morse code in the input: .....";

        // Act
        String actual = Main.convertToEnglish(morseCode);

        // Assert
        assertEquals(expected, actual);
    }

}



