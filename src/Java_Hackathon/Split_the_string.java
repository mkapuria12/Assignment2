//Q-11 How to Split String in java? 

package Java_Hackathon;

import java.util.Scanner;

public class Split_the_string {

	public static void main(String[] args) {

		    Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a string");
			
			String str=sc.nextLine();
			
			String []words=str.split("!", 3);
			
			System.out.println("The string is split by str.split(regex, limit):- ");
			
			for(int i=0;i<words.length;i++)
			{
			System.out.println(words[i]);
			}
			System.out.println("--------------------------------------------------------------------------------------------------");

            Scanner sc1=new Scanner(System.in);
			
			System.out.println("Enter another string:");
			
			String str1=sc1.nextLine();

			System.out.println("The string is split by str.split(regex):- ");

			String []words_list=str1.split("\\s");
			
			for(int i=0;i<words_list.length;i++)
			{
			System.out.println(words_list[i]);
			}
	}

}
