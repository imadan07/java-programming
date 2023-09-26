import java.util.Scanner;

public class FindCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the character to be searched: ");
        char searchChar = scanner.nextLine().charAt(0);

        int index = -1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == searchChar) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(searchChar + " is found in the string at index: " + index);
        } else {
            System.out.println(searchChar + " is not found in the string.");
        }

        scanner.close();
    }
}
