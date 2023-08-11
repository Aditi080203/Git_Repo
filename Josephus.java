package random;
import java.util.Deque;
import java.util.LinkedList;
public class Josephus {
	public static int find(int numPeople, int elimination) {
		if(numPeople<=0|| elimination<=0)
			throw new IllegalArgumentException("no of people and elimination step should be positive");
		Deque<Integer> circle=new LinkedList<>();
		for(int i=1;i<numPeople;i++)
			circle.addLast(i);
		while(circle.size()>1) {
			for(int i=1;i<elimination;i++)
				circle.addLast(circle.removeFirst());
			circle.removeFirst();
		}
		return circle.getFirst();
	}
	public static void main(String[] args) {
		int numPeople = 8;
        int eliminationStep = 4;
        int survivor = find(numPeople, eliminationStep);
        System.out.println("The last remaining person is at position: " + survivor);
	}

}
