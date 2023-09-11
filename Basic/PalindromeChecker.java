public class PalindromeChecker {
    public static boolean isPalindrome(int number) {
        String numStr = String.valueOf(number);
        
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        
        return numStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        int num1 = 121;

        if (isPalindrome(num1)) {
            System.out.println(num1 + " is a palindrome.");
        } else {
            System.out.println(num1 + " is not a palindrome.");
        }
        
    }
}
