package p1basics.loops;

public class NestedLoop {
    public static void main(String[] args) {

        // Example 1: Basic Nested Loop (Pattern 1)
        System.out.println("Pattern 1: Square Pattern");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Example 2: Right Triangle Pattern
        System.out.println("Pattern 2: Right Triangle");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Example 3: Multiplication Table
        System.out.println("Pattern 3: Multiplication Table (1-5)");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // Example 4: Number Pyramid
        System.out.println("Pattern 4: Number Pyramid");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Example 5: Reverse Triangle
        System.out.println("Pattern 5: Reverse Triangle");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Example 6: Box with Numbers
        System.out.println("Pattern 6: Box with Numbers");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
        System.out.println();

        // Example 7: Hollow Square
        System.out.println("Pattern 7: Hollow Square");
        int size = 5;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Example 8: Diamond Pattern
        System.out.println("Pattern 8: Diamond Pattern (Half)");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Example 9: Nested While Loop
        System.out.println("Pattern 9: Nested While Loop");
        int a = 1;
        while (a <= 3) {
            int b = 1;
            while (b <= 3) {
                System.out.print("(" + a + "," + b + ") ");
                b++;
            }
            System.out.println();
            a++;
        }
        System.out.println();

        // Example 10: Cross Pattern
        System.out.println("Pattern 10: Cross Pattern");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}