//Q4. Given an array of integers check the Palindrome of the series.
package Java_Hackathon;

import java.util.Scanner;

public class Palindrome_NumberSeries {

	public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to create the length of the array list:");
		
		int num=sc.nextInt();
		
		System.out.println("Enter the elements:");
		
		String[] my_array=new String[num];
		
		for(int i=0;i<num;i++)
		{
			my_array[i] = new Integer(sc.nextInt()).toString();

			String reverse="";
			
			for(int j=my_array[i].length()-1;j>=0;j--)
			{
				reverse =reverse + my_array[i].charAt(j);
		    }
			if(my_array[i].equals(reverse))

		    { 
		        System.out.println(my_array[i]+" element of array list is a palindrome.");

		    } 
		    else 
		        System.out.println(my_array[i]+" element of array list is not a palindrome.");
		}
		
	}

}
