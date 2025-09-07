import java.util.Scanner;

public class FrequencyNested {

    public static String[][] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int length = chars.length;
        int[] freq = new int[length];
        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') count++;
        }
        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[index][0] = String.valueOf(chars[i]);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] freqData = findFrequency(text);
        System.out.println("Character Frequencies using Nested Loops:");
        for (int i = 0; i < freqData.length; i++) {
            System.out.println(freqData[i][0] + " -> " + freqData[i][1]);
        }
        sc.close();
    }
}
