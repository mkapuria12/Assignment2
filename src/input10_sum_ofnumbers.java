import java.util.Scanner;

public class input10_sum_ofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the numbers:");
		
		int n=10;
		
		int sum=0;
		
		int num[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			 num[i]=sc.nextInt();
		}
		for(int j=0;j<num.length;j++)
		{
			
			sum=sum+num[j];
		}
		
		System.out.println("The sum of numbers: "+sum);

	}

}
