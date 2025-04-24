
/*
Create a class Employee with the following specifications:

Attributes
  empNo (int)
  salary (double)
  totalSalary (static double)

  Requirements
a. Parameterized Constructor Only:
b. Static totalSalary:
c. Auto-incremented empNo:
d. Class Method:
 */

class Employee{
    private static int totalEmplyees = 0;
    private static double totalSalary = 0;

    private int empNo;
    private double Salary;

    //prameterized constructors
    public Employee(double salary){
        this.empNo = ++totalEmplyees;
        this.Salary = salary;
        totalSalary += salary;
    }

    public static void displayTotals(){
        System.out.println("Total Employees:"+totalEmplyees);
        System.out.println("Total Salary: "+ totalSalary);
    }

    public int getEmpNo(){
        return empNo;
    }
    public double getSalary(){
        return Salary;
    }
}
public class question1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(100000);
        Employee e2 = new Employee(150000);
        Employee e3 = new Employee(200000);
        Employee e4 = new Employee(250000);

        Employee.displayTotals();

    }
}
