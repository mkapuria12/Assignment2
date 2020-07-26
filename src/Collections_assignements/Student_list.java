package Collections_assignements;

public class Student_list implements Comparable<Student_list>{

	int sem ;
	String name;
	Student_list(int sem, String name)
	{
		this.sem=sem;
		this.name=name;
	}
	public int compareTo(Student_list obj) {
		return this.name.compareTo(obj.name);
	}
}
