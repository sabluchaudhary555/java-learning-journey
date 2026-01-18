# Banking System - Java Console Application

A Java banking system demonstrating decision-making structures: if-else, nested if, switch, ternary operators, and if-else-if ladders.

## Features

- PIN authentication
- Deposit/Withdraw money
- Check balance with status
- Loan application system
- Premium membership benefits

## Quick Start

**Compile:**
```bash
javac BankingSystem.java
```

**Run:**
```bash
java BankingSystem
```

## Default Login
- **PIN:** 1234
- **Balance:** ₹5000
- **Membership:** Premium

## Menu Options

1. **Deposit** - Add money to account
2. **Withdraw** - Remove money (₹10 fee for regular, ₹0 for premium)
3. **Check Balance** - View balance and status
4. **Apply for Loan** - Get loan (requires age 21+, balance ₹3000+)
5. **Exit** - Logout

## Decision-Making Concepts

- **if-else** - Validation and error handling
- **Nested if** - Withdrawal and loan eligibility
- **if-else-if ladder** - Balance status categories
- **Switch** - Menu selection
- **Ternary** - Membership type and fees

## Business Rules

**Transaction Fees:**
- Premium: ₹0
- Regular: ₹10

**Balance Status:**
- ₹10,000+ = Excellent
- ₹5,000-₹9,999 = Good
- ₹1,000-₹4,999 = Average
- Below ₹1,000 = Low

**Loan Eligibility:**
- Age: 21+
- Min Balance: ₹3,000
- Max Loan: ₹100,000
- Interest: 8-10% based on amount and membership

## Requirements

- Java JDK 8+
- Standard library only

---
## License

Developed by SSoft.in

---