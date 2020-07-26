// Check the given word is present in a given string.!
//String = "this is me doing qa automation testing" Word="qa" 


public class finding_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st="this is me doing qa automation testing";
		
		System.out.print("The string is: "+st);
		
		System.out.println();
		
		String[] st_word=st.split(" ");
		
		String word="qa";
		
		for(int i=0;i<=st_word.length;i++)
		{
			if(st_word[i].equals(word))
			{
				System.out.println();
				
				System.out.println("The word is present in the given string:- "+st_word[i]);
				
				break;}
		}
	}
}
