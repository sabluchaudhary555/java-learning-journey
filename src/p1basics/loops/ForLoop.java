package p1basics.loops;

public class ForLoop {
    public static void main(String[] args) {

        // Example 1: Basic For Loop (Print Numbers 1 to 5)
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Example 2: Reverse For Loop (Print Numbers 5 to 1)
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Example 3: For Loop with Step (Print Even Numbers 2 to 10)
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Example 4: Sum of First N Natural Numbers
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
        System.out.println();

        // Example 5: Multiplication Table
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " × " + i + " = " + (num * i));
        }
        System.out.println();

        // Example 6: Count Even Numbers in Range
        int start = 10, end = 30;
        int evenCount = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even numbers between " + start + " and " + end + ": " + evenCount);
        System.out.println();

        // Example 7: Pattern Printing (Right Triangle)
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Example 8: Factorial Calculation
        int number = 5;
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
        System.out.println();

        // Example 9: Prime Number Check
        int checkNum = 13;
        boolean isPrime = true;
        for (int i = 2; i <= checkNum / 2; i++) {
            if (checkNum % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(checkNum + " is " + (isPrime ? "Prime" : "Not Prime"));
        System.out.println();

        // Example 10: Fibonacci Series
        int terms = 10;
        int first = 0, second = 1;
        System.out.print("Fibonacci series (" + terms + " terms): ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
