// WJP to Swap two numbers without using third variable, and without using addition operator. 

import java.util.Scanner;



public class swap_without_temp_add {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter numbers to swap:");
		
		Scanner sc = new Scanner(System.in);
		
		int num1=sc.nextInt();
		
		int num2=sc.nextInt();
		
//        num1=num1*num2;
//		
//		num2=num1/num2;
//		
//		num1=num1/num2;	
		
        num1=num1^num2;
		
		num2=num1^num2;
		
		num1=num1^num2;	
		
		System.out.println("The swapped numbers are: ");
		
		System.out.println(num1);
		
		System.out.println(num2);
		
	}

}
