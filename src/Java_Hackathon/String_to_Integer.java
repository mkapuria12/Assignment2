//Q21. WJP to convert string to int 

package Java_Hackathon;

import java.util.Scanner;

public class String_to_Integer {

	public static void main(String[] args) {
		
		String Str_num = "50";
		
		System.out.println("The number as a string:"+Str_num);
		 
		int num =21;
		
		System.out.println("The integer is:"+num);
        
        int strInt=Integer.parseInt(Str_num);
               
        int ans=num+strInt;
        
        System.out.println("The addition of two numbers:- "+ans);
	}

}
