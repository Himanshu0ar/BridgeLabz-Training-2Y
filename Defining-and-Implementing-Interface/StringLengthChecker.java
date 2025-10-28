import java.util.function.Function;
import java.util.Scanner;

public class StringLengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = 50;

        Function<String, Integer> lengthChecker = str -> str.length();

        System.out.print("Enter your message: ");
        String message = sc.nextLine();

        int length = lengthChecker.apply(message);

        if (length > limit) {
            System.out.println("Message exceeds the limit! (" + length + " characters)");
        } else {
            System.out.println("Message is within the limit. (" + length + " characters)");
        }

        sc.close();
    }
}
