package p1basics.decisionmaking;

public class TernaryOperatorExamples {
    public static void main(String[] args) {

        // Example 1: Basic Ternary (Even or Odd)
        int num1 = 15;
        String result1 = (num1 % 2 == 0) ? "Even" : "Odd";
        System.out.println(num1 + " is " + result1);

        System.out.println();

        // Example 2: Ternary with Assignment (Max of Two)
        int a = 25, b = 30;
        int max = (a > b) ? a : b;
        System.out.println("Maximum between " + a + " and " + b + " is: " + max);

        System.out.println();

        // Example 3: Nested Ternary (Grade System)
        int marks = 85;
        String grade = (marks >= 90) ? "A+" :
                (marks >= 80) ? "A" :
                        (marks >= 70) ? "B" :
                                (marks >= 60) ? "C" : "F";
        System.out.println("Marks: " + marks + " → Grade: " + grade);

        System.out.println();

        // Example 4: Ternary with Different Data Types
        int age = 17;
        String status = (age >= 18) ? "Adult" : "Minor";
        boolean canVote = (age >= 18) ? true : false;
        System.out.println("Age: " + age + " → Status: " + status + " → Can Vote: " + canVote);

        System.out.println();

        // Example 5: Ternary in Print Statement
        int number = -5;
        System.out.println(number + " is " + ((number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero"));
    }
}