import java.util.Scanner;

public class MorseCodeApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Morse Code Translator");
        System.out.println("Enter '1' to translate from English to Morse code");
        System.out.println("Enter '2' to translate from Morse code to English");
        int choice = scan.nextInt();
        scan.nextLine(); // Consume the newline

        if (choice == 1) {
            System.out.print("Enter the English text: ");
            String text = scan.nextLine();
            String morseCode = Main.convertToMorseCode(text);
            System.out.println("Morse Code: " + morseCode);
        } else if (choice == 2) {
            System.out.print("Enter the Morse code: ");
            String morseCode = scan.nextLine();
            String text = Main.convertToEnglish(morseCode);
            System.out.println("English: " + text);
        } else {
            System.out.println("Invalid choice. Please select '1' or '2'.");
        }

        scan.close();
    }

}
