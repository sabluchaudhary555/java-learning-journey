package p1basics.loops;

public class DoWhileLoopExamples {
    public static void main(String[] args) {

        // Example 1: Basic Do-While (Print 1 to 5)
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        System.out.println("\n");

        // Example 2: Do-While runs at least once
        int num = 10;
        do {
            System.out.println("This runs even though condition is false initially");
            num++;
        } while (num < 5);
        System.out.println();

        // Example 3: Sum of digits using do-while
        int number = 1234;
        int sum = 0;
        int temp = number;
        do {
            sum += temp % 10;
            temp /= 10;
        } while (temp > 0);
        System.out.println("Sum of digits of " + number + " is: " + sum);
        System.out.println();

        // Example 4: Reverse a number
        int original = 5678;
        int reversed = 0;
        int revTemp = original;
        do {
            int digit = revTemp % 10;
            reversed = reversed * 10 + digit;
            revTemp /= 10;
        } while (revTemp != 0);
        System.out.println("Reverse of " + original + " is: " + reversed);
        System.out.println();

        // Example 5: Menu driven program simulation
        int choice;
        int counter = 0;
        System.out.println("Simulating menu selection:");
        do {
            System.out.println("Menu option selected: " + (counter + 1));
            counter++;
            choice = (counter == 3) ? 4 : 1; // Simulate exit on 3rd iteration
        } while (choice != 4);
        System.out.println("Exited menu after " + counter + " selections\n");

        // Example 6: Count digits in a number
        int countNum = 9876;
        int digitCount = 0;
        int tempCount = countNum;
        do {
            digitCount++;
            tempCount /= 10;
        } while (tempCount != 0);
        System.out.println("Number of digits in " + countNum + " is: " + digitCount);
        System.out.println();

        // Example 7: Fibonacci series
        int fibTerms = 8;
        int fibFirst = 0, fibSecond = 1;
        int fibCount = 1;
        System.out.print("Fibonacci (" + fibTerms + " terms): ");
        do {
            System.out.print(fibFirst + " ");
            int fibNext = fibFirst + fibSecond;
            fibFirst = fibSecond;
            fibSecond = fibNext;
            fibCount++;
        } while (fibCount <= fibTerms);
        System.out.println("\n");

        // Example 8: Factorial calculation
        int factNum = 5;
        int factCounter = 1;
        long factorial = 1;
        do {
            factorial *= factCounter;
            factCounter++;
        } while (factCounter <= factNum);
        System.out.println("Factorial of " + factNum + " is: " + factorial);
        System.out.println();

        // Example 9: Print multiplication table
        int tableNum = 7;
        int multiplier = 1;
        System.out.println("Multiplication table of " + tableNum + ":");
        do {
            System.out.println(tableNum + " × " + multiplier + " = " + (tableNum * multiplier));
            multiplier++;
        } while (multiplier <= 10);
        System.out.println();

        // Example 10: User input simulation (guessing game)
        int secretNumber = 7;
        int userGuess = 1;
        int attempts = 0;
        System.out.println("Guessing game simulation:");
        do {
            attempts++;
            System.out.println("Attempt " + attempts + ": Guessed " + userGuess);
            userGuess++;
        } while (userGuess != secretNumber);
        System.out.println("Found the secret number " + secretNumber + " in " + attempts + " attempts!");
    }
}