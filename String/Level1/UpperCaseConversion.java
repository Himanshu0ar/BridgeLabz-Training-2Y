import java.util.Scanner;

public class UpperCaseConversion {
    public static String toUpperCaseUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            result += c;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String upperCustom = toUpperCaseUsingCharAt(text);
        String upperBuiltIn = text.toUpperCase();

        System.out.println("Uppercase using charAt(): " + upperCustom);
        System.out.println("Uppercase using toUpperCase(): " + upperBuiltIn);
        System.out.println("Are they the same? " + compareStrings(upperCustom, upperBuiltIn));
    }
}

