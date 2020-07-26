//Q23. WJP to differentiate input as string, int or bool 
package Java_Hackathon;
import java.util.Scanner;
public class Differentiate_input {
    static boolean isNumber(String s) 
    { 
        for (int i = 0; i < s.length(); i++)
        {
        if (Character.isDigit(s.charAt(i)) == false) 
        {
            return false; 
        }
        return true; 
        }
		return false;	
    } 
    static public void main (String[] args) 
    { 
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a string : ");
 
        String Str = scanner.nextLine();
        
        if (isNumber(Str)) {
            System.out.println("The input " + Str+" is an integer."); 
        }
        else if(Str.equals("true") || Str.equals("false")) {
            System.out.println("The input " + Str+" is a boolean."); 
        }
        else	
            System.out.println("The input " + Str+" is a string."); 
        System.out.print("Enter a digit : ");
        
        String Str1 = scanner.nextLine();
        
        if (isNumber(Str1)) {
            System.out.println("The input " + Str1+" is an integer."); 
        }
        else if(Str1.equals("true") || Str1.equals("false")) {
            System.out.println("The input " + Str1+" is a boolean."); 
        }
        else	
            System.out.println("The input is String:- "+Str1);
        System.out.print("Enter boolean value : ");
        
        String Str2 = scanner.nextLine();
        
        if (isNumber(Str2)) {
            System.out.println("The input " + Str2+" is an integer."); 
        }
        else if(Str2.equals("true") || Str2.equals("false")) {
            System.out.println("The input " + Str2+" is a boolean."); 
        }
        else	
            System.out.println("The input " + Str2+" is a string."); 
          
    }
}
