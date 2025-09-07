import java.util.Random;

class RandomUtils {

    public static int[] generate4DigitRandomArray(int size) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(9000) + 1000; // Generates between 1000 and 9999
        }
        return array;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }
}

public class RandomNumbersProgram {
    public static void main(String[] args) {
        int[] randomNumbers = RandomUtils.generate4DigitRandomArray(5);

        System.out.print("Random numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        double[] results = RandomUtils.findAverageMinMax(randomNumbers);
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f%n", results[0], results[1], results[2]);
    }
}

