//Consider there is a 3 Boolean variable called a, b, c. 
//Check if at least two out of three Booleans are true 

package Java_Hackathon;
import java.util.Scanner;

public class AtLeast_twoBoolean_true {

		 static boolean a=true;
		 static boolean b=true;
		 static boolean c=true;
		 
		public static void check(int num1, int num2, boolean a, boolean b, boolean c)
		{
			try {
			if(num1>num2)
		     {
		    	 System.out.println(a);
		    	 if(num1!=0 || num2!=0)
		    	 {
			    	 System.out.println(c);
		    	 }
		    	 else if(num1<0 || num2<0)
		    	 {
			    	 System.out.println(c);
		    	 }
		    }  
			else if(num2>num1)
		     {
		    	 System.out.println(b);
		    	  if(num1!=0 || num2!=0)
		         {
		 	    	 System.out.println(c);
		         }	
		    	  else if(num1<0 || num2<0)
			         {
			 	    	 System.out.println(c);
			         }
		    }
			else if(num1==0)
			{
				System.out.println(c);
				if(num2==0)
				{
					System.out.println(a);
				}
			}	
		     else
	 	    	 System.out.println(false);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter two numbers:");
		 int num1=sc.nextInt();
		 int num2=sc.nextInt();
	     check(num1, num2, a,  b, c);
		}
}

