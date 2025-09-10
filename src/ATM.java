import java.util.Scanner;
public class ATM {
    private static int balance = 0;  // initial balance
    private static final int PIN = 1234;

    // deposit method
    public static void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount! Try again.");
        }
    }

    // withdraw method
    public static void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount! Try again.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    // check balance method
    public static void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PIN Authentication with 3 attempts
        boolean loggedIn = false;
        for (int attempts = 3; attempts > 0; attempts--) {
            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();
            if (enteredPin == PIN) {
                System.out.println("Login successful!");
                loggedIn = true;
                break;
            } else {
                System.out.println("Wrong PIN! Attempts left: " + (attempts - 1));
            }
        }

        if (!loggedIn) {
            System.out.println("Your account is locked.");
            sc.close();
            return;
        }

        // ATM Menu (while loop)
        while (true) {
            System.out.println("\n==== ATM Menu ====");
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Check Balance");
            System.out.println("4) Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    withdraw(withdrawAmount);
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break; // exit menu
                default:
                    System.out.println("Invalid option! Try again.");
                    continue; // skip to next loop iteration
            }

            if (choice == 4) {
                break; // stop the while loop
            }
        }

        sc.close();
    }
}

