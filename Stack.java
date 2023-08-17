package random;

public class Stack {
	int a[];
	int capacity;
	int top;
	Stack(int size){
		a=new int[size];
		capacity=size;
		top=-1;
	}
	public void push(int data ) {
		if(top==capacity-1)
			System.out.println("Overflow");
		else
			a[++top]=data;
	}
	public void print() {
		for(int i=0;i<=top;i++)
			System.out.print(a[i]+",");
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public static void main(String[] args) {
		Stack s= new Stack(4);
		s.isEmpty();
		s.push(1);
		s.push(3);
		s.push(2);
		s.push(4);
		s.print();
		
		
	}

}
