package p1basics.decisionmaking;

public class IfElseStatementExamples {
    public static void main(String[] args) {

        // Example 1: Basic if-else (Number Comparison)
        int n = 10;
        if (n > 5) {
            System.out.println("The number is greater than 5");
        } else {
            System.out.println("The number is 5 or less");
        }

        System.out.println();

        // Example 2: Even or Odd
        int num = 7;
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        System.out.println();

        // Example 3: Pass or Fail
        int marks = 45;
        if (marks >= 50) {
            System.out.println("Result: PASS (Marks: " + marks + ")");
        } else {
            System.out.println("Result: FAIL (Marks: " + marks + ")");
        }

        System.out.println();

        // Example 4: Voting Eligibility
        int age = 16;
        if (age >= 18) {
            System.out.println("✅ You are eligible to vote");
            System.out.println("Age: " + age + " >= 18");
        } else {
            System.out.println("❌ You are NOT eligible to vote");
            System.out.println("Age: " + age + " < 18");
            System.out.println("Wait for " + (18 - age) + " more years");
        }

        System.out.println();

        // Example 5: Positive, Negative or Zero
        int number = -5;
        if (number > 0) {
            System.out.println(number + " is POSITIVE");
        } else {
            System.out.println(number + " is NOT POSITIVE");
            if (number < 0) {
                System.out.println("Specifically, it is NEGATIVE");
            } else {
                System.out.println("Specifically, it is ZERO");
            }
        }

        System.out.println();

        // Example 6: Maximum of Two Numbers
        int a = 25;
        int b = 30;
        int max;
        if (a > b) {
            max = a;
            System.out.println(a + " is greater than " + b);
        } else {
            max = b;
            System.out.println(b + " is greater than or equal to " + a);
        }
        System.out.println("Maximum value: " + max);

        System.out.println();

        // Example 7: Divisibility Check
        int value = 17;
        if (value % 5 == 0) {
            System.out.println(value + " is divisible by 5");
            System.out.println("Quotient: " + (value / 5));
        } else {
            System.out.println(value + " is NOT divisible by 5");
            System.out.println("Remainder: " + (value % 5));
        }

        System.out.println();

        // Example 8: String Comparison
        String password = "secret123";
        String input = "secret123";
        if (password.equals(input)) {
            System.out.println("✅ Password is CORRECT");
            System.out.println("Access granted!");
        } else {
            System.out.println("❌ Password is INCORRECT");
            System.out.println("Access denied!");
        }

        System.out.println();

        // Example 9: Leap Year Check
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a LEAP YEAR");
        } else {
            System.out.println(year + " is NOT a LEAP YEAR");
        }

        System.out.println();

        // Example 10: Discount Calculation
        double purchaseAmount = 1200.0;
        double finalAmount;
        if (purchaseAmount > 1000) {
            double discount = purchaseAmount * 0.10;
            finalAmount = purchaseAmount - discount;
            System.out.println("Original Price: ₹" + purchaseAmount);
            System.out.println("Discount (10%): ₹" + discount);
            System.out.println("Final Price: ₹" + finalAmount);
        } else {
            finalAmount = purchaseAmount;
            System.out.println("Original Price: ₹" + purchaseAmount);
            System.out.println("No discount applied");
            System.out.println("Final Price: ₹" + finalAmount);
        }
    }
}