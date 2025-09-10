import java.util.Scanner;

public class ITCityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter city name: ");
        String city = sc.nextLine().trim().toLowerCase();
        
        if (city.equals("delhi") || city.equals("mumbai") || city.equals("kolkatta") ||
            city.equals("bangalore") || city.equals("chennai") || city.equals("hyderabad")) {
            System.out.println(city.substring(0, 1).toUpperCase() + city.substring(1) + " is an IT city.");
        } else {
            System.out.println(city.substring(0, 1).toUpperCase() + city.substring(1) + " is not an IT city.");
        }
        
        sc.close();
    }
}
