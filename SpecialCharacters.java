import java.util.Scanner;

public class SpecialCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int specialCharCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                System.out.print(ch + " ");
                specialCharCount++;
            }
        }

        System.out.println("\nNumber of Special Characters: " + specialCharCount);
        scanner.close();
    }
}
