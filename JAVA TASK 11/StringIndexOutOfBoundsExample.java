public class StringIndexOutOfBoundsExample {
        public static void main(String[] args) {
            String str = "Hello";
    
            try {
                // Attempting to access a character at an index beyond the string's length
                char ch = str.charAt(10); // This will throw StringIndexOutOfBoundsException
                System.out.println("Character: " + ch); // This line won't be executed
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Error: String index out of bounds.");
            }
        }
    }
    

