package Exception_handling;

public class Ex_demo1{

	public static void main(String[] args)  {
		
		try {
			int i=0, j=3;
			System.out.println("The division:"+(j/i));
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
		}
		finally {
			System.out.println("The program was about division.");
		}
		System.out.println("End!!");
	}

}
