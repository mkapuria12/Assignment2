// WJP to calculate the sum of first 10 natural number using while loop 

import java.util.Scanner;

public class sum_of_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i=1, sum=0;
				
		while(i<=10)
		{		
			sum=sum+i;
			
			i++;
		}
		System.out.println("The sum of first 10 numbers: "+sum);

	}

}

