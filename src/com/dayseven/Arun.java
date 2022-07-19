package com.dayseven;

public class Arun extends Aravind {
	
	String name ;
	
	static {                    //static block
		Arun a = new Arun();
		a.name="Ravi";
	}
	
	{     //instance initialization block
		System.out.println("Hey.......!");
	}
	
	Arun() {    //constructor
	System.out.println("Hello........ :-)");	
	}
	
	public void empDetails(String empName,int empId) {
		System.out.println(empName+" "+empId);
	}
	
	public static void main(String[] args) {
		Arun ar = new Arun();
		long a = 9999999999999999l;
		int b =(int)a;
		System.out.println(b);
//		Aravind a = new Aravind();
		
		
	}
}
