package p1basics.loops;

public class Break {
    public static void main(String[] args) {

        // Example 1: Basic break in for loop
        System.out.println("Example 1: Break when number equals 5");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Example 2: Break in while loop
        System.out.println("Example 2: Break in while loop (sum > 20)");
        int sum = 0;
        int num = 1;
        while (num <= 10) {
            sum += num;
            if (sum > 20) {
                break;
            }
            num++;
        }
        System.out.println("Sum: " + sum + ", Last number added: " + (num - 1));
        System.out.println();

        // Example 3: Break in nested loops
        System.out.println("Example 3: Break in nested loops");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i * j == 6) {
                    break;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        System.out.println();

        // Example 4: Break with label
        System.out.println("Example 4: Break with label (outer loop)");
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outerLoop;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        System.out.println();

        // Example 5: Break in for-each loop
        System.out.println("Example 5: Break in for-each loop");
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        for (int number : numbers) {
            if (number > 50) {
                break;
            }
            System.out.print(number + " ");
        }
        System.out.println("\n");

        // Example 6: Break in do-while loop
        System.out.println("Example 6: Break in do-while loop");
        int counter = 0;
        do {
            counter++;
            if (counter == 4) {
                break;
            }
            System.out.print(counter + " ");
        } while (counter <= 10);
        System.out.println("\n");

        // Example 7: Searching in array
        System.out.println("Example 7: Searching number in array");
        int[] array = {12, 23, 34, 45, 56, 67, 78};
        int search = 45;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                found = true;
                System.out.println("Found " + search + " at index " + i);
                break;
            }
        }
        if (!found) {
            System.out.println(search + " not found in array");
        }
        System.out.println();

        // Example 8: Break with switch (though rarely used)
        System.out.println("Example 8: Break in switch statement");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }
        System.out.println();

        // Example 9: Prime number check with break
        System.out.println("Example 9: Prime check with break optimization");
        int number = 17;
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(number + " is " + (isPrime ? "Prime" : "Not Prime"));
        System.out.println();

        // Example 10: Break with labeled while loop
        System.out.println("Example 10: Break with label in while loop");
        int x = 1;
        outer:
        while (x <= 3) {
            int y = 1;
            while (y <= 3) {
                System.out.println("x=" + x + ", y=" + y);
                if (x == 2 && y == 2) {
                    break outer;
                }
                y++;
            }
            x++;
        }
    }
}