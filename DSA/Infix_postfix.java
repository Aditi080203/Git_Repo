
import java.util.Stack;
public class Infix_postfix {
	public static int precedence(char x) {
		if (x == '(')
			return (0);
		if (x == '+' || x == '-')
			return (1);
		if (x == '*' || x == '/' || x == '%')
			return (2);
		if (x == '^')
			return (3);
		return (4);
		}
	public static String infixToPostfix(String expn) {
		String output = "";
		char[] out = infixToPostfix(expn.toCharArray());
		for (char ch : out)
			output = output + ch;
		return output;
		}
	public static char[] infixToPostfix(char[] expn) {
		Stack<Character> stk = new Stack<Character>();
		String output = "";
		char out;
		for (char ch : expn) {
			if (ch <= '9' && ch >= '0')
				output = output + ch;
			else {
				switch (ch) {
				case '+':
				case '-':
				case '*':
				case '/':
				case '%':
				case '^':
					while (stk.isEmpty() == false && precedence(ch) <=precedence(stk.peek())) {
						out = stk.pop();
						output = output + " " + out;
						}
					stk.push(ch);
					output = output + " ";
					break;
				case '(':
					stk.push(ch);
					break;
				case ')':
					while (stk.isEmpty() == false && (out = stk.pop()) != '(')
						output = output + " " + out + " ";
						break;
						}
				}
			}
		while (stk.isEmpty() == false) {
			out = stk.pop();
			output = output + out + " ";
		}
		return output.toCharArray();
		}
	public static void main(String[] args) {
		String expn = "10+((3))*5/(16-4)";
		String value = infixToPostfix(expn);
		System.out.println("Infix Expn: " +expn);
		System.out.println("Postfix Expn: " + value);
		}
	

}
