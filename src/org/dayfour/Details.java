package org.dayfour;

public class Details {

	
	String principalName="Ravi";
	
	public void stdName(String name) {
		System.out.println("My Name is "+name);
	}
	
	 void stdId(int id) {
		System.out.println("My is is "+id);
	}
	
	protected void favSub(String subject) {
		System.out.println("MY favSub is "+subject);
	}
	
	public static void main(String[] args) {
		Details d = new Details();

	}
}
