////Write a Java program to check if a file or directory has read and write permission 

package File_Handling;

import java.io.File;

public class Permission_of_ReadWrite {

	public static void main(String[] args) {
		File my_file=new File("Test.txt");
		if(my_file.canRead())
		{
			System.out.println(my_file.getAbsolutePath());
			System.out.println("My file has permission to read.");
		}
		else {
			System.out.println(my_file.getAbsolutePath());
			System.out.println("My file does not have permission to read.");
		}
		if(my_file.canWrite())
		{
			System.out.println(my_file.getAbsolutePath());
			System.out.println("My file has permission to write.");
		}
		else {
			System.out.println(my_file.getAbsolutePath());
			System.out.println("My file does not have permission to write.");
		}
	}

}
