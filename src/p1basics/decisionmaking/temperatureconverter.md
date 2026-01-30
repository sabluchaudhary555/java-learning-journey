# Temperature Converter - Java Console Application

A Java program demonstrating switch statements and if-else validation for converting temperatures between Celsius, Fahrenheit, and Kelvin.

## Features

- Convert between 3 temperature scales (6 conversion options)
- Input validation for Kelvin (cannot be negative)
- Menu-driven interface using switch statement
- Clear formatted output

## Quick Start

**Compile:**
```bash
javac TemperatureConverter.java
```

**Run:**
```bash
java TemperatureConverter
```

## Conversion Options

1. **Celsius → Fahrenheit** - (C × 9/5) + 32
2. **Celsius → Kelvin** - C + 273.15
3. **Fahrenheit → Celsius** - (F - 32) × 5/9
4. **Fahrenheit → Kelvin** - (F - 32) × 5/9 + 273.15
5. **Kelvin → Celsius** - K - 273.15
6. **Kelvin → Fahrenheit** - (K - 273.15) × 9/5 + 32
7. **Exit** - Close program

## Decision-Making Concepts

- **Switch statement** - Menu selection (cases 1-7)
- **if-else** - Kelvin validation (negative check)
- **Default case** - Invalid input handling

## Sample Run

```
Enter your choice (1-7): 1
Enter temperature in Celsius: 25
25.0°C = 77.0°F
```

## Validation Rules

- Kelvin cannot be negative (absolute zero = 0 K)
- Invalid menu choices are caught by default case
- Numeric input required for temperature values

## Requirements

- Java JDK 8+
- Standard library only

<br>
<br>
**Happy Learning! 🚀**

*Contributions and suggestions are welcome!*

---

**Maintained by: [Sablu Chaudhary](https://github.com/sabluchaudhary555)** 🔗 **Connect with me:** [LinkedIn](https://www.linkedin.com/in/sablu-chaudhary555/) | [GitHub](https://github.com/sabluchaudhary555) | [SSoft.in](https://ssoft.in/)

---
**Made with ❤️ for the Open Source Community**
