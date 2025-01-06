import java.util.Scanner;
class Bank {
    private String name;
    private int accountNo;
    private String accountType;
    private int balance;
    private String branch;
    private static int totalAmount = 0;
    Scanner sc = new Scanner(System.in);
    public Bank(String name, String accountType, int accountNo, int balance, String branch) {
        this.name = name;
        this.accountType = accountType;
        this.accountNo = accountNo;
        this.branch = branch;
        this.balance = balance;
        totalAmount += balance;
    }
    public void deposit() {
        System.out.println("Enter the amount to deposit : ");
        int x = sc.nextInt();
        balance += x;
        totalAmount += x;
    }
    public void withdraw() {
        System.out.println("Enter the amount to withdraw : ");
        int x = sc.nextInt();
        String s = accountType.toUpperCase();
        String n = "SAVING ACCOUNT";
        if (s.equals(n)) {
            if (x > balance || (balance - x) < 5000) {
                System.out.println("In-sufficient Amount");
            } else {
                balance -= x;
                totalAmount -= x;
                System.out.println("Withdraw succesfully " + x);
                System.out.println("Remain amount : " + balance);
            }
        } else {
            if (x > balance || (balance - x) < 1000) {
                System.out.println("In-sufficient Amount");
            } else {
                balance -= x;
                totalAmount -= x;
                System.out.println("Withdraw successfully " + x);
                System.out.println("Remain amount : " + balance);
            }
        }
    }
    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Account No. : " + accountNo);
        System.out.println("Account Type : " + accountType);
        System.out.println("Balance : " + balance);
        System.out.println("Branch : " + branch);
    }
    public static void totalDeposit() {
        System.out.println("Total amount : " + totalAmount);
    }
}
class Oops16Main{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        Oops16Main ac = new Oops16Main();
        Bank obj = ac.openAccount();
        obj.displayInfo();
        obj.withdraw();
        obj.deposit();
        Bank.totalDeposit();
    }
    public Bank openAccount() {
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        int balance = 0;
        System.out.println("Select Type of Account\n1. Current Account\n2. Saving Account");
        int x = sc.nextInt();
        String type;
        if (x == 1) {
            type = "Current Account";
        } else {
            type = "Saving Account";
        }
        System.out.println("Enter Account No");
        int accNo = sc.nextInt();
        if (x == 1) {
            System.out.println("Enter Amount to deposite min-1000");
            int amount = sc.nextInt();

            if (amount < 1000) {
                System.out.println("Deposite amount should more the 1000");
                System.exit(0);
            } else {
                balance = amount;
            }
        } else {
            System.out.println("Enter Amount to deposite min-5000");
            int amount = sc.nextInt();
            if (amount < 5000) {
                System.out.println("Deposite amount should more the 5000");
                System.exit(0);
            } else {
                balance = amount;
            }
        }
        System.out.println("Enter branch name");
        String branch = sc.next();
        Bank obj = new Bank(name, type, accNo, balance, branch);
        return obj;
    }
}
