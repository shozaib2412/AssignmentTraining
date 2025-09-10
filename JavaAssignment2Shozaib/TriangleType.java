import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter side 1: ");
        int a = sc.nextInt();
        
        System.out.print("Enter side 2: ");
        int b = sc.nextInt();
        
        System.out.print("Enter side 3: ");
        int c = sc.nextInt();
        
        if (a == b && b == c) {
            System.out.println("The triangle is equilateral.");
        } else if (a == b || b == c || a == c) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
        
        sc.close();
    }
}
