package Collections_assignements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Student_list_sorting {
	
	public static void main(String[] args) {
		
		ArrayList<Student_list> stu=new ArrayList<Student_list>();
		
		Student_list stu1=new Student_list(2,"Robert");
		Student_list stu2=new Student_list(5,"Kent");
		Student_list stu3=new Student_list(3,"Sally");
		Student_list stu4=new Student_list(4,"Alice");
		Student_list stu5=new Student_list(2,"Sofia");
		Student_list stu6=new Student_list(3,"Jose");

		ArrayList<Library> lb=new ArrayList<>();
		
		Library lb1=new Library(21,5);
		Library lb2=new Library(1,3);
		Library lb3=new Library(11,6);
		Library lb4=new Library(8,2);
		Library lb5=new Library(24,4);
		Library lb6=new Library(15,5);

       TreeMap<Library,Student_list> tm=new TreeMap<Library,Student_list>();
       tm.put(lb1, stu1);
       tm.put(lb5, stu5);
       tm.put(lb4, stu4);
       tm.put(lb3, stu3);
       tm.put(lb2, stu2);
       
        System.out.println("Student's library no.    Total books issued       Student's name          Student's sem");
        
        for(Map.Entry<Library, Student_list> entry:tm.entrySet()) {
        	Library l1=entry.getKey();
        	Student_list s1=entry.getValue();
        	
        	System.out.println(l1.lnum+"                "+l1.totalBooks+"                "+s1.name+"                 "+s1.sem);
        }
        
	}

}
