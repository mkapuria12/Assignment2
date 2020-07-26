package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_And_Write {

	public static void main(String[] args) throws IOException {

		writeFile();
		readFile();  
		
	}
	
	public static void writeFile() throws IOException
	{
		String sPath="/Users/Mit/eclipse-workspace/Practice/TestWrite.txt";
		
		try {
			FileWriter fw=new FileWriter(sPath);
			BufferedWriter bw=new BufferedWriter(fw);
			
			bw.write("\n1) File Handling concept.");
			bw.write("\n2) First, select the path to create and store the file.");
			bw.write("\n3) Second, use FileWriter and BufferedWriter methods to generate and write the content in the file.");
			bw.write("\n4) The TestWrite file is created and write more the content in the file.");

			bw.close();
		}catch(Exception a)
		{
			System.out.println(a);
		}
		finally {
			System.out.println("Success!");
		}
		System.out.println("*******************");
	}

	public static void readFile() throws FileNotFoundException
	{
		
		  String sPath="/Users/Mit/eclipse-workspace/Practice/Test.txt";

	      String sLine;
	      FileReader fr=new FileReader(sPath);
	      BufferedReader br=new BufferedReader(fr);
	      try
	      {
	      while((sLine=br.readLine())!=null)
	      {
	    	  System.out.print(sLine);
	    	  System.out.println();
	      }br.close();
	      }catch(Exception a)
	      {
	    	  System.out.println(a);
	      }
	      System.out.println("*******************");
	      
	      System.out.println("The TestWrite.txt file is created and written by this program and It's content is given below:");
	      
			  String sPath1="/Users/Mit/eclipse-workspace/Practice/TestWrite.txt";
     	      String sLine1;
		      FileReader fr1=new FileReader(sPath1);
		      BufferedReader br1=new BufferedReader(fr1);
		      try
		      {
		      while((sLine1=br1.readLine())!=null)
		      {
		    	  System.out.print(sLine1);
		    	  System.out.println();
		      }br.close();
		      }catch(Exception a)
		      {
		    	  System.out.println(a);
		      }

	}

}
