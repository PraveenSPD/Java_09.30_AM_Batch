package com.eleven;

public class Constructor_Demo {

	int i;
	String s;  //
	
	
	public Constructor_Demo() { //Constructor
		 i =10;
		 System.out.println("Hello...");
	}
	public Constructor_Demo(String d) {
		s=d;
		System.out.println("Hey");
	}
	
	public static void main(String[] args) {
		Constructor_Demo cd1 = new Constructor_Demo();
		Constructor_Demo cd = new Constructor_Demo("Ravi");
		System.out.println(cd1.i);
		System.out.println(cd.s);
	}
}
