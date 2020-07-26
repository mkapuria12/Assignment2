//Q15. Given a string print the unique words of the string. *

package Java_Hackathon;

import java.util.*;

public class Unique_word_fromString {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		String st=sc.nextLine().toLowerCase();
		
		sc.close();
		
		String[] words=st.split("\\s");
								
		TreeMap<String, Integer> list = new TreeMap<>();
		
		for(String str : words)
		{
			if(list.containsKey(str))
			{
				list.put(str, list.get(str)+1);
			}
			else
			{

				list.put(str, 1);

			}
		}
		for(Map.Entry e: list.entrySet())
		{
			if((int)e.getValue() == 1)
				System.out.println(e.getKey());
		}		
	}

}
