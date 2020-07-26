
import java.util.Scanner;

// Write a java program to remove duplicate characters from string.


public class Remove_duplicate_char {

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

		System.out.println("The new string is:");
		
		String sub=new String();
		
		for(int i=0;i<=each_char.length-1;i++)
		{
			for(int j=i+1;j<=each_char.length-1;j++)
			{
				if(each_char[i]==each_char[j])
		       {
					count++;	
	           }
			} 
		if(count==1) {
			sub=sub+each_char[i];
		}
		count=1;
	    }	
		System.out.println(sub);
	}

}
