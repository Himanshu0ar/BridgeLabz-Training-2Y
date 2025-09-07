import java.util.Scanner;

public class WordsWithLengths {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordsWithLengths = getWordsWithLengths(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < wordsWithLengths.length; i++) {
            System.out.println(wordsWithLengths[i][0] + "\t" + Integer.parseInt(wordsWithLengths[i][1]));
        }

        sc.close();
    }
}

