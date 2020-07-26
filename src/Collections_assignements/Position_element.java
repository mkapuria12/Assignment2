//Write a program to get the position of a particular element in an Array List?

package Collections_assignements;

import java.util.ArrayList;

public class Position_element {

	public static void main(String[] args) {

        ArrayList<Double> ad=new ArrayList<>();
		
		ad.add(34.2);
		ad.add(4.2);
		ad.add(30.5);
		ad.add(14.3);
		ad.add(3.21);
		System.out.println("The arraylist:- "+ad);
		System.out.println("The indext of element 14.3 is: "+ad.indexOf(14.3));
		
	
	}

}
