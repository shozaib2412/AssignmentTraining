public class Pattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows for upper part
        
        // Upper part
        for (int i = 1; i <= n; i++) {
            int stars = 2 * i - 1;
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            int stars = 2 * i - 1;
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
