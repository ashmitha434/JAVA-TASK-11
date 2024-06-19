import java.util.Scanner;

public class DevisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the first interger:");
        int numerator = scanner.nextInt();


        System.out.println("Enter the second interger:");
        int denominator = scanner.nextInt();

        try{
            int result =  divide(numerator, denominator);
            System.out.println("Result of division:" + result);

        }catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        scanner.close();

    }
    public static int divide(int numerator, int denominator){
if(denominator == 0){
    throw new ArithmeticException("Division by zero");
    
}
return numerator/denominator;
    }

    
    }



