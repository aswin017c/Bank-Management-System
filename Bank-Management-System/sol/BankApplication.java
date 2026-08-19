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

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Display Complete Details");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account Summary");
            System.out.println("6. Check Minimum Balance");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n=== Bank Details ===");
                    bankAccount.displayBankDetails();

                    System.out.println("\n=== User Details ===");
                    bankAccount.displayUserDetails();

                    System.out.println("\n=== Account Details ===");
                    bankAccount.displayAccountDetails();
                    break;

                case 2:
                    System.out.print("Enter the deposit amount: ");
                    double depositAmount = input.nextDouble();

                    boolean depositStatus = bankAccount.deposit(depositAmount);

                    if (depositStatus) {
                        System.out.println("Deposit successful.");
                        System.out.println(
                                "Updated Balance: "
                                        + bankAccount.checkBalance());
                    } else {
                        System.out.println(
                                "Deposit failed. Enter a valid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the withdrawal amount: ");
                    double withdrawalAmount = input.nextDouble();

                    boolean withdrawalStatus = bankAccount.withdraw(withdrawalAmount);

                    if (withdrawalStatus) {
                        System.out.println("Withdrawal successful.");
                        System.out.println(
                                "Updated Balance: "
                                        + bankAccount.checkBalance());
                    } else {
                        System.out.println(
                                "Withdrawal failed. Check the amount and balance.");
                    }
                    break;

                case 4:
                    double currentBalance = bankAccount.checkBalance();

                    System.out.println(
                            "Current Balance: " + currentBalance);
                    break;

                case 5:
                    String accountSummary = bankAccount.createAccountSummary();

                    System.out.println("\n=== Account Summary ===");
                    System.out.println(accountSummary);
                    break;

                case 6:
                    System.out.print(
                            "Enter the required minimum balance: ");
                    double minimumBalance = input.nextDouble();

                    boolean minimumBalanceStatus = bankAccount.hasMinimumBalance(minimumBalance);

                    if (minimumBalanceStatus) {
                        System.out.println(
                                "Minimum balance is maintained.");
                    } else {
                        System.out.println(
                                "Minimum balance is not maintained.");
                    }
                    break;

                case 0:
                    System.out.println(
                            "Thank you for using the banking application.");
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please select a valid option.");
            }

        } while (choice != 0);

        input.close();
    }
}