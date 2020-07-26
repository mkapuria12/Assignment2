//Q31. Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1) *

package Java_Hackathon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Read_WriteFile_reverse_order {

	public static void main(String[] args) throws IOException {

		  String sPath="/Users/Mit/eclipse-workspace/Practice/Test.txt";

	      String sLine;
	      
	      FileReader fr=new FileReader(sPath);
	      
	      BufferedReader br=new BufferedReader(fr);
	      
		  ArrayList<String> arrStr=new ArrayList<>();

		  System.out.println("The content given below is retrieved from the text file.");
		  
    	  System.out.println();

	      try
	      {
	      while((sLine=br.readLine())!=null)
	      {
	    	  System.out.print(sLine);
	    	  System.out.println();
	    	  arrStr.add(sLine);
	    	  
	      }br.close();
	      }catch(Exception a)
	      {
	    	  System.out.println(a);
	      }
    	  System.out.println();

	      System.out.println("*****************************************************");
	      
    	  System.out.println();

	      System.out.println("Writing in reverse order (Line 10-line 1) in the file:");
	      
    	  System.out.println();

	      FileWriter fw=new FileWriter(sPath);
	      
		  BufferedWriter bw=new BufferedWriter(fw);
		  
	      for(int i=arrStr.size()-1;i>=0;i--)
	      {
	    	  fw.write(arrStr.get(i)+"\n");
	    	  
	    	  System.out.println(arrStr.get(i));
	      }fw.close();
	      
	}

}
