# Number Guessing Game - Java Console Application

A Java game demonstrating all loop types: for, while, do-while, foreach, and nested loops with interactive gameplay.

## Features

- Guess random number between 1-100
- 7 attempts per game
- Visual hints (↑↓ arrows) based on difference
- Multiple rounds with statistics
- Victory pattern display
- Score tracking for up to 5 games

## Quick Start

**Compile:**
```bash
javac NumberGuessingGame.java
```

**Run:**
```bash
java NumberGuessingGame
```

## How to Play

1. Program generates random number (1-100)
2. You have 7 attempts to guess it
3. Get hints: "Too low" or "Too high" with arrow indicators
4. Win by guessing correctly or lose after 7 attempts
5. Play multiple rounds and view statistics

## Loop Concepts Demonstrated

- **do-while loop** - Main game loop (plays at least once)
- **while loop** - Game continues until guessed or attempts exhausted
- **for loop** - Display hint arrows based on difference
- **foreach loop** - Display scores for each game
- **Nested loops** - Victory pattern (star pyramid)
- **break statement** - Exit loop when number guessed

## Game Features

**Hint System:**
- Shows ↑ arrows if guess is too low
- Shows ↓ arrows if guess is too high
- Number of arrows indicates how far off (max 5)

**Statistics Tracking:**
- Total games played
- Average attempts per game
- Individual game scores (✓ won / ✗ failed)

**Victory Pattern:**
```
* 
* * 
* * * 
* * * * 
* * * * * 
```

## Sample Run

```
I'm thinking of a number between 1 and 100.
You have 7 attempts to guess it!

Attempt 1: Enter your guess: 50
Too low! Try again.
Hint: ↑ ↑ ↑ 
Attempts remaining: 6

Attempt 2: Enter your guess: 75
🎉 Congratulations! You guessed it right!
You took 2 attempts.

Do you want to play again? (y/n): y
```

## Game Rules

- Random number: 1-100
- Maximum attempts: 7
- Tracks up to 5 games in statistics
- Can play unlimited rounds

## Requirements

- Java JDK 8+
- Standard library only (Scanner, Random)

<br>
<br>
**Happy Learning! 🚀**

*Contributions and suggestions are welcome!*

---

**Maintained by: [Sablu Chaudhary](https://github.com/sabluchaudhary555)** 🔗 **Connect with me:** [LinkedIn](https://www.linkedin.com/in/sablu-chaudhary555/) | [GitHub](https://github.com/sabluchaudhary555) | [SSoft.in](https://ssoft.in/)

---
**Made with ❤️ for the Open Source Community**
