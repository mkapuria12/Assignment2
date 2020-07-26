//Q13. Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ) 

package Java_Hackathon;

import java.util.Scanner;

public class Reverse_whole_string_byChar {

	public static void main(String[] args) {

		String str="Java Code";
        
		System.out.println("The string is: "+str);
		
		String rev=" ";
			
		System.out.println();
		
		for(int i=str.length()-1;i>=0;i--) {
			
			 rev = rev + str.charAt(i);
			
		}
		 System.out.print("The reverese string is:-" +rev);
	}

}
