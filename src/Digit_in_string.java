// Find a string contains only digits in the string

import java.util.Scanner;

public class Digit_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string:");
		
		String str=sc.nextLine();
		
		System.out.print("The string is:- "+str);
		
		System.out.println();
		
		int l=str.length();
		
		int count=0;
			
		for(int i=0;i<=str.length()-1;i++)
		{			
			if(str.matches("[0-9]+"))
			{
				count++;
			}
	    }
		if(l==count)
		{
			System.out.println("The given string contains only digits.");
		}
		else
			System.out.println("The given string does not contain only digits.");
	}
}
