import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String text) {
        int num = Integer.parseInt(text); // Invalid input will throw exception
        System.out.println(num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number as text: ");
        String text = sc.next();

        System.out.println("Generating exception...");
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("Handling exception safely...");
        handleException(text);
    }
}
