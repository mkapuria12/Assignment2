//Q24. Write a program which inputs a positive natural number N and prints the possible consecutive 
//number combinations, which when added give N. INPUT: N = 9 OUTPUT: 4 + 5 2 + 3+ 4 

package Java_Hackathon;

import java.util.Scanner;

public class Consecutive_number_combinations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a number:");
 
        int num= sc.nextInt();
        
        System.out.println("The entered number is:"+num);
        
        int ans=0, dup=num;
        
        for(int i=1;i<=num;i++)
        {
        	dup--;
        	
            ans=i+dup;
            
        	System.out.println(i+" + "+dup+" = "+ans);
        	
        }
        
        for(int i=1;i<=num;i++)
        {
        	int dup1=num;
        	
        	dup1=dup1-3;
        	
        	int add=i+1;
        	
        	ans=i+dup1+add;
        	
        	if(ans==num)
        	{
        	System.out.println(i+" + "+dup1+" + "+add+"="+ans);
        	}
        }
	}

}
