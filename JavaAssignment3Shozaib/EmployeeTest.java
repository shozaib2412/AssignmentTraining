import java.util.Scanner;

class Employee {
    double salary;
    int hoursPerDay;
    
    // Method to get employee info
    public void getInfo(double salary, int hoursPerDay) {
        this.salary = salary;
        this.hoursPerDay = hoursPerDay;
    }
    
    // Method to add $10 if salary < 500
    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }
    
    // Method to add $5 if work hours per day > 6
    public void addWork() {
        if (hoursPerDay > 6) {
            salary += 5;
        }
    }
    
    // Method to display final salary
    public void displaySalary() {
        System.out.println("Final Salary: $" + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Employee emp = new Employee();
        
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        
        System.out.print("Enter work hours per day: ");
        int hours = sc.nextInt();
        
        emp.getInfo(salary, hours);
        emp.addSal();
        emp.addWork();
        emp.displaySalary();
        
        sc.close();
    }
}
