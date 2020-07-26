// WJP to replace each substring of a given string that matches the given regular expression with the 
//given replacement String: "Dog chases cat, Cat chases rat". Note: Replace 'cat' with 'rat'


public class replace_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "Dog chases cat, Cat chases rat";
		
        System.out.print("The string is: "+st);
		
		System.out.println();
		
		String[] st_word=st.split(" ");
		
		System.out.println();
		
		for(int i=0;i<=st_word.length-1;i++)
		{
			
			System.out.print(st_word[i].toLowerCase().replace("cat", "rat")+" ");
		}
	}

}
