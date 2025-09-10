import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = 0;
        int n = number;
        
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        
        System.out.println("The sum of the digits is " + sum + ".");
        
        sc.close();
    }
}
