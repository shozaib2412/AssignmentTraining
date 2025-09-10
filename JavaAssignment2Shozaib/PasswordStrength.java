import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        
        if (isStrong(password)) {
            System.out.println("Password strength: Strong.");
        } else if (isMedium(password)) {
            System.out.println("Password strength: Medium.");
        } else {
            System.out.println("Password strength: Weak.");
        }
        
        sc.close();
    }
    
    private static boolean isStrong(String password) {
        return password.length() >= 8 && hasUpperCase(password) && hasLowerCase(password)
                && hasDigit(password) && hasSpecialChar(password);
    }
    
    private static boolean isMedium(String password) {
        return password.length() >= 6 && hasUpperCase(password) && hasLowerCase(password)
                && hasDigit(password);
    }
    
    private static boolean hasUpperCase(String str) {
        return str.matches(".*[A-Z].*");
    }
    
    private static boolean hasLowerCase(String str) {
        return str.matches(".*[a-z].*");
    }
    
    private static boolean hasDigit(String str) {
        return str.matches(".*\\d.*");
    }
    
    private static boolean hasSpecialChar(String str) {
        return str.matches(".*[^a-zA-Z0-9].*");
    }
}
