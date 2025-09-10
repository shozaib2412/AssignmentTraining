import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();
        
        double bmi = weight / (height * height);
        
        System.out.printf("Your BMI is %.2f.%n", bmi);
        
        sc.close();
    }
}
