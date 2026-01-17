package p1basics.loops;
import java.util.Scanner;
import java.util.Random;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Main menu loop
        while (true) {
            System.out.println("\n========== PASSWORD MANAGER ==========");
            System.out.println("1. Check Password Strength");
            System.out.println("2. Generate Strong Password");
            System.out.println("3. Validate Multiple Passwords");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            // break: Exit the program
            if (choice == 4) {
                System.out.println("Thank you for using Password Manager!");
                break;
            }

            switch (choice) {
                case 1:
                    checkPasswordStrength(sc);
                    break;
                case 2:
                    generatePassword(sc, rand);
                    break;
                case 3:
                    validateMultiplePasswords(sc);
                    break;
                default:
                    // continue: Skip invalid menu option and restart loop
                    System.out.println("Invalid choice! Please try again.");
                    continue;
            }
        }

        sc.close();
    }

    // Method to check password strength
    public static void checkPasswordStrength(Scanner sc) {
        System.out.print("\nEnter password to check: ");
        String password = sc.nextLine();

        int score = 0;
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

        // Check minimum length
        if (password.length() < 6) {
            System.out.println("❌ Password too short! Minimum 6 characters required.");
            return;
        }

        // Loop through each character
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // continue: Skip spaces in password
            if (ch == ' ') {
                System.out.println("⚠️  Warning: Spaces found in password at position " + (i+1));
                continue;
            }

            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }

        // Calculate strength score
        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;
        if (hasSpecial) score++;
        if (password.length() >= 8) score++;
        if (password.length() >= 12) score++;

        // Display results
        System.out.println("\n--- Password Analysis ---");
        System.out.println("Length: " + password.length());
        System.out.println("Uppercase: " + (hasUpper ? "✓" : "✗"));
        System.out.println("Lowercase: " + (hasLower ? "✓" : "✗"));
        System.out.println("Digits: " + (hasDigit ? "✓" : "✗"));
        System.out.println("Special Characters: " + (hasSpecial ? "✓" : "✗"));

        // Display strength
        if (score <= 2) {
            System.out.println("Strength: 🔴 WEAK");
        } else if (score <= 4) {
            System.out.println("Strength: 🟡 MEDIUM");
        } else {
            System.out.println("Strength: 🟢 STRONG");
        }
    }

    // Method to generate strong password
    public static void generatePassword(Scanner sc, Random rand) {
        System.out.print("\nEnter desired password length (8-20): ");
        int length = sc.nextInt();

        // Validate length
        if (length < 8 || length > 20) {
            System.out.println("Invalid length! Using default length of 12.");
            length = 12;
        }

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%^&*()-_=+";
        String allChars = upper + lower + digits + special;

        StringBuilder password = new StringBuilder();

        // Ensure at least one of each type
        password.append(upper.charAt(rand.nextInt(upper.length())));
        password.append(lower.charAt(rand.nextInt(lower.length())));
        password.append(digits.charAt(rand.nextInt(digits.length())));
        password.append(special.charAt(rand.nextInt(special.length())));

        // Fill remaining length
        for (int i = 4; i < length; i++) {
            password.append(allChars.charAt(rand.nextInt(allChars.length())));
        }

        // Shuffle the password
        char[] passArray = password.toString().toCharArray();
        for (int i = passArray.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            char temp = passArray[i];
            passArray[i] = passArray[j];
            passArray[j] = temp;
        }

        System.out.println("\n🔐 Generated Strong Password: " + new String(passArray));
    }

    // Method to validate multiple passwords
    public static void validateMultiplePasswords(Scanner sc) {
        System.out.print("\nHow many passwords do you want to validate? ");
        int count = sc.nextInt();
        sc.nextLine();

        int strongCount = 0;
        int mediumCount = 0;
        int weakCount = 0;

        // Loop through multiple passwords
        for (int i = 1; i <= count; i++) {
            System.out.print("\nEnter password " + i + " (or type 'skip' to skip): ");
            String password = sc.nextLine();

            // continue: Skip this iteration if user types 'skip'
            if (password.equalsIgnoreCase("skip")) {
                System.out.println("⏭️  Skipping password " + i);
                continue;
            }

            // break: Stop validation if password is 'exit'
            if (password.equalsIgnoreCase("exit")) {
                System.out.println("🛑 Stopping validation process.");
                break;
            }

            // Check password criteria
            boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
            int score = 0;

            // continue: Skip if password is too short
            if (password.length() < 6) {
                System.out.println("❌ Password " + i + " rejected: Too short!");
                weakCount++;
                continue;
            }

            // Analyze password
            for (int j = 0; j < password.length(); j++) {
                char ch = password.charAt(j);

                if (Character.isUpperCase(ch)) hasUpper = true;
                else if (Character.isLowerCase(ch)) hasLower = true;
                else if (Character.isDigit(ch)) hasDigit = true;
                else if (ch != ' ') hasSpecial = true;
            }

            if (hasUpper) score++;
            if (hasLower) score++;
            if (hasDigit) score++;
            if (hasSpecial) score++;
            if (password.length() >= 8) score++;

            // Categorize
            if (score <= 2) {
                System.out.println("Password " + i + ": 🔴 WEAK");
                weakCount++;
            } else if (score <= 4) {
                System.out.println("Password " + i + ": 🟡 MEDIUM");
                mediumCount++;
            } else {
                System.out.println("Password " + i + ": 🟢 STRONG");
                strongCount++;
            }
        }

        // Summary
        System.out.println("\n========== SUMMARY ==========");
        System.out.println("Strong Passwords: " + strongCount);
        System.out.println("Medium Passwords: " + mediumCount);
        System.out.println("Weak Passwords: " + weakCount);
    }
}