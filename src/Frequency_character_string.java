// Find the frequency of each character in a given string String: "Java is an object oriented programming launguage"

import java.util.Scanner;

public class Frequency_character_string {

		static void occur(String str1)
		{
	        char[] each_char=str1.toCharArray();
			
			int count=1;
			
			int[] count1=new int[200];
			
			System.out.println();
			
			for (int i = 0; i < str1.length(); i++) {
				count1[str1.charAt(i)]++;
			}
			
			for(int i=0;i<=each_char.length-1;i++)
			{
				for(int j=i+1;j<=each_char.length-1;j++)
				{
					if(each_char[i]==each_char[j])
			       {
						count++;	 }
				}
				if(count==1)
				{
					System.out.println("The frequency of character "+each_char[i]+ " is "+count1[str1.charAt(i)]);
				}
				count=1;}
		}

		public static void main(String[] args) {
			
			String str="Java is an object oriented programming launguage";
			
	        String str1=str.toLowerCase();
	        
	        System.out.println("The string is : "+str1);
	        
	        occur(str1);
	}

}
