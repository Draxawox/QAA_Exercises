package exercises;

import java.util.ArrayList;
import java.util.Objects;

public class Exercise45Banking {
    public static void start() {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Adelaide", false);
    }
}


class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
        addBranch(name);

    }

    public boolean addBranch(String name) {
        boolean unique = true;
        for (Branch branch : branches) {
            if (branch.getName().equals(name)) {
                unique = false;
                break;
            }
        }
        if (unique) {
            branches.add(new Branch(name));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {

        if (findBranch(branchName) != null) {
            return findBranch(branchName).newCustomer(customerName, transaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        boolean exists = findBranch(branchName) != null;
        if (exists) {
            return Objects.requireNonNull(findBranch(branchName)).addCustomerTransaction(customerName, transaction);
        }
        return false;
    }


    private Branch findBranch(String branchName) {
        for (Branch branch : this.branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction) {

        if (findBranch(branchName) != null) {
            System.out.println("Customer details for branch " + branchName);
            for (int i = 0; i < findBranch(branchName).getCustomers().size(); i++) {
                if (printTransaction) {
                    System.out.println("Customer: " + findBranch(branchName).getCustomers().get(i).getName() + "[" + (i + 1) + "]");
                    System.out.println("Transactions");
                    for (int j = 0; j < findBranch(branchName).getCustomers().get(i).getTransactions().size(); j++) {
                        System.out.println(
                                "[" + (j + 1) + "]  Amount " + findBranch(branchName).getCustomers().get(i).getTransactions().get(j)
                        );
                    }
                } else {
                    System.out.println("Customer: " + findBranch(branchName).getCustomers().get(i).getName() + "[" + (i + 1) + "]");
                }
            }
            return true;
        }
        return false;
    }

}

class Customer {
    private String name;
    private ArrayList <Double> transactions;

    public Customer(String name, double transaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }

}
class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }


    private Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    public boolean newCustomer(String name, double transaction) {

        if (findCustomer(name) == null) {
            this.customers.add(new Customer(name, transaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        for (Customer customer : this.customers) {
            if (customer.getName().equals(customerName)) {
                customer.addTransaction(transaction);
                return true;
            }
        }
        return false;
    }

}