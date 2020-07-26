//Q14. Given a string print the reverse of the words string.(Input: Java Code Output: Code Java)

package Java_Hackathon;

import java.util.Scanner;

public class Reverese_string_words {

	public static void main(String[] args) {
		
		String Str ="Java Code";
		
        System.out.println();
		
		System.out.print("Original string is : "+Str);
		
        System.out.println();
		
		System.out.println("--------------------------------------------------------------------------------------------------");
 
        String words[] = Str.split("\\s");
        
        System.out.println();
        
       String rev = "";
 
        for (int i=words.length-1;i>=0; i--) 
        {
        	String word=words[i];
        	
            rev=rev+word+" ";
        }

        System.out.println("Reversed string : " + rev);
	}

}
