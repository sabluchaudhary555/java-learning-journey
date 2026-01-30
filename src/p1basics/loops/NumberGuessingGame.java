package p1basics.loops;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalGames = 0;
        int totalAttempts = 0;
        int[] gameScores = new int[5];

        // do-while loop: Main game loop (plays at least once)
        char playAgain;
        do {
            System.out.println("\n========== NEW GAME ==========");
            int numberToGuess = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessed = false;

            System.out.println("I'm thinking of a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it!");

            // while loop: Game continues while not guessed and attempts remain
            while (!guessed && attempts < maxAttempts) {
                System.out.print("\nAttempt " + (attempts + 1) + ": Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    guessed = true;
                    System.out.println("🎉 Congratulations! You guessed it right!");
                    System.out.println("You took " + attempts + " attempts.");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");

                    // for loop: Show hint dots based on difference
                    int diff = numberToGuess - userGuess;
                    System.out.print("Hint: ");
                    for (int i = 0; i < Math.min(diff / 10, 5); i++) {
                        System.out.print("↑ ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Too high! Try again.");

                    // for loop: Show hint dots based on difference
                    int diff = userGuess - numberToGuess;
                    System.out.print("Hint: ");
                    for (int i = 0; i < Math.min(diff / 10, 5); i++) {
                        System.out.print("↓ ");
                    }
                    System.out.println();
                }

                // Display remaining attempts
                System.out.println("Attempts remaining: " + (maxAttempts - attempts));
            }

            if (!guessed) {
                System.out.println("\n❌ Game Over! The number was: " + numberToGuess);
            }

            // Store game score
            if (totalGames < 5) {
                gameScores[totalGames] = guessed ? attempts : 0;
            }
            totalGames++;
            totalAttempts += attempts;

            System.out.print("\nDo you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        // Game Statistics
        System.out.println("\n========== GAME STATISTICS ==========");
        System.out.println("Total games played: " + totalGames);
        System.out.println("Average attempts per game: " + (totalGames > 0 ? (double)totalAttempts / totalGames : 0));

        // foreach loop: Display scores for each game
        System.out.println("\nYour scores (attempts taken):");
        int gameNum = 1;
        for (int score : gameScores) {
            if (gameNum <= totalGames && gameNum <= 5) {
                if (score > 0) {
                    System.out.println("Game " + gameNum + ": " + score + " attempts ✓");
                } else {
                    System.out.println("Game " + gameNum + ": Failed ✗");
                }
                gameNum++;
            }
        }

        // Nested loop: Display a victory pattern if player won at least once
        boolean wonOnce = false;
        for (int score : gameScores) {
            if (score > 0) {
                wonOnce = true;
                break;
            }
        }

        if (wonOnce) {
            System.out.println("\n🎊 Victory Pattern 🎊");
            // Nested for loops for pattern
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        System.out.println("\nThanks for playing! Goodbye!");
        sc.close();
    }
}


