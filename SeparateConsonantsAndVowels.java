import java.util.Scanner;

public class SeparateConsonantsAndVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        String consonants = "";
        String vowels = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels += ch + " ";
            } else if (Character.isLetter(ch)) {
                consonants += ch + " ";
            }
        }

        System.out.println("Consonants: " + consonants);
        System.out.println("Vowels: " + vowels);

        scanner.close();
    }
}
