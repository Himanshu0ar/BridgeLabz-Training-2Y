public class NumberChecker_ {
    public static int countDigits(int n) {
        int c = 0;
        while (n > 0) { c++; n /= 10; }
        return c;
    }

    public static int[] getDigits(int n) {
        int c = countDigits(n), d[] = new int[c];
        for (int i = c - 1; i >= 0; i--) { d[i] = n % 10; n /= 10; }
        return d;
    }

    public static boolean isDuck(int[] d) {
        for (int x : d) if (x == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int[] d) {
        int sum = 0;
        for (int x : d) sum += Math.pow(x, d.length);
        int num = 0;
        for (int x : d) num = num * 10 + x;
        return num == sum;
    }

    public static int[] findLargestTwo(int[] d) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > first) { second = first; first = x; }
            else if (x > second && x != first) second = x;
        }
        return new int[]{first, second};
    }

    public static int[] findSmallestTwo(int[] d) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < first) { second = first; first = x; }
            else if (x < second && x != first) second = x;
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        int n = 153;
        int[] d = getDigits(n);
        System.out.println("Duck: " + isDuck(d));
        System.out.println("Armstrong: " + isArmstrong(d));
        int[] largest = findLargestTwo(d);
        int[] smallest = findSmallestTwo(d);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}
