package Employee_payroll_system;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Employee{

    private String name;

    private int id;

    public Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

    //encapsulation
    public String getName(){
        return name;
    }
    public int getId() {
        return id;
    }

    //abstract method:-only need to declare
    public abstract double calculateSalary();

    //polymorphism
    @Override
    public String toString(){
        return "Employee [name="+name+",id="+id+",salary="+calculateSalary()+"]";
    }

}
//inheritense
class FullTimeEmployee extends Employee{
    private double monthlySalary;

    //constructor
    public FullTimeEmployee(String name,int id,double monthlySalary){

        //to use super class variables we need to use super keyword
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee{
    private int hoursWork;
    private double hourlyRate;

    public PartTimeEmployee(String name,int id,double hourlyRate,int hoursWork){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWork = hoursWork;
    }

    @Override
    public double calculateSalary() {
        return hoursWork * hourlyRate;
    }
}

class PayrollSystem{
    //making a list
    private ArrayList<Employee> employeeList;

    //constructor
    public PayrollSystem(){
        //ArrayList<Integer> arr = new ArrayList<>()
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        //adding values in list usind add()
        employeeList.add(employee);
    }
    public void removeEmployee(int id){

//        emp -> emp.getId() == id
//        This is a lambda expression
//        For each emp (employee) in employeeList:
//        Check if emp.getId() equals the provided id
//        If true, then remove that employee from the list
        employeeList.removeIf(employee -> employee.getId() == id); //function of this -> It scans the entire list, and removes any employee whose id matches the given id.
    }

    public void displayEmployee(){
        for(Employee employee:employeeList){
            System.out.println(employee);
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayrollSystem payrollSystem = new PayrollSystem();
        while(true){
            System.out.println("1. Add employee");
            System.out.println("2. remove employee");
            System.out.println("3. display employee");
            System.out.println("4. exit");

            System.out.println("enter your choice(1-4)");
            int ch = sc.nextInt();

            if(ch==1){

                System.out.println("what type of employee you want to add ('1' for fulltime || '2' for parttime");
                int choicee = sc.nextInt();
                if(choicee==1){
                    sc.nextLine();
                    System.out.println("enter name of the employee");
                    String name = sc.nextLine();
                    System.out.println("enter Id of the employee");
                    int id = sc.nextInt();
                    System.out.println("enter monthly salay of the employee ");
                    double monthlySalary = sc.nextDouble();
                    FullTimeEmployee emp = new FullTimeEmployee(name,id,monthlySalary);
                    System.out.println("employee added successfully");
                    System.out.println("updated employee list");
                    payrollSystem.displayEmployee();

                    payrollSystem.addEmployee(emp);
                    System.out.println("employee details added successfully");
                }
                else if (choicee == 2) {
                    sc.nextLine();
                    System.out.println("enter name of the employee");
                    String name = sc.nextLine();
                    System.out.println("enter Id of the employee");
                    int id = sc.nextInt();
                    System.out.println("enter the hours of work done by the employee ");
                    int hoursWork = sc.nextInt();
                    System.out.println("enter the hour wage of the employee");
                    double hourlyRate = sc.nextDouble();

                    PartTimeEmployee emp = new PartTimeEmployee(name,id,hourlyRate,hoursWork);
                    payrollSystem.addEmployee(emp);
                    System.out.println("employee added successfully");
                    System.out.println("updated employee list");
                    payrollSystem.displayEmployee();

                }

            } else if (ch == 2) {
                System.out.println("enter the Id of the employee you want to remove");
                int id = sc.nextInt();
                payrollSystem.removeEmployee(id);
                System.out.println("employee remove successfully");
                System.out.println("remaining employee list:-");
                payrollSystem.displayEmployee();
            } else if (ch==3) {
                payrollSystem.displayEmployee();

            } else if (ch == 4) {
                return;
            }
            else {
                System.out.println("Invalid input choose again");
            }
        }
    }
}
