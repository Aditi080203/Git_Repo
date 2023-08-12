
import java.util.Stack;
public class maxParenthesis {
public static int depth(String exp) {
	Stack<Character> s=new Stack<>();
	int depth=0;
	int maxdepth=0;
	char ch;
	for(int i=0;i<exp.length();i++) {
		ch=exp.charAt(i);
		if(ch=='(') {
			s.push(ch);
			depth++;
		}
		else if(ch==')') {
			s.pop();
			depth--;
		}
		if(depth>maxdepth)
			maxdepth=depth;
	}
	return maxdepth;
}
	public static void main(String[] args) {
		String expn = "((((A)))((((BBB()))))()()()())";
		int value = depth(expn);
		System.out.println("Max depth parenthesis is " + value);
	}

}
