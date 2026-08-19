import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter bank name: ");
        String bankName = input.nextLine();

        System.out.print("Enter user ID: ");
        int userId = input.nextInt();
        input.nextLine();

        System.out.print("Enter user name: ");
        String userName = input.nextLine();

        System.out.print("Enter account number: ");
        long accountNumber = input.nextLong();
        input.nextLine();

        System.out.print("Enter account type: ");
        String accountType = input.nextLine();

        System.out.print("Enter opening balance: ");
        double balance = input.nextDouble();

        Bank bankAccount = new Bank(
                bankName,
                userId,
                userName,
                accountNumber,
                accountType,
                balance);

        System.out.println("\n=== Bank Details ===");
        bankAccount.displayBankDetails();

        System.out.println("\n=== User Details ===");
        bankAccount.displayUserDetails();

        System.out.println("\n=== Account Details ===");
        bankAccount.displayAccountDetails();

        System.out.println("\n=== Account Summary ===");
        String accountSummary = bankAccount.createAccountSummary();
        System.out.println(accountSummary);

        System.out.print("\nEnter the required minimum balance: ");
        double minimumBalance = input.nextDouble();

        boolean result = bankAccount.hasMinimumBalance(minimumBalance);

        if (result) {
            System.out.println("Minimum balance is maintained.");
        } else {
            System.out.println("Minimum balance is not maintained.");
        }

        input.close();
    }
}