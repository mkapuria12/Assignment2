// Find duplicate characters in the string.

import java.util.Scanner;

public class duplicate_characters_inString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string:");
		
		String str=sc.nextLine();
		
		System.out.print("The string is:- "+str);
		
		System.out.println();
		
        String str1=str.toLowerCase();
		
		char[] each_char=str1.toCharArray();
		
		int count=1;
		
		int[] count1=new int[200];
		
		System.out.println("Duplicates characters  and it's number present in the string :");
		
		for(int i=0;i<=str1.length()-1;i++)
		{
			count1[str1.charAt(i)]++;
		}
		for(int i=0;i<=each_char.length-1;i++)
		{
			for(int j=i+1;j<=each_char.length-1;j++)
			{
				if(each_char[i]==each_char[j])
		       {
					count++;
	            }
			} 
		if(count==count1[str1.charAt(i)] && count>1)
		{
			System.out.println(each_char[i]+"--------------------->"+count1[str1.charAt(i)]);
		}
		if(count==count1[str1.charAt(i)] && count==1)
		{
			System.out.println(each_char[i]+"--------------------->"+count1[str1.charAt(i)]);
		}
		count=1;
	}	
		
		}
	}
