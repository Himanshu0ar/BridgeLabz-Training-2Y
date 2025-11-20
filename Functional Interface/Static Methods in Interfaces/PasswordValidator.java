interface SecurityUtils {
    static boolean checkPasswordStrength(String password) {
        if (password.length() < 8) {
            return false;
        }
        
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isLowerCase(c)) hasLower = true;
            if (Character.isDigit(c)) hasDigit = true;
            if (!Character.isLetterOrDigit(c)) hasSpecial = true;
        }
        
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}

public class PasswordValidator {
    public static void main(String[] args) {
        String[] passwords = {
            "weak",
            "StrongPass123!",
            "password123",
            "PASSWORD123!",
            "StrongPassword!"
        };
        
        for (String password : passwords) {
            boolean isStrong = SecurityUtils.checkPasswordStrength(password);
            System.out.println("Password: " + password + " - " + 
                (isStrong ? "Strong" : "Weak"));
        }
    }
}