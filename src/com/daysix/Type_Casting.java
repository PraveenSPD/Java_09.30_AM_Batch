package com.daysix;

import com.dayseven.Hari;

public class Type_Casting extends Hari {

	String name ="RAJU";
	public void stdName() {
		String name ="Ravi";
	}
	
	public static void main(String[] args) {
		Type_Casting TC = new Type_Casting();
		System.out.println(TC.mobile);
//		ClassName ref = new ClassName();
		//wide Casting(memory loss)
	/*	byte b =10;
		int a =b;
		
		boolean humanOrNot=true;
		System.out.println(humanOrNot);
		
		//Narrow Casting (value loss)
		double d =10.34;
		int c = (int)d;
		System.out.println(c);
		
		long l =9786167789l;
		int f =(int)l;
		System.out.println(f);  */
		
	}
}
