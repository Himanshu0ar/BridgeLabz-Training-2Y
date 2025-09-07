import java.util.Scanner;

public class TrimSpaces {

    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = 0;
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {}

        start = 0;
        while (start < length && text.charAt(start) == ' ') {
            start++;
        }

        end = length - 1;
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        int len1 = 0, len2 = 0;
        try {
            while (true) {
                s1.charAt(len1);
                len1++;
            }
        } catch (IndexOutOfBoundsException e) {}
        try {
            while (true) {
                s2.charAt(len2);
                len2++;
            }
        } catch (IndexOutOfBoundsException e) {}

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] indices = findTrimIndices(text);
        String trimmedCustom = createSubstring(text, indices[0], indices[1]);
        String trimmedBuiltIn = text.trim();

        System.out.println("Trimmed (custom method): \"" + trimmedCustom + "\"");
        System.out.println("Trimmed (built-in method): \"" + trimmedBuiltIn + "\"");

        boolean isSame = compareStrings(trimmedCustom, trimmedBuiltIn);
        System.out.println("Are both trimmed results same? " + isSame);

        sc.close();
    }
}
