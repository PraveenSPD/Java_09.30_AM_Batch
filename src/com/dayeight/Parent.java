package com.dayeight;

public class Parent {

	public void empDetails(int empId) {
		System.out.println("empId is "+empId);
	}

	public static void main(String[] args) {
		Parent p = new Child();
		p.empDetails(0);
		Parent p1 = new Child_One();

		p1.empDetails(0);
	}


}
