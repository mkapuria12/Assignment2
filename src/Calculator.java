// WJP to make a calculator using switch case in Java(Include all arithmetic operators +,-,* and /)

import java.util.Scanner;

 
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		
		for(int i=0;i<4;i++)
		{
			
            System.out.println("Please Enter numbers to calculate:");
			
			int a= sc.nextInt();
			
			int b= sc.nextInt();
			
			
			System.out.println("Please Enter number from 1 to 4:");
				
			int n= sc.nextInt();
			
			
			switch(n)
			{
			
			case 1:
			    System.out.println("The addition of these values is "+(a+b));
			    break;
			
			case 2:
			    System.out.println("The subtration of these values is "+(a-b));	
			    break;
			
			case 3:
			    System.out.println("The multiplication of these values is "+(a*b));
			    break;
			
			case 4:
				System.out.println("The division of these values is "+(a/b));
				break;
				
			default :
			System.out.println("Enter correct numer");
			   
				
			
			}
			
		}
			
		
	}

}
