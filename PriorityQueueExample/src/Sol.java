import java.util.PriorityQueue;

public class Sol {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		pq.add(10);
		pq.add(-1);
		pq.add(20);
		pq.add(5);
		pq.add(-2);
		System.out.println(pq.poll());
		for (int i :pq){
			System.out.println(i);
		}
		
		
		
		
		

	}

}
