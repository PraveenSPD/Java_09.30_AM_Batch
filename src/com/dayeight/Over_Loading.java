package com.dayeight;

public class Over_Loading {   //+   10 +20=30    Arun+Kumar=ArunKumar

//method over_loading
	//compile time polymorphism  //static binding
	//in method_over_loading method names are same //methods signature are different is to be diffentiated by using parameters 
	
	public void defineOOPS(String definition) {
		System.out.println("oops defines "+definition);
	}
	
	public void defineOOPS(String definition,int howManyConcepts) {
		System.out.println(definition+ " "+ howManyConcepts);
	}
	public void defineOOPS(int howManyConcepts,String definition) {
		System.out.println("There are "+howManyConcepts + "concepts in "+definition);
	}
	
	public static void main(String[] args) {
		Over_Loading ol = new Over_Loading();
		ol.defineOOPS("Object-Oriented-Programming structure");
		ol.defineOOPS(4, "Object-Oriented-Programming structure");
		ol.defineOOPS("Object-Oriented-Programming structure", 4);
	}
	
}

