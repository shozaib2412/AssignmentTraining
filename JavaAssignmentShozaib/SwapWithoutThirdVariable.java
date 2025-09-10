import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        
        // Swapping without using third variable
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("After swapping:");
        System.out.println("First integer: " + a);
        System.out.println("Second integer: " + b);
        
        sc.close();
    }
}
