import java.util.Scanner;
public class PalindromeChecker {
    private String text;
    public PalindromeChecker(String text) {
        this.text = text;
    }
    public boolean isPalindrome() {
        String cleaned = text.replaceAll("\\s+","").toLowerCase();
        int i = 0, j = cleaned.length()-1;
        while (i < j) {
            if (cleaned.charAt(i) != cleaned.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
    public void display() {
        if (isPalindrome()) System.out.println("\"" + text + "\" is a palindrome.");
        else System.out.println("\"" + text + "\" is NOT a palindrome.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String txt = sc.nextLine();
        PalindromeChecker pc = new PalindromeChecker(txt);
        pc.display();
        sc.close();
    }
}
