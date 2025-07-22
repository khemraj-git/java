package ATM;

import  java.util.Scanner;

class ATM{
    int PIN;
    double balance = 0.0;


//    creating pin
    public void pinmaker(){
        Scanner sc = new Scanner(System.in);
        System.out.println("set your 4 digit pin");
        PIN = sc.nextInt();
//    condition
        if(PIN > 9999 || PIN < 0000){
            System.out.println("enter a valid pin");
        }
        else{
            System.out.println("your pin has been successfully created");
        }
    }

//      checking pin if the user has entered correct pin or not


    public void checkPIN(){
        System.out.println("enter your pin:-");
        Scanner sc = new Scanner(System.in);
        int enteredPIN = sc.nextInt();
        if (enteredPIN == PIN){
            menu();
        }
        else{
            System.out.println("enter a valid pin");
        }
    }

// checking balance
    public void checkbalance(){
        System.out.println("balance of your account is: " + balance);
        menu();
    }

//    withdraw money and giving condition
    public void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount you need to withdraw");
        int amount = sc.nextInt();
        if (amount>balance){
            System.out.println("insufficient balance");
        }else {
            balance = balance - amount;
            System.out.println("money withdraw successful");
            System.out.println("balance of your account is: " + balance);

        }
        menu();
    }

//    deposit money there is no condition
    public void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount you want to deposit");
        int amount = sc.nextInt();
        balance = balance + amount;
        System.out.println("money deposit successful");
        System.out.println("your new balance of your account is: " + balance);
        menu();
    }
//    main control
    public void menu(){
        System.out.println("enter your choice:-");
        System.out.println("1. Check balance");
        System.out.println("2. withdraw money");
        System.out.println("3. deposit money");
        System.out.println("4. exit");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        if (choice == 1){
            checkbalance();
        } else if (choice == 2) {
            withdraw();
        } else if (choice == 3) {
            deposit();

        } else if (choice==4) {
            System.out.println("Thank you for using the ATM");
            return;
        }else {
            System.out.println("wrong choice ");
        }
    }
}


public class Sample_ATM {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.pinmaker();
        obj.checkPIN();
    }
}
