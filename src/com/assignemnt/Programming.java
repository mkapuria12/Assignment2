/* Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, then the message 
"I love programming languages" should be printed. If some String is passed to it, then in place of "programming languages"
the name of that String variable should be printed. */


package com.assignemnt;

public class Programming {

    Programming(String args)
	{
    	if(args=="")
    	{
    	System.out.println("I love programming languages");
    	}
    	if(args!="")
    	{
    		System.out.println("I love "+args);
    	}
	}
	
	public static void main(String[] args) {
		
		Programming p=new Programming("");
		Programming p1=new Programming("nature!");
	}

}
