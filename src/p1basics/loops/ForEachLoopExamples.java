package p1basics.loops;

public class ForEachLoopExamples {
    public static void main(String[] args) {

        // Example 1: Iterating over integer array
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Example 2: Sum of array elements
        int[] values = {5, 10, 15, 20, 25};
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        System.out.println("Sum of array elements: " + sum);
        System.out.println();

        // Example 3: Finding maximum in array
        int[] array = {45, 12, 78, 23, 56, 89, 34};
        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Maximum element in array: " + max);
        System.out.println();

        // Example 4: String array iteration
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        System.out.println("Fruits in basket:");
        for (String fruit : fruits) {
            System.out.println("• " + fruit);
        }
        System.out.println();

        // Example 5: 2D array iteration
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("2D Array elements:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Example 6: Count even numbers in array
        int[] nums = {12, 7, 18, 5, 24, 9, 30};
        int evenCount = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);
        System.out.println();

        // Example 7: Character array
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        System.out.print("Vowels: ");
        for (char vowel : vowels) {
            System.out.print(vowel + " ");
        }
        System.out.println("\n");

        // Example 8: Double array - calculate average
        double[] temperatures = {25.5, 28.3, 22.8, 30.1, 26.7};
        double total = 0;
        for (double temp : temperatures) {
            total += temp;
        }
        double average = total / temperatures.length;
        System.out.println("Average temperature: " + average);
        System.out.println();

        // Example 9: Search element in array
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        String searchName = "Charlie";
        boolean found = false;
        for (String name : names) {
            if (name.equals(searchName)) {
                found = true;
                break;
            }
        }
        System.out.println(searchName + " is " + (found ? "found" : "not found") + " in the array");
        System.out.println();

        // Example 10: Modify array elements (creates new array)
        int[] original = {1, 2, 3, 4, 5};
        System.out.print("Squared values: ");
        for (int num : original) {
            int squared = num * num;
            System.out.print(squared + " ");
        }
    }
}