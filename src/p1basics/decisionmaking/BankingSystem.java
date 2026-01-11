package p1basics.decisionmaking;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Account details
        String accountHolder = "John Doe";
        int pin = 1234;
        double balance = 5000.0;
        int age = 25;
        boolean isPremiumMember = true;

        System.out.println("===== WELCOME TO ABC BANK =====\n");

        // Login validation (Nested if)
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            System.out.println("Login Successful!");
            System.out.println("Account Holder: " + accountHolder);

            // Age verification for certain services (if statement)
            if (age < 18) {
                System.out.println("Note: Minor account - Limited services available");
            }

            // Display balance with membership status (Ternary operator)
            String memberType = isPremiumMember ? "Premium" : "Regular";
            System.out.println("Membership: " + memberType);
            System.out.println("Current Balance: ₹" + balance);

            System.out.println("\n===== BANKING MENU =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Apply for Loan");
            System.out.println("5. Exit");
            System.out.println("========================");

            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();

            // Menu selection (Switch statement)
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();

                    // Validation (if-else)
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposit Successful!");
                        System.out.println("New Balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();

                    // Nested if for withdrawal validation
                    if (withdrawAmount > 0) {
                        if (withdrawAmount <= balance) {
                            // Transaction fee based on membership (Ternary)
                            double fee = isPremiumMember ? 0 : 10;
                            double totalDeduction = withdrawAmount + fee;

                            if (totalDeduction <= balance) {
                                balance -= totalDeduction;
                                System.out.println("Withdrawal Successful!");
                                System.out.println("Amount Withdrawn: ₹" + withdrawAmount);
                                System.out.println("Transaction Fee: ₹" + fee);
                                System.out.println("New Balance: ₹" + balance);
                            } else {
                                System.out.println("Insufficient balance for fee!");
                            }
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Account Details ---");
                    System.out.println("Balance: ₹" + balance);

                    // Balance status using if-else-if ladder
                    if (balance >= 10000) {
                        System.out.println("Status: Excellent");
                    } else if (balance >= 5000) {
                        System.out.println("Status: Good");
                    } else if (balance >= 1000) {
                        System.out.println("Status: Average");
                    } else {
                        System.out.println("Status: Low Balance");
                    }
                    break;

                case 4:
                    System.out.print("Enter loan amount: ₹");
                    double loanAmount = sc.nextDouble();

                    // Loan eligibility (Nested if + if-else-if ladder)
                    if (age >= 21) {
                        if (balance >= 3000) {
                            // Loan approval based on amount
                            if (loanAmount <= 50000) {
                                System.out.println("Loan Approved!");
                                System.out.println("Interest Rate: 8%");
                            } else if (loanAmount <= 100000) {
                                // Premium members get better rates (Ternary)
                                String rate = isPremiumMember ? "9%" : "10%";
                                System.out.println("Loan Approved!");
                                System.out.println("Interest Rate: " + rate);
                            } else {
                                System.out.println("Loan amount too high!");
                            }
                        } else {
                            System.out.println("Insufficient balance! Minimum ₹3000 required.");
                        }
                    } else {
                        System.out.println("Age must be 21+ for loan eligibility.");
                    }
                    break;

                case 5:
                    System.out.println("\nThank you for banking with us!");
                    System.out.println("Logging out...");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1-5.");
                    break;
            }

        } else {
            System.out.println("Incorrect PIN! Access Denied.");
        }

        System.out.println("\n================================");
        sc.close();
    }
}