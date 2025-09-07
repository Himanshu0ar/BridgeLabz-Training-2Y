import java.util.Scanner;   
class NumberUtils {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }
}

public class CheckNumbersProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int num = numbers[i];
            if (NumberUtils.isPositive(num)) {
                if (NumberUtils.isEven(num)) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            } else {
                System.out.println(num + " is negative.");
            }
        }

        int cmp = NumberUtils.compare(numbers[0], numbers[4]);
        if (cmp == 1) {
            System.out.println("First element is greater than last.");
        } else if (cmp == 0) {
            System.out.println("First element is equal to last.");
        } else {
            System.out.println("First element is less than last.");
        }
    }
}
