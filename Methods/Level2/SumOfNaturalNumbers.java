import java.util.Scanner;
class NaturalSum {

    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
}

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Number is not a natural number.");
            return;
        }

        int sumRec = NaturalSum.recursiveSum(n);
        int sumFormula = NaturalSum.formulaSum(n);

        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumRec == sumFormula) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results are not equal.");
        }
    }
}
