import java.util.Scanner;

public class ToggleCase {
    public static String toggle(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 'a' + 'A');
            } else if(ch >= 'A' && ch <= 'Z') {
                result += (char)(ch - 'A' + 'a');
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Toggled case: " + toggle(str));
    }
}

