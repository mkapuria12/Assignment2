// Q:-2  write a program to find factorial (Non Recursive) 

package Java_Hackathon;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		 
		int num1=sc.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=num1;i++)
		{
			fact *= i;
		}
		System.out.println("The factorial of the number "+num1+" is "+fact);
	}

}
