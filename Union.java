
import java.util.*;
public class Union {
	static void distinct(int a[], int b[]) {
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++)
			hs.add(a[i]);
		for(int j=0;j<b.length;j++)
			hs.add(b[j]);
		System.out.println("Distinct elements in union of array is:"+hs.size());
		System.out.println("Distinct elements:"+hs);
	}
	public static void main(String[] args) {
		int a[]= {1,4,7,3,6,13,18};
		int b[]= {2,6,5,9,16,21,4};
		distinct(a,b);

	}

}
