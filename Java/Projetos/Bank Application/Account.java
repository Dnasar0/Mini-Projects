import java.util.Scanner;

public class Account {
    
    // Class Variables
    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerID;

    // Class Constructor
    public Account(String cname, String cid) {

        customerName = cname;
        customerID = cid;
    }

    // Function for depositing money
    public void deposit(int amount) {

        if(amount > 0) {

            balance += amount;
            previousTransaction = amount; 
        }
    }

    // Function for withdrawing money
    public void withdraw(int amount) {

        if(amount > balance) {

            System.out.println("There's not enough money on the bank to withdaw " + amount + "!");
        }

        else {

            balance -= amount;
            previousTransaction = -amount;
        }
    }

    // Function for showing previous transaction
    public void getPreviousTransaction() {

        if(previousTransaction > 0) {

            System.out.println("Deposited: " + previousTransaction);
        }

        else if(previousTransaction < 0) {

            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        }

        else {

            System.out.println("No transaction occurred.");
        }
    }

    // Function for calculating interest of current funds after a number of years
    public void calculateInterest(int years) {

        double interestRate = .0185;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.println("The current interest rate is " + (100 * interestRate));
        System.out.println("After " + years + " years, your balance will be " + newBalance);
    }

    // Function showing the main menu
    public void showMenu() {
        
        char option = '\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome, " + customerName + "!");
        System.out.println("Your ID is: " + customerID);
        System.out.println();

        do {

            System.out.println("A. Check your balance");
            System.out.println("B. Make a deposit");
            System.out.println("C. Make a withdrawal");
            System.out.println("D. View previous transaction");
            System.out.println("E. Calculate interest");
            System.out.println("F. Exit");
            System.out.println();
            System.out.println("Enter an option: ");
            char option1 = sc.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch(option) {
            // Case 'A' gives function from option A, etc
                
                case 'A':
                    System.out.println("============================");
                    System.out.println("Balance = $ " + balance);
                    System.out.println("============================");
                    System.out.println();
                    break;
                
                case 'B':
                    System.out.println("Enter amount to deposit: ");
                    int amount_d = sc.nextInt();
                    deposit(amount_d);
                    System.out.println();
                    break;

                case 'C':
                    System.out.println("Enter amount to withdraw: ");
                    int amount_w = sc.nextInt();
                    withdraw(amount_w);
                    System.out.println();
                    break;

                case 'D':
                    System.out.println("============================");
                    getPreviousTransaction();
                    System.out.println("============================");
                    System.out.println();
                    break;
                
                case 'E':
                    System.out.println("Enter how many years of accrued interest: ");
                    int years = sc.nextInt();
                    calculateInterest(years);
                    break;

                case 'F':
                    System.out.println("============================");
                    break;

                default:
                    System.out.println("Error: invalid option. Please enter A, B, C, D, E, F: ");
                    break;
            }
        }while(option != 'F');
        System.out.println("Thank you for banking with us!");
    }
}
