// Q12. Write a program to check palindrome (MalayalaM) for both numbers and string? 
package Java_Hackathon;

import java.util.Scanner;

public class Palindrome_numbers_string {
	
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);	
        
		System.out.println("Enter a string:");	
		
		String str=sc.nextLine();		
		
		String str1=str.toLowerCase();	
		
		char[] c_str=str1.toCharArray();	
		
		String rev="";
		
			for(int j=c_str.length-1;j>=0;j--)
			{
				 rev=rev+c_str[j];
			}		
		if(str1.equalsIgnoreCase(rev))
		{
			System.out.println("The string is Palindrome.");
		}
		else
			System.out.println("The string is not Palindrome.");
		
		System.out.println("--------------------------------------------------------------------------------------------------");
       System.out.println("Enter another  string which contains a digit:");	
       
		String str_num=sc.nextLine();		
		
		String str_num1=str_num.toLowerCase();	
		
		char[] c_str_num=str_num1.toCharArray();
		
		String reverse="";		
		
			for(int j=c_str_num.length-1;j>=0;j--)
			{
				reverse=reverse+c_str_num[j];
			}		
		if(str_num1.equalsIgnoreCase(reverse))
		{
			System.out.println("The string is Palindrome.");
		}
		else
			System.out.println("The string is not Palindrome.");
		
		


	}

}
