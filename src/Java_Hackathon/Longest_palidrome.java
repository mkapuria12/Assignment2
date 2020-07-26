//Q30. Write a function to find out longest palindrome in a given string? *

package Java_Hackathon;

import java.util.Scanner;

public class Longest_palidrome {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter palindrome sequence:");
		
		String str=sc.nextLine().toLowerCase();
		
		System.out.println("Enter another palindrome sequence:");
		
		String str1=sc.nextLine().toLowerCase();
		
		int len1=str.length();
		
		int len2=str1.length();
	
			String rev="";
		
			char[] c_str=str.toCharArray();
		
			for(int j=c_str.length-1;j>=0;j--)
			{
				 rev=rev+c_str[j];
			}
		
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("The string " + str+" is Palindrome.");
		}
		else
			System.out.println("The string " + str+"is not Palindrome.");
		

	    String rev1="";
	
	     char[] c_str1=str1.toCharArray();

	     for(int j=c_str1.length-1;j>=0;j--)
	     {
		    rev1=rev1+c_str1[j];
	     }

         if(str1.equalsIgnoreCase(rev1))
         {
	         System.out.println("The string " + str1+" is Palindrome.");
         }
        else
	         System.out.println("The string " + str1+" is not Palindrome.");
         
         if(len1>len2)
         {
        	 System.out.println("The longest palindrome is: "+str);
         }
         else if(len1<len2)
         {
        	 System.out.println("The longest palindrome is: "+str1);
         }
         else
        	 System.out.println("Both palindrome strings are same in length.");


}
	}

