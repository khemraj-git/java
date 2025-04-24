/*
Create class Product (pid, price, quantity) with a parameterized constructor.
Create a main function in a different class (XYZ) and perform the following tasks:
Accept five product details from the user and store them in an array.
Find the pid of the product with the highest price.
Create a method in the XYZ class (with the product array as an argument) to calculate and return the total amount spent on all products.
 */


import java.util.Scanner;

// Product class
class Product {
    private int pid;
    private double price;
    private int quantity;

    // Parameterized constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

// XYZ class with main method
public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // a. Accept five product information from user and store in an array
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("PID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // b. Find Pid of product with highest price
        int highestPid = findHighestPricePid(products);
        System.out.println("PID of product with highest price: " + highestPid);

        // c. Calculate and display total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        scanner.close();
    }

    // Method to find PID of product with highest price
    public static int findHighestPricePid(Product[] products) {
        double maxPrice = Double.MIN_VALUE;
        int pid = -1;

        for (Product p : products) {
            if (p.getPrice() > maxPrice) {
                maxPrice = p.getPrice();
                pid = p.getPid();
            }
        }

        return pid;
    }

    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double total = 0;

        for (Product p : products) {
            total += p.getPrice() * p.getQuantity();
        }

        return total;
    }
}
