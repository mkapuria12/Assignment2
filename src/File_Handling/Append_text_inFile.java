//Write a Java program to append text to an existing file 

package File_Handling;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Append_text_inFile {

	public static void main(String[] args) throws IOException {

		String sPath="/Users/Mit/eclipse-workspace/Practice/src/com/files/test1.txt";

	      String sLine;
	      try {
	    	  FileWriter fw=new FileWriter(sPath,true);
	    	  fw.write("\nSuccessfully Appended");
	    	  fw.close();
		     
	      }catch(Exception a)
	      {
	    	  System.out.println(a);
	      }
	     
		
	}

}
