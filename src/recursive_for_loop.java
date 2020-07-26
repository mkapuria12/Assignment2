
public class recursive_for_loop {

	static int count=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fun();
	}
	
	static void fun()
	{
		count++;
		if(count<=5)
		{
			System.out.println(count);
			fun();
		}
		
	}

}
