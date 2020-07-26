//Q:-5. Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers. 
package Java_Hackathon;

import java.util.Arrays;

import java.util.Scanner;

public class Occurrences_Of_Numbers {
	
	public static void main(String[] args)
	{
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
        System.out.println("-----------------------------------------");
        
        Arrays.sort(my_array);
		for(int i=0;i<num;i++)
		{
			int count=1;
			for(int j=i+1;j<num;j++)
			{
				if (my_array[j]==my_array[j-1])
				{
					count ++;
					i++;
				}
				else
					break;		
			}
			if(count==1)
			{
				System.out.println("the "+ my_array[i]+" is unique no");
			}
			else
			{
				System.out.println("The occurence of "+my_array[i]+" is "+count);
			}
		}
		System.out.println("the array is "+ Arrays.toString(my_array));
	}
}
