//Q6. WJP to perform ascending order Selection sort *

package Java_Hackathon;

import java.util.Arrays;

import java.util.Scanner;

public class Ascending_order_Selection_sort {
	
	void printArray(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	void sort(int[] arr)
	{
		int n=arr.length;
		int min_arr;
		int temp=0;
		
		for(int i=0;i<n-1;i++)
		{
			min_arr=i;
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min_arr])
				{
					min_arr=j;
				}
			}
			
			temp=arr[min_arr];
			arr[min_arr]=arr[i];
			arr[i]=temp;

}
	}
	
	public static void main(String[] args) {
		
		Ascending_order_Selection_sort ss=new Ascending_order_Selection_sort();	
		
		 System.out.println("Enter a number to give a length of an array:");
			
	     Scanner sc=new Scanner(System.in);
	     
	     int num=sc.nextInt();
	     
	     int[] arr=new int[num];
	     
	     System.out.println("Enter an element of an array:-");
	     
	     for(int i=0;i<num;i++)
	     {
	    	 System.out.println("Add element:-");
	    	 
	    	 arr[i]=sc.nextInt();
	     }
	     
	     ss.printArray(arr);
	     
	     System.out.println("The sorted array by selection sort:");
	     
	     ss.sort(arr); 
	     
	     ss.printArray(arr);
			
		}	
		
}
