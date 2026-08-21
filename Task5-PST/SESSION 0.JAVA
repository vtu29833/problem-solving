import java.util.Scanner;

class SimpleBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        int choice;

        do {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposited $" + deposit);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrew $" + withdraw);
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.println("Current Balance: $" + balance);
                    break;

                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
OUTPUT:
--- BANK MENU ---
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter choice: 1
Enter deposit amount: 10000
Deposited $10000.0

--- BANK MENU ---
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter choice: 2
Enter withdrawal amount: 5000
Withdrew $5000.0

--- BANK MENU ---
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter choice: 3
Current Balance: $5000.0

--- BANK MENU ---
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter choice: 4
Exiting system. Goodbye!

=== Code Execution Successful ===
