import java.util.Scanner;
import java.util.Arrays;

public class SplitTextWithoutSplitMethod {

    
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {}
        return count;
    }

    public static String[] splitWords(String text) {
        int length = findLength(text);
        int spaceCount = 0;

        // Count spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = spaceCount + 1;
        String[] words = new String[wordCount];
        int[] spaceIndexes = new int[spaceCount];
        int index = 0;

        
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i < spaceCount) ? spaceIndexes[i] : length;
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
            start = end + 1;
        }
        return words;
    }

    
    public static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = sc.nextLine();

        String[] customSplit = splitWords(text);
        String[] builtInSplit = text.split(" ");

        System.out.println("Custom split result: " + Arrays.toString(customSplit));
        System.out.println("Built-in split result: " + Arrays.toString(builtInSplit));

        boolean isSame = compareArrays(customSplit, builtInSplit);
        System.out.println("Are both arrays same? " + isSame);

        sc.close();
    }
}
