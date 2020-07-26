/*Stack Implementation Implement generic stack Find factorial of given number using single stack 
Reverse the given string using stack Implement the dynamic stack */

package Collections_assignements;

import java.util.*;

	public class factorial_reverese_string {	

	    public static void main(String args[]) 
	    { 
	    	Scanner sc=new Scanner(System.in);
	    	
	    	System.out.println("Enter a number:");
	    	
	    	int num=sc.nextInt();
	    		 	
	    	Stack<Integer> st1 = new Stack<Integer>();
	    	
			st1.push(1);
			
			Integer f=1;
			
			for(int i=num;i>=1;i--)
			{
				 f=st1.push(st1.pop()*i);	
			}     
			System.out.println("The factorial of this given number is :- "+f);
	    } 
	} 
