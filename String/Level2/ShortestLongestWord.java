import java.util.Scanner;

public class ShortestLongestWord {

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
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }
        int wordCount = spaceCount + 1;
        String[] words = new String[wordCount];
        int[] spaces = new int[spaceCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaces[index++] = i;
        }
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i < spaceCount) ? spaces[i] : length;
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
            start = end + 1;
        }
        return words;
    }

    public static String[][] getWordsWithLengths(String[] words) {
        int n = words.length;
        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static String[] findShortestLongest(String[][] wordsWithLengths) {
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];
        int min = Integer.parseInt(wordsWithLengths[0][1]);
        int max = Integer.parseInt(wordsWithLengths[0][1]);

        for (int i = 1; i < wordsWithLengths.length; i++) {
            int length = Integer.parseInt(wordsWithLengths[i][1]);
            if (length < min) {
                min = length;
                shortest = wordsWithLengths[i][0];
            }
            if (length > max) {
                max = length;
                longest = wordsWithLengths[i][0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        String[] result = findShortestLongest(wordsWithLengths);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);

        sc.close();
    }
}

