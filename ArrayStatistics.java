import java.util.*;

public class ArrayStatistics {
    public static void main(String[] args) {
        double[] numbers = {16, 18, 27, 16, 23, 21, 19};
        double sum = Arrays.stream(numbers).sum();
        double mean = sum / numbers.length;
        System.out.println("Mean = " + mean);
        Arrays.sort(numbers);
        double median;
        if (numbers.length % 2 == 0) {
            median = (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2;
        } else {
            median = numbers[numbers.length / 2];
        }
        System.out.println("Median = " + median);
        Map<Double, Integer> frequencyMap = new HashMap<>();
        for (double num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        double mode = Collections.max(frequencyMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Mode = " + mode);
    }
}
