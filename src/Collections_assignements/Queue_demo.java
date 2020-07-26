package Collections_assignements;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_demo {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(3);
		System.out.println(q);
//		System.out.println(q.peek());
//		System.out.println(q);
//		int eleQu = q.poll();  
//		System.out.println("After poll "+q+", Got polled : "+eleQu);
//		System.out.println(q.peek());
	}

}
