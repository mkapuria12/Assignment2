//Q16. Write a method that will remove given character from the String?

package Java_Hackathon;

import java.util.Scanner;

public class Remove_character_string {
	
	public static void remove_char(String str, char e)
	{	
		String new_str=str.replace(e, ' ');
		
		System.out.println("The new string without given character:-"+new_str);
	
	}
	
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		
        System.out.print("The string is : ");
 
        String Str = scanner.nextLine().toLowerCase();
       
        remove_char(Str,'e');
	}

}
