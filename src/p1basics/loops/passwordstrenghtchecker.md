# Password Strength Checker - Java Console Application

A Java password manager demonstrating break and continue statements with password validation, generation, and batch analysis.

## Features

- Check individual password strength
- Generate strong random passwords
- Validate multiple passwords in batch
- Real-time strength scoring (Weak/Medium/Strong)
- Skip or exit during batch validation

## Quick Start

**Compile:**
```bash
javac PasswordStrengthChecker.java
```

**Run:**
```bash
java PasswordStrengthChecker
```

## Menu Options

1. **Check Password Strength** - Analyze single password
2. **Generate Strong Password** - Create random secure password (8-20 chars)
3. **Validate Multiple Passwords** - Batch check with summary
4. **Exit** - Close program

## break & continue Concepts

- **break** - Exit main menu loop (option 4) or stop batch validation (type 'exit')
- **continue** - Skip invalid menu choices, spaces in password, or skipped entries (type 'skip')

## Password Criteria

**Strength Score (0-6):**
- Has uppercase letter (+1)
- Has lowercase letter (+1)
- Has digit (+1)
- Has special character (+1)
- Length ≥ 8 (+1)
- Length ≥ 12 (+1)

**Strength Levels:**
- 🔴 **WEAK** (0-2): Missing multiple criteria
- 🟡 **MEDIUM** (3-4): Good but can improve
- 🟢 **STRONG** (5-6): Excellent password

## Sample Run

```
Enter your choice: 1
Enter password to check: MyP@ss123

--- Password Analysis ---
Length: 9
Uppercase: ✓
Lowercase: ✓
Digits: ✓
Special Characters: ✓
Strength: 🟢 STRONG
```

## Generated Password Features

- Length: 8-20 characters (user-defined)
- Guaranteed: 1 uppercase, 1 lowercase, 1 digit, 1 special char
- Shuffled for randomness
- Characters used: A-Z, a-z, 0-9, !@#$%^&*()-_=+

## Batch Validation

Type **'skip'** to skip current password
Type **'exit'** to stop validation early

**Summary shows:**
- Count of strong passwords
- Count of medium passwords
- Count of weak passwords

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
