// Wjp to count number of vowels and consonants in from the string enterd by user

import java.util.Scanner;

public class vowels_consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string:");
		
		String str=sc.nextLine();
		
		System.out.print("The string is:- "+str);
		
		String str1=str.toLowerCase();
		
		char[] each_char=str1.toCharArray();
		
		int count_vowels=0, count_conso=0;
		
		for(int i=0; i<=each_char.length-1;i++)
		{	
			if(each_char[i]=='a' || each_char[i]=='e' || each_char[i]=='i' || each_char[i]=='o' || each_char[i]=='u')
			{
				count_vowels++;
			}
			
			else if(each_char[i]=='b' || each_char[i]=='c' || each_char[i]=='d' || each_char[i]=='f' || each_char[i]=='g' 
					|| each_char[i]=='h' || each_char[i]=='j' || each_char[i]=='k' || each_char[i]=='l' || each_char[i]=='m' || 
					each_char[i]=='n' || each_char[i]=='p' || each_char[i]=='q' || each_char[i]=='r' || each_char[i]=='s' ||
					each_char[i]=='t' || each_char[i]=='v' || each_char[i]=='w' || each_char[i]=='x' || each_char[i]=='y' || 
					each_char[i]=='z')
			{
				count_conso++;
			}
		}
		System.out.println();
		
		System.out.println("The total number of vowels in given string are:  "+count_vowels);
		
		System.out.println("The total number of consonants in given string are:  "+count_conso);
		
		
		
		
	}

}
