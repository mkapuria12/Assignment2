//Q22. WJP to convert int to string

package Java_Hackathon;

public class Convert_int_Tostring {

	public static void main(String[] args) {

        int numString =100;
		
		System.out.println("The integer is:"+numString);
        
		String Str = "100";
		
		System.out.println("The number as a string:"+Str);
        
        String strInt=Integer.toString(numString);
               
        if(Str.equals(strInt))
        {
            System.out.println("Both strings are equal.");
            System.out.println("Here is the concatenate of both strings."+Str+strInt);
        }
        
     	}

}
