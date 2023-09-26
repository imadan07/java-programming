import java.util.Arrays;
import java.util.Scanner;

public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.nextLine();

        char[] chars = word.toCharArray();
        Arrays.sort(chars);

        StringBuilder reversed = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]).append(" ");
        }

        System.out.println("Alphabetical Order: " + reversed.toString().trim());
        scanner.close();
    }
}
