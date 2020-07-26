//Write a Java program to store text file content line by line into an array. 

package File_Handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Store_txtfile_toArray {

	public static void main(String[] args) throws FileNotFoundException {

		  String sPath="/Users/Mit/eclipse-workspace/Practice/Test.txt";

	      String sLine;
	      
	      FileReader fr=new FileReader(sPath);
	      
	      BufferedReader br=new BufferedReader(fr);
	      
	      ArrayList<String> my_fileArray =new ArrayList<>();
	      
	      try
	      {
	      while((sLine=br.readLine())!=null)
	      {  
	    	  my_fileArray.add(sLine);
	    	  
	      }br.close();
	      
	      }catch(Exception a)
	      {
	    	  System.out.println(a);
	      }
	      System.out.println("**********************************************");
	      System.out.println("The content of the file is saved in the array:- ");
	      System.out.println("----------------------------------------------");
	      int index=0;
	      for(int i=0;i<my_fileArray.size();i++)
	      {
	    	  System.out.println("The line of Index"+"["+index+"]"+"---->"+my_fileArray.get(i));
	    	  index++;
	      }
	}

}
