import java.util.Scanner;

class Student {
    String name;
    int yearOfJoining;
    String address;
    
    public void getInfo(String name, int year, String address) {
        this.name = name;
        this.yearOfJoining = year;
        this.address = address;
    }
    
    public void displayInfo() {
        System.out.println(name + " " + yearOfJoining + " " + address);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student[] students = new Student[3];
        
        for (int i = 0; i < 3; i++) {
            students[i] = new Student();
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            
            System.out.print("Enter year of joining: ");
            int year = Integer.parseInt(sc.nextLine());
            
            System.out.print("Enter address: ");
            String address = sc.nextLine();
            
            students[i].getInfo(name, year, address);
        }
        
        System.out.println("\nName Year of joining Address");
        for (Student s : students) {
            s.displayInfo();
        }
        
        sc.close();
    }
}
