import java.io.StringReader;

public class main {
    public static void main(String[] args) {
        // Main execution logic
    }

    public static void displayUserDetails(Bank bank) {
        System.out.println("Bank Name: " + bank.BankName);
        System.out.println("User ID: " + bank.userid);
        System.out.println("User Name: " + bank.UserName);
        System.out.println("Account Number: " + bank.accountNumber);
        System.out.println("Account Type: " + bank.accountType);
        System.out.println("Balance: " + bank.balance);
    }
}

class Bank {
    String BankName;
    int userid;
    String UserName;
    long accountNumber;
    String accountType;
    double balance;

    Bank(String BankName, int userid, String UserName, long accountNumber, String accountType, double balance) {
        this.BankName = BankName;
        this.userid = userid;
        this.UserName = UserName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
}