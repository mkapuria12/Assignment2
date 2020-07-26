/* Write a program to print the names of students by creating a Student class. If no name is passed while creating 
an object of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value 
passed while creating object of Student class.*/

package com.assignemnt;

public class Student {

	
	Student()
	{
	   System.out.println("Unknown");	
	}
	
	Student(String S_name)
	{
		System.out.println("The student's name is: "+S_name);	
	}
	
	public static void main(String[] args) {

		Student stu=new Student();
		Student stu1=new Student("Alice");	
	}

}
