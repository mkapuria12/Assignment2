import java.util.Scanner;

// // WJP to make a calculator using switch case in Java(Include all arithmetic operators +,-,* and /) using methods 

public class calculator_using_methods {
	
	static void operation(int n, int a, int b)
    {	
			
			switch(n)
			{
			
			case 1:
			    System.out.println("The addition of numbers "+a+" "+"&"+" "+b+ " is "+(a+b));
			    System.out.println();
			    break;
			
			case 2:
			    System.out.println("The subtration of numbers "+a+" "+"&"+" "+b+ " is "+(a-b));	
			    System.out.println();

			    break;
			
			case 3:
			    System.out.println("The multiplication of numbers "+a+" "+"&"+" "+b+ " is "+(a*b));
			    System.out.println();

			    break;
			
			case 4:
				System.out.println("The division of numbers "+a+" "+"&"+" "+b+ " is "+(a/b));
			    System.out.println();

				break;
				
			default :
			    System.out.println("Invalid");
			    }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator_using_methods cal=new calculator_using_methods();
		
        System.out.println("Enter a number from 1 to 4:");
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
        System.out.println("Enter a number for the calculation:");
		
		int num1=sc.nextInt();
		
        System.out.println("Enter one more number for the calculation:");
		
		int num2=sc.nextInt();
		
        System.out.println("The output is based on values entered by user.");
		
	    System.out.println();

        cal.operation(n,num1,num2);
		
		System.out.println("The output is based on declared values.");
		
	    System.out.println();
		
        cal.operation(1,3,4);
        
        cal.operation(2,10,5);
        
        cal.operation(3,6,4);
        
        cal.operation(4,24,4);   
     
	}
}
