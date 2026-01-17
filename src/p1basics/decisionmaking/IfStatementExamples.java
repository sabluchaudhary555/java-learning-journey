package p1basics.decisionmaking;

public class IfStatementExamples {
    public static void main(String[] args) {

        // Example 1: Basic if statement
        int age = 20;
        if (age >= 18) {
            System.out.println("✅ You are eligible to vote.");
            System.out.println("Age: " + age + " >= 18");
        }

        System.out.println();

        // Example 2: If with else
        int number = 15;
        if (number % 2 == 0) {
            System.out.println(number + " is EVEN number.");
        } else {
            System.out.println(number + " is ODD number.");
        }

        System.out.println();

        // Example 3: If-else if-else ladder
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade: A+ (Marks: " + marks + ")");
        } else if (marks >= 80) {
            System.out.println("Grade: A (Marks: " + marks + ")");
        } else if (marks >= 70) {
            System.out.println("Grade: B (Marks: " + marks + ")");
        } else if (marks >= 60) {
            System.out.println("Grade: C (Marks: " + marks + ")");
        } else {
            System.out.println("Grade: F (Marks: " + marks + ")");
        }

        System.out.println();

        // Example 4: Nested if statement
        int personAge = 19;
        boolean hasVoterID = true;
        if (personAge >= 18) {
            System.out.println("Age check passed: " + personAge + " >= 18");
            if (hasVoterID) {
                System.out.println("✅ You can vote with Voter ID.");
            } else {
                System.out.println("❌ You need Voter ID to vote.");
            }
        } else {
            System.out.println("❌ You must be 18+ to vote.");
        }

        System.out.println();

        // Example 5: If with logical operators
        int a = 10, b = 20, c = 15;
        if (a > 0 && b > 0 && c > 0) {
            System.out.println("All numbers are positive.");
        }
        if (a > 15 || b > 15 || c > 15) {
            System.out.println("At least one number > 15");
        }
        boolean isRaining = false;
        if (!isRaining) {
            System.out.println("Weather is clear. You can go out.");
        }
    }
}