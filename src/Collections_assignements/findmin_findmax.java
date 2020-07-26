/*Implement singly linked list with following operations Insert and delete last Insert 
and delete front Display FindMin FindMax Delete using position(first node has pos =0) */

package Collections_assignements;
import java.util.Collections;
import java.util.Collections;
import java.util.LinkedList;


public class findmin_findmax {
static LinkedList<Integer> num=new LinkedList<>();

	static void findMin()
	{
		Collections.sort(num);
		System.out.println("The minimum element is "+num);
	}
	
	static void findMax()
	{
		Collections.sort(num);
		System.out.println("The maximum element is "+num);
	}

	public static void main(String[] args) {

		//LinkedList<Integer> num=new LinkedList<>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		System.out.println("The original list created:-");
		for(int i=0;i<num.size();i++)
		{
			
			System.out.print(num.get(i)+" ");
		}
		System.out.println("\n");
		System.out.println("The new list created by adding the values at the beginging and at last:-");
		
		num.addFirst(0);
		num.addLast(7);

		findMax();

		System.out.println("\n");
		
		num.pollFirst();
		num.pollLast();
		num.pollFirst();
		num.pollLast();

		findMin();
			
		
	}

}
