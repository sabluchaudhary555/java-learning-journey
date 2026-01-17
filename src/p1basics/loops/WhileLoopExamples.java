package p1basics.loops;

public class WhileLoopExamples {
    public static void main(String[] args) {

        // Example 1: Basic While Loop (Print 1 to 5)
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        // Example 2: Reverse While Loop (Print 5 to 1)
        int j = 5;
        while (j >= 1) {
            System.out.print(j + " ");
            j--;
        }
        System.out.println("\n");

        // Example 3: Sum of Digits
        int num = 12345;
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits of " + num + " is: " + sum);
        System.out.println();

        // Example 4: Reverse a Number
        int original = 1234;
        int reversed = 0;
        int numToReverse = original;
        while (numToReverse != 0) {
            int digit = numToReverse % 10;
            reversed = reversed * 10 + digit;
            numToReverse /= 10;
        }
        System.out.println("Reverse of " + original + " is: " + reversed);
        System.out.println();

        // Example 5: Count Digits in a Number
        int countNum = 987654;
        int digitCount = 0;
        int tempCount = countNum;
        while (tempCount != 0) {
            digitCount++;
            tempCount /= 10;
        }
        System.out.println("Number of digits in " + countNum + " is: " + digitCount);
        System.out.println();

        // Example 6: Palindrome Check
        int palindromeNum = 12321;
        int originalNum = palindromeNum;
        int reverseNum = 0;
        while (palindromeNum != 0) {
            reverseNum = reverseNum * 10 + palindromeNum % 10;
            palindromeNum /= 10;
        }
        System.out.println(originalNum + " is " + (originalNum == reverseNum ? "Palindrome" : "Not Palindrome"));
        System.out.println();

        // Example 7: Armstrong Number Check
        int armstrongNum = 153;
        int tempArm = armstrongNum;
        int armstrongSum = 0;
        int digits = String.valueOf(armstrongNum).length();
        while (tempArm != 0) {
            int digit = tempArm % 10;
            armstrongSum += Math.pow(digit, digits);
            tempArm /= 10;
        }
        System.out.println(armstrongNum + " is " + (armstrongSum == armstrongNum ? "Armstrong" : "Not Armstrong"));
        System.out.println();

        // Example 8: Fibonacci with While
        int fibTerms = 10;
        int fibFirst = 0, fibSecond = 1;
        int fibCount = 1;
        System.out.print("Fibonacci (" + fibTerms + " terms): ");
        while (fibCount <= fibTerms) {
            System.out.print(fibFirst + " ");
            int fibNext = fibFirst + fibSecond;
            fibFirst = fibSecond;
            fibSecond = fibNext;
            fibCount++;
        }
        System.out.println("\n");

        // Example 9: Factorial with While
        int factNum = 6;
        int factCount = 1;
        long factorial = 1;
        while (factCount <= factNum) {
            factorial *= factCount;
            factCount++;
        }
        System.out.println("Factorial of " + factNum + " is: " + factorial);
        System.out.println();

        // Example 10: Prime Check with While
        int primeNum = 17;
        int divisor = 2;
        boolean isPrime = true;
        while (divisor <= primeNum / 2) {
            if (primeNum % divisor == 0) {
                isPrime = false;
                break;
            }
            divisor++;
        }
        System.out.println(primeNum + " is " + (isPrime ? "Prime" : "Not Prime"));
    }
}