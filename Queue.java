package random;

public class Queue {
	int a[];
	static final int default_size=100;
	int front=0;
	int end=0;
	int size;
	public Queue() {
		size = 0;
		a = new int[100];
		}
	public boolean insert(int val) {
		if(isFull()) {
			System.out.println("Queue full");
			return false;
		}
		size++;
		a[end]=val;
		end=(++end)%(default_size-1);
		return true;
	}
	public int remove() {
		if(isEmpty())
			System.out.print("empty");
		size--;
		int d=a[front];
		front=(++front)%(default_size-1);
		return d;
		
	}
	private boolean isFull() {
		return end==a.length;
	}
	private boolean isEmpty() {
		return end==0;
	}
	public static void main(String[] args) {
		
	}

}
