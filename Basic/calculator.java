package Basic;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter operator: ");
            char ch = sc.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                System.out.println("Enter two operands:");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                if (ch == '+')
                    System.out.println(n1 + n2);
                if (ch == '-')
                    System.out.println(n1 - n2);
                if (ch == '*')
                    System.out.println(n1 * n2);
                if (ch == '/')
                    System.out.println(n1 / n2);
            } else if (ch == 'x' || ch == 'X') {
                break;
            } else
                System.out.println("not valid operator");
        }
        sc.close();
    }
}
