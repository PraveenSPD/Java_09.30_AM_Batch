package com.dayeight;

public class Child extends Parent {

	
	@Override
	public void empDetails(int empId) {
		System.out.println("empId "+empId);
	}
	
	public void stdDetails() {
		System.out.println("Arun");
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.empDetails(23);
		
	}
}
