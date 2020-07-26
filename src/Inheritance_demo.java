/*What is the output of this program? 
class A {  int i;  void display() {     System.out.println(i);  } } 
class B extends A {  int j;  void display() {     System.out.println(j);  } } 
class inheritance_demo {  public static void main(String args[])
{    B obj = new B();     obj.i = 1;     obj.j = 2;     obj.display();  } } */

class A {
	int i;  
	void display() 
	{ 
		System.out.println(i); 
	}
} 
class B extends A
{  
	int j; 
	void display() 
	{     
		System.out.println(j); 
	} 
} 
public class Inheritance_demo {

	public static void main(String[] args) {

		A a=new A();
		A ab=new B();
		B b=new B();
		
		
		a.i=5;
		b.j=6;
		a.display();
		ab.display();
		b.display();
	
	}

}
