import java.util.Scanner;

// Custom exception class for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for age
            System.out.println("Enter your age:");
            int age = scanner.nextInt();

            // Check if age is less than 18
            if (age < 18) {
                throw new InvalidAgeException("You must be at least 18 years old.");
            } else {
                System.out.println("Age validation successful!");
            }
        } catch (InvalidAgeException e) {
            // Catch the specific exception for invalid age
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Catch any other unexpected exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

    
