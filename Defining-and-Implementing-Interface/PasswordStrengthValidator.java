interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[@#$%^&+=!].*");
    }
}

public class PasswordStrengthValidator {
    public static void main(String[] args) {
        String password = "Dev@1234";
        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password is weak.");
        }
    }
}
