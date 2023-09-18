public class File2 {
    public static void main(String[] args) {
        // Test cases
        System.out.println(isPowerofTwo(0));    // false
        System.out.println(isPowerofTwo(1));    // true
        System.out.println(isPowerofTwo(2));    // true
        System.out.println(isPowerofTwo(8));    // true
        System.out.println(isPowerofTwo(10));   // false
        System.out.println(isPowerofTwo(16));   // true
    }

    public static boolean isPowerofTwo(long n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n > 2) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }
}
