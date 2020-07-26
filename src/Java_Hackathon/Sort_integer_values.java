//Q:-3 Given an array of integers, sort the integer values. 

package Java_Hackathon;

import java.util.Scanner;

public class Sort_integer_values {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to create the length of the array list:");
		
		int num=sc.nextInt();
		
		System.out.println("Enter the elements:");
		
		int[] my_array=new int[num];
		
		for(int i=0;i<num;i++)
		{
			System.out.print("Add an element:");
			
			System.out.println();
			
			my_array[i]=sc.nextInt();
		}
		System.out.println("The array list:");
		
		for(int i=0;i<my_array.length;i++)
		{
			System.out.println(my_array[i]);
		}
		int temp=0;
		
		for(int i=0;i<my_array.length;i++)
		{
			for(int j=i+1;j<my_array.length;j++)
			{
				if(my_array[i]>my_array[j])
				{
					temp=my_array[i];
					
					my_array[i]=my_array[j];
					
					my_array[j]=temp;
				}
			}
		}
		System.out.println("**********************");
		
		System.out.println("The sorted array list is given below:");
		
		for(int i=0;i<my_array.length;i++)
		{
			System.out.println(my_array[i]);
		}
	}

}
