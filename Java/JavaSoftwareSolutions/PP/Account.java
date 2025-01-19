// Account.java Author: Lewis/Loftus
//
// Represents a bank account with basic services such as deposit
// and withdraw.
//********************************************************************
import java.text.NumberFormat;

public class Account {
    private final double RATE = 0.035; // interest rate of 3.5%
    private long acctNumber;           // user account's ID
    private double balance;            // current balance of user
    private String name;               // name of user

    //-----------------------------------------------------------------
    // Sets up the account by defining its owner, account number,
    // and initial balance.
    //-----------------------------------------------------------------
    public Account (String name, long acctNumber, double balance) {
        this.name = name;
        this.acctNumber = acctNumber;
        this.balance = balance;
    }

    public Account (String name, long acctNumber) {
        this.name = name;
        this.acctNumber = acctNumber;
        this.balance = 0;
    }

    //-----------------------------------------------------------------
    // Deposits the specified amount into the account. Returns the
    // new balance.
    //-----------------------------------------------------------------
    public double deposit (double amount) {
        this.balance += amount;
        return this.balance;
    }

    //-----------------------------------------------------------------
    // Withdraws the specified amount from the account and applies
    // the fee. Returns the new balance.
    //-----------------------------------------------------------------
    public double withdraw (double amount, double fee) {
        this.balance = this.balance - amount - fee;
        return this.balance;
    }

    //-----------------------------------------------------------------
    // Adds interest to the account and returns the new balance.
    //-----------------------------------------------------------------
    public double addInterest () {
        this.balance += (this.balance * RATE);
        return this.balance;
    }

    //-----------------------------------------------------------------
    // Returns the current balance of the account.
    //-----------------------------------------------------------------
    public double getBalance () {
        return this.balance;
    }

    //-----------------------------------------------------------------
    // Returns a one-line description of the account as a string.
    //-----------------------------------------------------------------
    public String toString () {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return ("User ID: " + this.acctNumber + "\tUser Name: " + this.name + "\tUser Balance: " + fmt.format(this.balance));
    }
}