package p1basics.decisionmaking;

public class NestedIfElse {
    public static void main(String[] args) {

        // Example 1: Blood Donation Eligibility
        int age = 25;
        double weight = 65.5;

        if (age >= 18) {
            if (weight >= 50.0) {
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("You must weigh at least 50 kg");
            }
        } else {
            System.out.println("You must be at least 18 years old");
        }

        System.out.println(); // Blank line for separation

        // Example 2: Grade System
        int marks = 85;

        if (marks >= 50) {
            if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 80) {
                System.out.println("Grade: B");
            } else {
                System.out.println("Grade: C");
            }
        } else {
            System.out.println("Fail");
        }

        System.out.println(); // Blank line for separation

        // Example 3: Login Validation
        String username = "admin";
        String password = "pass123";

        if (username.equals("admin")) {
            if (password.equals("pass123")) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Incorrect Password");
            }
        } else {
            System.out.println("User not found");
        }

        System.out.println(); // Blank line for separation

        // Example 4: Complex Nested If-Else (Score Evaluation)
        int score = 75;
        boolean hasCertificate = true;

        if (score >= 60) {
            System.out.println("Passed minimum score requirement");
            if (score >= 90) {
                System.out.println("Category: Excellent");
                if (hasCertificate) {
                    System.out.println("Status: Eligible for advanced placement");
                } else {
                    System.out.println("Status: Need certificate for advanced placement");
                }
            } else if (score >= 80) {
                System.out.println("Category: Very Good");
                if (hasCertificate) {
                    System.out.println("Status: Eligible for intermediate course");
                }
            } else if (score >= 70) {
                System.out.println("Category: Good");
                if (hasCertificate) {
                    System.out.println("Status: Eligible for basic course");
                } else {
                    System.out.println("Status: Complete certificate requirement");
                }
            } else {
                System.out.println("Category: Satisfactory");
                System.out.println("Status: Need improvement");
            }
        } else {
            System.out.println("Failed: Score below minimum requirement");
        }

        System.out.println(); // Blank line for separation

        // Example 5: Traffic Light System
        String lightColor = "yellow";
        boolean isEmergencyVehicle = false;
        int distanceToIntersection = 20;

        if (lightColor.equals("green")) {
            System.out.println("GO: Proceed through intersection");
        } else if (lightColor.equals("yellow")) {
            if (distanceToIntersection < 30) {
                System.out.println("CAUTION: Proceed with care");
            } else {
                System.out.println("PREPARE TO STOP: Too far to cross safely");
            }

            if (isEmergencyVehicle) {
                System.out.println("EMERGENCY: Clearing intersection");
            }
        } else if (lightColor.equals("red")) {
            if (isEmergencyVehicle) {
                System.out.println("EMERGENCY: Proceed with caution");
            } else {
                System.out.println("STOP: Wait for green light");
                if (distanceToIntersection < 10) {
                    System.out.println("WARNING: Too close! Brake carefully");
                }
            }
        } else {
            System.out.println("ERROR: Invalid traffic light color");
        }
    }
}