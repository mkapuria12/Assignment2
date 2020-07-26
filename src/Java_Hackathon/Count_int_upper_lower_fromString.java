//Q17. WJP to find total number of integers, uppercase and lowercase character in the give string *

package Java_Hackathon;

import java.util.Scanner;

public class Count_int_upper_lower_fromString {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		
        System.out.print("The string is : ");
 
        String Str = scanner.nextLine();
        
        char c_str[]=Str.toCharArray();
        
        int count_num=0, count_upper=0, count_lower=0;
        
        for(int i=0;i<=c_str.length-1;i++)
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
        System.out.println("The total number of integers are:- "+count_num);
        System.out.println("The total number of uppercase characters are:- "+count_upper);
        System.out.println("The total number of lowercase characters are:- "+count_lower);
	
	}

}
