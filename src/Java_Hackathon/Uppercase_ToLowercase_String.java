//Q8. How can we make String upper case to lower case? *

package Java_Hackathon;

import java.util.Scanner;

public class Uppercase_ToLowercase_String {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string in uppercase");
		
		String str=sc.nextLine();
		
		System.out.println("The string is in lowercase:- "+str.toLowerCase());
	}

}
