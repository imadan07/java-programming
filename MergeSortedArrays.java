import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> mergedArray = new ArrayList<>();

        System.out.println("Enter sorted elements for Array 1 (type -1 to stop):");
        int num;
        while ((num = scanner.nextInt()) != -1) {
            arr1.add(num);
        }

        System.out.println("Enter sorted elements for Array 2 (type -1 to stop):");
        while ((num = scanner.nextInt()) != -1) {
            arr2.add(num);
        }

        mergedArray.addAll(arr1);
        mergedArray.addAll(arr2);
        Collections.sort(mergedArray);

        System.out.println("Merged and Sorted Array:");
        for (int element : mergedArray) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}
