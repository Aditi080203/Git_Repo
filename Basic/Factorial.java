public class Factorial {
    public static void main(String[] args) {
        int number = 5; 
        long factorial = calculateFac(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long calculateFac(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFac(n - 1);
        }
    }
}
