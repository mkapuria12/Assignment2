//WJP to check if Number is Positive or Negative using If loop. 

import java.util.Scanner;

public class positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please enter a number:");
		
		int a= sc.nextInt();
		
		if(a>0)
		{
			System.out.println("The number " + a + " is a positive number.");
		}
		else if(a<0)
		{
			System.out.println("The number " + a + " is a negative number.");
			
		} 
		else 
			System.out.println("It is a zero.");		
	}

}
