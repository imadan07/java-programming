import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        try {
            int result = Integer.parseInt(input);
            System.out.println("Output Integer: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Not a valid integer.");
        }

        scanner.close();
    }
}
