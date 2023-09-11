
public class StringRev {
    public static void main(String[] args) {
        String input = "Hello, World!";

        // Call the reverseWord function and store the result
        String reversed = reverseWord(input);

        // Print the original and reversed strings
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseWord(String str) {
        int n = str.length() - 1;
        String output = "";
        for (int i = n; i >= 0; i--) {
            output += str.charAt(i);
        }
        return output;
    }
}
