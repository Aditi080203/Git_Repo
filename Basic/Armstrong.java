package Basic;

public class Armstrong {
    static boolean isArmstrong(int n) {
        int num = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        return num == sum;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i))
                System.out.println(i);
        }
    }
}
