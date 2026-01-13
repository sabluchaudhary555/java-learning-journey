package p1basics.loops;

public class Continue {
    public static void main(String[] args) {

        // Example 1: Skip even numbers
        System.out.println("Example 1: Print odd numbers from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Example 2: Skip specific value in array
        System.out.println("Example 2: Skip number 5 in array");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int num : numbers) {
            if (num == 5) {
                continue;
            }
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Example 3: Skip vowels in string
        System.out.println("Example 3: Print consonants only");
        String text = "Hello World";
        for (char ch : text.toCharArray()) {
            if ("AEIOUaeiou".contains(String.valueOf(ch))) {
                continue;
            }
            System.out.print(ch + " ");
        }
        System.out.println("\n");

        // Example 4: Continue in nested loops
        System.out.println("Example 4: Skip when sum equals 5");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i + j == 5) {
                    continue;
                }
                System.out.println("i=" + i + ", j=" + j + ", sum=" + (i + j));
            }
        }
        System.out.println();

        // Example 5: Continue with while loop
        System.out.println("Example 5: Skip numbers divisible by 3");
        int i = 1;
        while (i <= 10) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        // Example 6: Skip negative numbers in sum
        System.out.println("Example 6: Sum only positive numbers");
        int[] values = {10, -5, 20, -3, 30, -8, 40};
        int sum = 0;
        for (int value : values) {
            if (value < 0) {
                continue;
            }
            sum += value;
        }
        System.out.println("Sum of positive numbers: " + sum);
        System.out.println();

        // Example 7: Continue in do-while loop
        System.out.println("Example 7: Skip numbers ending with 7");
        int num = 1;
        do {
            if (num % 10 == 7) {
                num++;
                continue;
            }
            System.out.print(num + " ");
            num++;
        } while (num <= 20);
        System.out.println("\n");

        // Example 8: Skip specific words in array
        System.out.println("Example 8: Skip 'skip' words");
        String[] words = {"apple", "skip", "banana", "skip", "cherry", "date"};
        for (String word : words) {
            if (word.equals("skip")) {
                continue;
            }
            System.out.print(word + " ");
        }
        System.out.println("\n");

        // Example 9: Process only valid scores
        System.out.println("Example 9: Process only valid scores (0-100)");
        int[] scores = {85, -10, 92, 105, 78, 0, 95};
        int validCount = 0;
        for (int score : scores) {
            if (score < 0 || score > 100) {
                continue;
            }
            validCount++;
            System.out.println("Valid score " + validCount + ": " + score);
        }
        System.out.println("Total valid scores: " + validCount);
        System.out.println();

        // Example 10: Skip multiples of both 2 and 3
        System.out.println("Example 10: Skip numbers divisible by both 2 and 3");
        for (int n = 1; n <= 20; n++) {
            if (n % 2 == 0 && n % 3 == 0) {
                continue;
            }
            System.out.print(n + " ");
        }
    }
}