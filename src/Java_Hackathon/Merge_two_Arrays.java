/*Q26. WJP to merge two sorted array.(Do not use third array) array1[10] = 1,2,4,6,9,10 
array2[4] = 3, 5,7,8 After merge : array1[10] = 1,2,3,4,5,6,7,8,9,10 */

package Java_Hackathon;

import java.util.Scanner;

public class Merge_two_Arrays {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to create one array:");
		
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
		
        System.out.println("Enter another number to create another array:");
		
		int n1=sc.nextInt();
		
		int[] arry=new int[n1];
		
		System.out.println("Enter the elements of array:");
		
		for(int i=0;i<n1;i++)
		{
		    arry[i]=sc.nextInt();			

		}
		System.out.println("The list of array is:-");
		for(int i=0;i<n1;i++)
		{
		    System.out.println(arry[i]);			
		}
		
		int i=0, j=0, k=0;
		
		int len1=a.length, len2=arry.length;
		
		int length=len1+len2;
		
		int arr3[]=new int[length];
		
		while (i<len1 && j<len2) 
        { 
            if (a[i] < arry[j])
            { 
                arr3[k++] = a[i++];
             }
            else
            {
                arr3[k++] = arry[j++];
             }
        } 
      
		while (i < len1) {
			arr3[k++] = a[i++];
		}
		
         while (j < len2) 
         {
        	arr3[k++] = arry[j++]; 
         }
         
         System.out.println("The merge array is :- ");
        for (i=0; i < length; i++)
        {
            System.out.print(arr3[i] + " "); 
        }
		
	}

}