package challenges.section6;

import java.sql.SQLOutput;

public class Challenge1 {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;

    public Challenge1() {
    }

    public Challenge1(long accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    private String phoneNumber;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFounds(double amount) {
        if (amount <= 0) {
            System.out.println("Wrong amount");
        } else {
            System.out.println("Adding: " + amount);
            setBalance(amount);
            System.out.println("Your balance: " + getBalance());
        }
    }

    public void withdrawFounds(double amount) {
        if (amount <= 0) {
            System.out.println("Wrong amount");
        } else if (amount > getBalance()) {
            System.out.println("Not enough money");
        } else {
            System.out.println("Withdrawing: " + amount);
            setBalance(getBalance() - amount);
            System.out.println(getBalance() + " left");
        }
    }
}

class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this.name = "No name";
        this.creditLimit = 1;
        this.email = "No email";
    }

    public VipCustomer(String name, double creditLimit) {
        this.name = name;
        this.email = "No email";
        this.creditLimit = 1;
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
}
