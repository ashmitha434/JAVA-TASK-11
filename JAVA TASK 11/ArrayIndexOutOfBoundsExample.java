public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            // Attempting to access an index beyond the array's bounds
            int value = arr[3]; // This will throw ArrayIndexOutOfBoundsException
            System.out.println("Value: " + value); // This line won't be executed
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        }
    }
}
