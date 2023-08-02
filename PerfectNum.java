package ppt;

public class PerfectNum {
	static void perfect(int n) {
		int sum=1;
		if(n==1)
			System.out.println("Not perfect");
		for(int i=2;i<n;i++) {
			if(n%i==0)
				sum=sum+i;
		}
		if(sum==n)
			System.out.println("Perfect");
		else
			System.out.println("Not Perfect oooo!");
	}
	public static void main(String[] args) {
		perfect(33550336);
	}

}
