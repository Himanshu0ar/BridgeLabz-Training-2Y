import java.util.Scanner;

public class LongestWord {
    public static String findLongest(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for(String word : words) {
            if(word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Longest word: " + findLongest(sentence));
    }
}

