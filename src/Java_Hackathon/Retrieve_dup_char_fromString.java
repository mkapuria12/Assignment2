//Q18. WJP to display duplicate character in string *
package Java_Hackathon;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class Retrieve_dup_char_fromString {	
	static void dupCharCount(String Str)
    {
        HashMap<Character, Integer> char_count = new HashMap<Character, Integer>();
  
        char[] char_array= Str.toLowerCase().toCharArray();
  
        for (char c : char_array)
        {
            if(char_count.containsKey(c))
            { 
            	char_count.put(c, char_count.get(c)+1);
            }
            else
            {
            	char_count.put(c, 1);
            }
        } 
        Set<Character> charsInString = char_count.keySet();
 
        System.out.println("Duplicate Characters in the given string are:  "+Str);
 
        for (Character ch : charsInString)
        {
            if(char_count.get(ch) > 1)
            { 
                System.out.println(ch);
            }
        }
    }
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		
        System.out.print("The string is : ");
 
        String Str = scanner.nextLine();
        
        dupCharCount(Str);
        
	     }
	}

