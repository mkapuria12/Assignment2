package Java_Hackathon;

import java.util.Scanner;

public class Sorting_Array_inGroup {
	
	static void reverse(int my_array[], int n, int k) 
    { 
        for (int i = 0; i < n; i += k) 
        { 
            int left = i; 

            int right = Math.min(i + k - 1, n - 1); 
            
            int temp; 
              
            while (left < right) 
            { 
                temp=my_array[left]; 
                my_array[left]=my_array[right]; 
                my_array[right]=temp; 
                left+=1; 
                right-=1; 
            } 
        } 
    } 
      
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
        
        int k = 3; 
      
        int n = my_array.length; 
      
        reverse(my_array, n, k); 
      
        for (int i = 0; i < n; i++) 
            System.out.print(my_array[i] + " "); 
    } 
} 


