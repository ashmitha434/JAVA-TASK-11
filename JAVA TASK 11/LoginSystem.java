 import java.util.Scanner;

// Custom exception class for incorrect password
class PasswordIncorrectException extends Exception {
    public PasswordIncorrectException(String message) {
        super(message);
    }
}

public class LoginSystem {
    private static final String CORRECT_PASSWORD = "correctPassword";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for password
            System.out.println("Enter password:");
            String password = scanner.nextLine();

            // Check if password is correct
            if (!password.equals(CORRECT_PASSWORD)) {
                throw new PasswordIncorrectException("Incorrect password. Please try again.");
            } else {
                System.out.println("Login successful!");
            }
        } catch (PasswordIncorrectException e) {
            // Catch the specific exception for incorrect password
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


