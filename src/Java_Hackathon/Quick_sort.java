//Q27. WJP to perform ascending order Quick sort *
package Java_Hackathon;

import java.util.Arrays;

import java.util.Scanner;

public class Quick_sort {	
	
	public static void quickSort(int[] arr, int start, int end){
		 
        int partition = partition(arr, start, end);
 
        if(partition-1>start)
        {
            quickSort(arr, start, partition - 1);
        }
        if(partition+1<end) 
        {
            quickSort(arr, partition + 1, end);
        }
    } 
    public static int partition(int[] arr, int start, int end)
    {
        int pivot = arr[end];
        
        for(int i=start; i<end; i++)
        {
            if(arr[i]<pivot)
            {
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        } 
        int temp = arr[start];
        
        arr[start] = pivot;
        
        arr[end] = temp;
 
        return start;
	}
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        
		System.out.println("Enter the number to create one array:");
		
		int n=sc.nextInt();	
		
		int[] a=new int[n];
		
		System.out.println("Enter the elements of array:");	
		
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();			

		}
	        quickSort(a, 0, a.length-1);	
	        
	        System.out.println("The quick sort array:"+Arrays.toString(a));
	    }	    
	}

