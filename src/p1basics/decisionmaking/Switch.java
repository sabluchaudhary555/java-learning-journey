package p1basics.decisionmaking;

public class Switch {
    public static void main(String[] args) {

        // Example 1: Basic Switch (Number to Day)
        int dayNumber = 3;
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("Day " + dayNumber + " is: " + dayName);

        System.out.println();

        // Example 2: Switch with Multiple Cases (Grade System)
        char grade = 'B';
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'b':
                System.out.println("Good!");
                break;
            case 'C':
            case 'c':
                System.out.println("Average!");
                break;
            case 'D':
            case 'd':
                System.out.println("Below Average!");
                break;
            case 'F':
            case 'f':
                System.out.println("Fail!");
                break;
            default:
                System.out.println("Invalid Grade!");
        }

        System.out.println();

        // Example 3: Switch with String (Voting Eligibility)
        String ageCategory = "Adult";
        switch (ageCategory) {
            case "Child":
                System.out.println("Cannot Vote");
                break;
            case "Teen":
                System.out.println("Cannot Vote");
                break;
            case "Adult":
                System.out.println("Can Vote");
                break;
            case "Senior":
                System.out.println("Can Vote");
                break;
            default:
                System.out.println("Unknown Category");
        }

        System.out.println();

        // Example 4: Switch with Return Value (Calculator)
        int num1 = 10, num2 = 5;
        char operator = '+';
        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid Operator");
        }

        System.out.println();

        // Example 5: Switch with Fall-through (Month Days)
        int month = 2;
        int year = 2024;
        int days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                    days = 29;
                else
                    days = 28;
                break;
            default:
                days = -1;
        }
        System.out.println("Month " + month + " has " + days + " days in year " + year);
    }
}