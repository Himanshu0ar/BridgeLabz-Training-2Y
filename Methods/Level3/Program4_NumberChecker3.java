public class Program4_NumberChecker3 {
    public static int countDigits(int n) {
        int c = 0; while (n > 0) { c++; n /= 10; } return c;
    }

    public static int[] getDigits(int n) {
        int c = countDigits(n), d[] = new int[c];
        for (int i = c - 1; i >= 0; i--) { d[i] = n % 10; n /= 10; }
        return d;
    }

    public static int[] reverse(int[] d) {
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++) r[i] = d[d.length - 1 - i];
        return r;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static boolean isPalindrome(int n) {
        int[] d = getDigits(n);
        int[] r = reverse(d);
        return arraysEqual(d, r);
    }

    public static boolean isDuck(int[] d) {
        for (int x : d) if (x == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 1221;
        int[] d = getDigits(n);
        System.out.println("Palindrome: " + isPalindrome(n));
        System.out.println("Duck: " + isDuck(d));
    }
}
