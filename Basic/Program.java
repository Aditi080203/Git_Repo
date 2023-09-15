import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().trim();//trim removes extra initial spaces
        System.out.println(s);
        if(s.charAt(0)>='a' && s.charAt(0)<='z')
        System.out.println("LowerCase letter");
        else if(s.charAt(0)>='A' && s.charAt(0)<='Z')
        System.out.println("UpperCase letter");
        else
        System.out.println("Not a letter");
        sc.close();
    }
}
