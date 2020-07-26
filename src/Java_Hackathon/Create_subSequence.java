//Q10. What is String subSequence method? *

package Java_Hackathon;

import java.util.Scanner;

public class Create_subSequence {

	public static void main(String[] args) {

		    Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a string.");
			
			String str=sc.nextLine();
			
			System.out.println("The subSequence of the string:-"+str.subSequence(4, 12));
			
	}

}
