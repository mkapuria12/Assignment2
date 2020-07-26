//import java.lang.reflect.Array;

import java.util.Arrays;  
import java.util.Scanner;

//Wjp to check two strings are anagrams of each other. e.g.:- 1) listen and silent 2) abcd and cdba

public class anagram_two_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings such as listen and silent or abcd and cdba:");
        
		System.out.println("Enter first string:");
		
		String str_1=sc.nextLine();
		
		String str1=str_1.replaceAll("\\s","");
		
		System.out.println("Enter second string:");
		
		String str_2=sc.nextLine();
		
		String str2=str_2.replaceAll("\\s","");
		
		System.out.println("The first string is:- "+str1);
		
		System.out.println("The second string is:- "+str2);
		
		char []s1=str1.toLowerCase().toCharArray();
		
		char []s2=str2.toLowerCase().toCharArray();
		
		Arrays.sort(s1);
		
		Arrays.sort(s2);
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		if(Arrays.equals(s1,s2))
		    {
		         System.out.println("Strings "+str1+" and "+str2+" are anagram of each other.");
		    }
		else
		{
				System.out.println("String are not anagram of each other.");
		}

	}

}
