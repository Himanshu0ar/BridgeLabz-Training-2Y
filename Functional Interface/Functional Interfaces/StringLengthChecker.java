import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        int characterLimit = 100;
        
        Function<String, Integer> getLengthFunction = message -> message.length();
        
        String message1 = "This is a short message";
        String message2 = "This is a very long message that exceeds the character limit and should trigger an alert because it is too long for the system to handle properly";
        
        int length1 = getLengthFunction.apply(message1);
        int length2 = getLengthFunction.apply(message2);
        
        if (length1 > characterLimit) {
            System.out.println("Message exceeds limit: " + length1 + " characters");
        } else {
            System.out.println("Message within limit: " + length1 + " characters");
        }
        
        if (length2 > characterLimit) {
            System.out.println("Message exceeds limit: " + length2 + " characters");
        } else {
            System.out.println("Message within limit: " + length2 + " characters");
        }
    }
}