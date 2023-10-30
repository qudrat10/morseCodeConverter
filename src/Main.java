import java.util.HashMap;
import java.util.Map;


public class Main{
    private static final Map<String, String> morseToEnglish = new HashMap<>();
    private static final Map<String, String> englishToMorse = new HashMap<>();

    static {
        // Define Morse code mappings
        morseToEnglish.put("*-", "A");
        morseToEnglish.put("-***", "B");
        morseToEnglish.put("-*-*", "C");
        morseToEnglish.put("-**", "D");
        morseToEnglish.put("*", "E");
        morseToEnglish.put("**-*", "F");
        morseToEnglish.put("--*", "G");
        morseToEnglish.put("****", "H");
        morseToEnglish.put("**", "I");
        morseToEnglish.put("*---", "J");
        morseToEnglish.put("-.-", "K");
        morseToEnglish.put("*-**", "L");
        morseToEnglish.put("--", "M");
        morseToEnglish.put("-*", "N");
        morseToEnglish.put("---", "O");
        morseToEnglish.put("*--*", "P");
        morseToEnglish.put("--*-", "Q");
        morseToEnglish.put("*-*", "R");
        morseToEnglish.put("***", "S");
        morseToEnglish.put("-", "T");
        morseToEnglish.put("**-", "U");
        morseToEnglish.put("***-", "V");
        morseToEnglish.put("*--", "W");
        morseToEnglish.put("-**-", "X");
        morseToEnglish.put("-*--", "Y");
        morseToEnglish.put("--**", "Z");
        morseToEnglish.put("-----", "0");
        morseToEnglish.put("*----", "1");
        morseToEnglish.put("**---", "2");
        morseToEnglish.put("***--", "3");
        morseToEnglish.put("****-", "4");
        morseToEnglish.put("*****", "5");
        morseToEnglish.put("-****", "6");
        morseToEnglish.put("--***", "7");
        morseToEnglish.put("---**", "8");
        morseToEnglish.put("----*", "9");
        morseToEnglish.put(".-.-.-", ".");
        morseToEnglish.put("..--..", "?");
        morseToEnglish.put( "--..--", ",");

        for (Map.Entry<String, String> entry : morseToEnglish.entrySet()) {
            englishToMorse.put(entry.getValue(), entry.getKey());
        }
    }

    //takes an English text as input and returns its Morse code representation as a string.
    public static String convertToMorseCode(String text) {
        StringBuilder morseCode = new StringBuilder();
        String[] words = text.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                for (char c : word.toCharArray()) {
                    String upperCaseChar = String.valueOf(c).toUpperCase();
                    if (englishToMorse.containsKey(upperCaseChar)) {
                        morseCode.append(englishToMorse.get(upperCaseChar)).append(" ");
                    } else {
                        // Handle non-standard input
                        return "Invalid character in the input: " + c;
                    }
                }
                morseCode.append(";");
            }
        }
        return morseCode.toString().trim();
    }

    public static String convertToEnglish(String morseCode) {
        StringBuilder englishText = new StringBuilder();
        String[] words = morseCode.split(";");
        for (String word : words) {
            String[] morseCharacters = word.trim().split(" ");
            for (String morseCharacter : morseCharacters) {
                if (morseToEnglish.containsKey(morseCharacter)) {
                    englishText.append(morseToEnglish.get(morseCharacter));
                } else {
                    // Handle non-standard input
                    return "Invalid Morse code in the input: " + morseCharacter;
                }
            }
            englishText.append(" ");
        }
        return englishText.toString().trim();
    }
}

