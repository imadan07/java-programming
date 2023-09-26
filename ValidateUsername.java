import java.util.Scanner;

public class ValidateUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        if (username.matches("^[a-zA-Z0-9_]*$") && username.length() >= 5 && username.length() <= 15) {
            System.out.println("Valid username.");
        } else {
            System.out.println("Invalid username.");
        }

        scanner.close();
    }
}
