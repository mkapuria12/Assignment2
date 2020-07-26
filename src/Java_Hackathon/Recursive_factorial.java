//Q28. WJP to find factorial of a number using recursion *
package Java_Hackathon;

import java.util.Scanner;

public class Recursive_factorial {

static int fact_result=1;
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the number: ");
 
        int num = sc.nextInt();
		
        fact(num);
	
		System.out.print("The factorial of given number is :"+fact_result);
	}
	
	static void fact(int n)
	{
		if(n!=0)
		{
		fact_result =fact_result * n;
		n--;
		fact(n);
		}
		
	}
}
