//Write a method to implement *, - , / operations. You should use only the + operator *
package Interface;

import java.util.Scanner;

public class Immplement_add_operation implements Operations{

	public static void main(String[] args) {

		Immplement_add_operation ob= new Immplement_add_operation();
		
		System.out.println("Enter one number:-");
		
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		
		System.out.println("Enter one number:-");

		int n2=sc.nextInt();
		
		System.out.println("The numbers are:"+ n1 + " "+n2);
		
		ob.Addition(n1, n2);
	}	

	public void Addition(int num1, int num2) {
		int result=0;
		
		result=num1+num2;
		
		System.out.println("The addition of two numbers:-"+result);
		
	}
	public void Subtraction(float num1, float num2) {		
	}

	public void Multiplication(long num1, long num2) {

	}

	public void Division(float num1, float num2) {
	
	}

}
