// Given an array of integers, print only odd numbers array[]={3,8,6,14,5,17,19} 


public class Print_odd_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num_list[]={3,8,6,14,5,17,19};
	
		System.out.println("The list of numbers: ");
				
		for(int i=0;i<num_list.length;i++) {
			
			System.out.print(num_list[i]);
			System.out.print("  ");
		}
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("The odd numbers from given number list are : ");
		
        for(int i=0;i<num_list.length;i++) {
			
        	if(num_list[i]%2 != 0)
        	{
			System.out.print(num_list[i]);
			System.out.print("  ");
        	}
		}
	}

}
