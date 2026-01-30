package p2datastr.method;

public class VarargsExamples {

    // 1. BASIC VARARGS - SUM OF NUMBERS
    public static int sum(int... numbers) {
        int total = 0;
        System.out.print("Sum of " + numbers.length + " numbers: ");
        for(int num : numbers) {
            total += num;
            System.out.print(num + " ");
        }
        System.out.println("= " + total);
        return total;
    }

    // 2. VARARGS WITH REGULAR PARAMETERS
    public static void printList(String title, String... items) {
        System.out.println("\n" + title + ":");
        if(items.length == 0) {
            System.out.println("  (No items)");
            return;
        }

        for(int i = 0; i < items.length; i++) {
            System.out.println("  " + (i+1) + ". " + items[i]);
        }
    }

    // 3. FIND MAXIMUM USING VARARGS
    public static int findMax(int... numbers) {
        if(numbers.length == 0) {
            System.out.println("No numbers provided!");
            return Integer.MIN_VALUE;
        }

        int max = numbers[0];
        for(int num : numbers) {
            if(num > max) {
                max = num;
            }
        }
        System.out.print("Maximum of ");
        for(int num : numbers) System.out.print(num + " ");
        System.out.println("is: " + max);
        return max;
    }

    // 4. AVERAGE CALCULATION WITH VARARGS
    public static double average(double... numbers) {
        if(numbers.length == 0) return 0.0;

        double sum = 0;
        for(double num : numbers) {
            sum += num;
        }

        double avg = sum / numbers.length;
        System.out.printf("Average of %d numbers: %.2f\n", numbers.length, avg);
        return avg;
    }

    // 5. CONCATENATE STRINGS WITH SEPARATOR
    public static String concatenate(String separator, String... strings) {
        if(strings.length == 0) return "";

        StringBuilder result = new StringBuilder(strings[0]);
        for(int i = 1; i < strings.length; i++) {
            result.append(separator).append(strings[i]);
        }

        System.out.println("Concatenated: " + result.toString());
        return result.toString();
    }

    // 6. METHOD OVERLOADING WITH VARARGS
    public static void printInfo(String name) {
        System.out.println("\nSingle name: " + name);
    }

    public static void printInfo(String... names) {
        System.out.print("\nMultiple names (" + names.length + "): ");
        for(String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    // 7. VARARGS WITH DIFFERENT CALLING METHODS
    public static void processNumbers(int... nums) {
        System.out.print("Processing " + nums.length + " numbers: ");
        for(int n : nums) System.out.print(n + " ");
        System.out.println();
    }

    // MAIN METHOD TO TEST ALL EXAMPLES
    public static void main(String[] args) {
        System.out.println("=== VARARGS EXAMPLES ===\n");

        // 1. Different number of arguments
        sum();                     // No arguments
        sum(10);                   // One argument
        sum(1, 2, 3);              // Three arguments
        sum(1, 2, 3, 4, 5, 6, 7); // Seven arguments

        // 2. String lists
        printList("Fruits", "Apple", "Banana", "Cherry");
        printList("Colors", "Red", "Green", "Blue", "Yellow");
        printList("Empty List");  // No items

        // 3. Find maximum
        findMax(5);
        findMax(10, 20, 5, 35, 15);

        // 4. Calculate average
        average(10.5, 20.5, 30.5);
        average(85.0, 92.5, 78.0, 88.5);

        // 5. Concatenate strings
        concatenate(", ", "Java", "Python", "C++", "JavaScript");
        concatenate(" - ", "Start", "Middle", "End");

        // 6. Method overloading
        printInfo("Alice");
        printInfo("Bob", "Charlie", "David");

        // 7. Different ways to call varargs
        processNumbers(1, 2, 3);              // Direct values
        processNumbers(new int[]{4, 5, 6});   // Array
        processNumbers();                     // Empty
    }
}