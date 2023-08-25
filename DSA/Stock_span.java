package random;
import java.util.Stack;
public class Stock_span {
	public static int[] span(int[] ar) {
		int s[]=new int[ar.length];
		s[0]=1;
		for(int i=1;i<ar.length;i++) {
			s[i]=1;
			for(int j=i-1;(j>=0) && (ar[i]>=ar[j]);j--)
				s[i]++;
		}
		return s;
	}
	public static int[] stock(int[] ar) {
		Stack<Integer> st=new Stack<>();
		int s[]=new int[ar.length];
		st.push(0);
		for (int i = 1; i < ar.length; i++) {
			while (!st.isEmpty() && ar[st.peek()] < ar[i])
				st.pop();
			s[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek());
			st.push(i);
			}
			return s;
			}
	public static void main(String[] args) {
		int[] arr = { 6, 5, 4, 3, 2, 4, 5, 7, 9 };
		int stock[]=stock(arr);
		for (int i=0;i<arr.length;i++)
			System.out.print(stock[i]+" ");
	}

}
