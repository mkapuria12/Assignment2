//Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements. 
package Java_Hackathon;
import java.util.Scanner;
public class Binary_search {	
	int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 

            if (arr[mid] == x) 
                return mid; 

            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 

            return binarySearch(arr, mid + 1, r, x); 
        }  
        return -1; 
    }   
    public static void main(String args[]) 
    { 
    	Binary_search bs=new Binary_search();
    	
    	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int n=sc.nextInt();
		
		int[] a=new int[n];
		
		System.out.println("Enter the elements of array:");
		
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();			
		}
		System.out.println("The list of array is:-");
		for(int i=0;i<n;i++)
		{
		    System.out.println(a[i]);			
		}	
		int len=a.length;
				
		System.out.println("Enter a number which is an element of an array list:");
		
		int num=sc.nextInt();
		
		int result = bs.binarySearch(a, 0, len - 1, num); 
		
		if (result == -1) 
          System.out.println("Element not present"); 
      else
          System.out.println("Element found at index " + result); 
		
    }
    }
