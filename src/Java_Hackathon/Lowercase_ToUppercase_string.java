//Q9. How can we make String Lower case to Upper case? *

package Java_Hackathon;

import java.util.Scanner;

public class Lowercase_ToUppercase_string {

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string in lowercase");
		
		String str=sc.nextLine();
		
		System.out.println("The string is in uppercase:- "+str.toUpperCase());
		
	}

}
