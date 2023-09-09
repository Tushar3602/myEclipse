import java.util.Scanner;
import java.util.Vector;

public class BankAccount {
    private int accNo;
    private String name;
    private double balance;
    
    public BankAccount(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
    
    public int getAccNo() {
        return accNo;
    }
    
    public String getName() {
        return name;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public static void main(String[] args) {
        Vector<BankAccount> accounts = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add Account");
            System.out.println("2. Search Account");
            System.out.println("3. Delete Account");
            System.out.println("4. Display Accounts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = scanner.nextInt();
                    System.out.print("Enter Account Holder Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Account Balance: ");
                    double balance = scanner.nextDouble();
                    accounts.add(new BankAccount(accNo, name, balance));
                    System.out.println("Account added successfully!");
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    accNo = scanner.nextInt();
                    boolean found = false;
                    for (BankAccount account : accounts) {
                        if (account.getAccNo() == accNo) {
                            System.out.println("Account Holder Name: " + account.getName());
                            System.out.println("Account Balance: " + account.getBalance());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = scanner.nextInt();
                    found = false;
                    for (BankAccount account : accounts) {
                        if (account.getAccNo() == accNo) {
                            accounts.remove(account);
                            System.out.println("Account deleted successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found!");
                    }
                    break;
                case 4:
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts found!");
                    } else {
                        System.out.println("Account Details:");
                        for (BankAccount account : accounts) {
                            System.out.println("Account Number: " + account.getAccNo());
                            System.out.println("Account Holder Name: " + account.getName());
                            System.out.println("Account Balance: " + account.getBalance());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}