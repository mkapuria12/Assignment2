//Q20. WJP to find total number of repeated integers, uppercase and lowercase character in the give string *
package Java_Hackathon;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class Occu_int_lower_upper_inString {	
	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);	
    System.out.print("The string is : ");
    String Str = scanner.nextLine();    
    char c_str[]=Str.toCharArray();   
    int count=1,count_num=1, count_upper=1, count_lower=1;
    
    for(int i=0;i<=c_str.length-1;i++)
    {
    	count=1;
    	for(int j=i+1;j<=c_str.length-1;j++)
    	{
    		if(c_str[i]==c_str[j])
    		{
    			count++;
    		}
    	}
    	if(count>1)
    	{
    	if(c_str[i]>= '0' && c_str[i] <= '9')
    	{
    		count_num++;
    	}
    	else if(c_str[i]>= 'a' && c_str[i] <= 'z')
    	{
    		count_lower++;
    	}
    	else if(c_str[i]>= 'A' && c_str[i] <= 'Z')
    	{
    		count_upper++;
    	}
    	}
    }
    System.out.println("The total number of repeated integers are:- "+count_num);
    System.out.println("The total number of repeated uppercase characters are:- "+count_upper);
    System.out.println("The total number of repeated lowercase characters are:- "+count_lower);
        
	     }       
	}   
