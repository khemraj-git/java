
//Write a Java program that performs basic arithmetic operations using a menu-driven approach with looping:
//Requirements:
//Prompt the user to enter two numbers (float or double).
//Display the following menu repeatedly until the user chooses to exit:
//1. Add
//2. Subtract
//3. Multiply
//4. Divide
//5. Exit


import java.util.Scanner;
public class menu_driven_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number");
        double num1 = sc.nextDouble();

        System.out.println("enter the second number");
        double num2 = sc.nextDouble();

        System.out.println("choose the operation you want to perform");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. division");

        System.out.println("enter your choice(1-4)");
        int choice = sc.nextInt();

        double result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }
}


