//WJP to print Fibonacci series using for loop

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number:");
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int add=0, pre=0, result=1;
		
		System.out.println("Fibonacci series: ");
		
		System.out.print(result+" ");
		
		for(int i=0; i<n;i++)
		{
			add=pre;
			
			result= result+add;
			
			pre= result-add;
			
			System.out.print(result+" ");
			
		}
		
	}

}
