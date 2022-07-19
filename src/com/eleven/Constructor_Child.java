package com.eleven;

public class Constructor_Child extends Constructor_Demo{

	public Constructor_Child() {
		super();//parent//Constructor_Demo()
		System.out.println("Hii");
	}
	
	public Constructor_Child(int i) {
		super();//parent//Constructor_Demo()
		System.out.println(i);
	}
	public void stdName() {
		
	}
	public static void main(String[] args) {
	Constructor_Child cc = new Constructor_Child(); //it calls two constructor
	Constructor_Child cc1 = new Constructor_Child(5); //two constructor
	
	}
}
