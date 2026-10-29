import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Account {
    private int accNo;
    private String name;
    private double balance;

    static int count;

    static {
        count = 0;
    }

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid amount");

        balance += amount;
        count++;
        System.out.println("Amount Deposited");
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient Balance");

        balance -= amount;
        count++;
        System.out.println("Amount Withdrawn");
    }

    void balanceInquiry() {
        System.out.println("Balance = " + balance);
        count++;
    }

    static void showCount() {
        System.out.println("Total Transactions = " + count);
    }
}

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int no = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        Account a = new Account(no, name, bal);

        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Inquiry");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Enter Amount: ");
                    a.deposit(sc.nextDouble());

                } else if (choice == 2) {
                    System.out.print("Enter Amount: ");
                    a.withdraw(sc.nextDouble());

                } else if (choice == 3) {
                    a.balanceInquiry();

                } else if (choice == 4) {
                    System.out.println("Thank You");

                } else {
                    System.out.println("Invalid Choice");
                }

            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 4);

        Account.showCount();
        sc.close();
    }
}