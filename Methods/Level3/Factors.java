import java.util.*;

public class Factors {
    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] f = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) f[idx++] = i;
        return f;
    }

    public static int greatestFactor(int[] f) {
        return f[f.length - 1];
    }

    public static int sumFactors(int[] f) {
        int s = 0; for (int x : f) s += x; return s;
    }

    public static int productFactors(int[] f) {
        int p = 1; for (int x : f) p *= x; return p;
    }

    public static double productCubeFactors(int[] f) {
        double p = 1; for (int x : f) p *= Math.pow(x, 3); return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = getFactors(n);
        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Greatest Factor: " + greatestFactor(f));
        System.out.println("Sum: " + sumFactors(f));
        System.out.println("Product: " + productFactors(f));
        System.out.println("Product of Cubes: " + productCubeFactors(f));
    }
}
