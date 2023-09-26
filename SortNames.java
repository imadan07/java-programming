import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter names (type 'done' to finish):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("done")) {
                break;
            }
            names.add(name);
        }

        System.out.print("Enter sorting order (A for Ascending, D for Descending): ");
        char order = scanner.next().charAt(0);

        if (order == 'A' || order == 'a') {
            Collections.sort(names);
        } else if (order == 'D' || order == 'd') {
            Collections.sort(names, Collections.reverseOrder());
        }

        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
