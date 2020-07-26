//Write Java program to demonstrate 

// control flow of try-catch clause

// when exception occur in try block

// and handled in catch block 

package Exception_handling;

public class Exception_demo {

	public static void main(String[] args) {
		int[] Arr_list= {23,45,56};
		String str="Java";
		try {
			System.out.println("The array index[5]:"+Arr_list[5]);
		}
		catch(java.lang.ArrayIndexOutOfBoundsException A)
		{
			System.out.println("Check for the array length:- "+Arr_list.length);
		}
		try {
			char c=str.charAt(5);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException S)
		{
			System.out.println("Check for the string array length:- "+str.length());
		}
		catch(Exception a){
			
			System.out.println("Exception");
			System.out.println(a);
		}
		finally {
			System.out.println("Array list:-"+Arr_list[0]+" "+Arr_list[1]+" "+Arr_list[2]);
			System.out.println("String:- "+str);
		}
	}

}
