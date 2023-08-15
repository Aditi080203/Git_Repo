package myjava;

public class Wave_form {
	public static void wave(int ar[]) {
		int size=ar.length;
		for(int i=1;i<size;i=i+2) {
			if(ar[i]>ar[i-1]) {
				int l=ar[i];
				ar[i]=ar[i-1];
				ar[i-1]=l;
			}
			if(ar[i]>ar[i+1]) {
				int l=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=l;
			}
		}
		for(int l=0;l<ar.length;l++)
			System.out.print(ar[l]+",");
	}
	public static void main(String[] args) {
		int ar[]= {1,4,2,3,8,6,9};
		wave(ar);
	}

}
