import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file path:");
        String filePath = scanner.nextLine();

        try {
            // Attempt to open the file
            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);

            // Read and print the contents of the file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            // Close the file scanner
            fileScanner.close();
        } catch (FileNotFoundException e) {
            // Catch FileNotFoundException if the file does not exist
            System.out.println("File not found: " + e.getMessage());
        } finally {
            // Close the scanner used for user input
            scanner.close();
        }
    }
}

    

