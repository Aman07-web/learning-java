package Encapsulation;
class Aman{
    private String accountName;
    private int balance;

    public void setDetails(String accountName, int intialBalance){
        this.accountName=accountName;
        if(intialBalance >= 0){
            this.balance=intialBalance;
        }
        else{
            System.out.println("Invalid balance");
            this.balance=0;
        }
    }
    // depost
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
       // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdraw amount!");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountName;
    }
}
public class Bank {
    public static void main(String[] args) {
        Aman p1=new Aman();
        p1.deposit(500);
        p1.deposit(900);
        p1.withdraw(890);
        System.out.println("Final balance "+p1.getBalance());
    }
}
