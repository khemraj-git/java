
/*
Q. Create a abstract class/Interface employee, having its properties & abstract function for calculating
     net salary and displaying the information.  Drive manager & clerk class from this abstract
     class / Interface & implement the abstract method net salary and override the display method.
 */

// Abstract class Employee
abstract class Employeee {
    protected String name;
    protected int id;
    protected double basicSalary;

    public Employeee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    // Abstract methods
    public abstract double calculateNetSalary();
    public abstract void displayInfo();
}

// Manager class
class Manager extends Employeee {
    private double allowance;

    public Manager(String name, int id, double basicSalary, double allowance) {
        super(name, id, basicSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateNetSalary() {
        return basicSalary + allowance;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Allowance: " + allowance);
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

// Clerk class
class Clerk extends Employeee {
    private double overtimePay;

    public Clerk(String name, int id, double basicSalary, double overtimePay) {
        super(name, id, basicSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateNetSalary() {
        return basicSalary + overtimePay;
    }

    @Override
    public void displayInfo() {
        System.out.println("Clerk Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Overtime Pay: " + overtimePay);
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

// Main class to test
public class question4 {
    public static void main(String[] args) {
        Employeee manager = new Manager("Alice", 1001, 50000, 10000);
        Employeee clerk = new Clerk("Bob", 1002, 25000, 3000);

        manager.displayInfo();
        System.out.println();
        clerk.displayInfo();
    }
}

