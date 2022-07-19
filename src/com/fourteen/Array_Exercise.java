package com.fourteen;

public class Array_Exercise {

	public static void main(String[] args) {
		//Array ---->[]  it is disimilar datatype --->we can store group of similar values 
		
		//int a =10; //primitive datatype 
		
//	    int a[] = new int[5];
	//	int[] a = new int[5];               //a=[20,0,45,0,22]
										    //Index  0,1,2,3,4  index starts from 0..... 
//		a[0]=20;
//		a[4]=23;
//		a[2]=45;
//		a[4]=22;
//		a[4]=26;
//	
/*		int a[]= {10,20};
		int sizeOfArray=a.length;
		System.out.println(sizeOfArray);
		int i=0;
		while(i<sizeOfArray) {
			System.out.println(a[i]);
			i++;*/
		                                         //   0            1            2
//		
String a[][]= {{"A","B","C"},  //0
			   {"B","C"},    //1
			   {"C"}};        //2
				
		
		int i=0;           //1
		while(i<a.length) {      //outerloop condition checking 1<3 true
			int j=0;      //j=2                                                  //
			while(j<2) {    //j<a[1].length  3,2,1
				System.out.print(a[i][j]+" "); //a[1][] a[0][1]
				j++; 
			}
			System.out.println(); // outer
			i++;
	}
		
//		System.out.println(a[0][0]+" "+a[0][1]);
//		System.out.println(a[1][0]+" "+a[1][1]);
//		System.out.println(a[2][0]+" "+a[2][1]);
		              //    0             1               2
		char c[][] = {{'A','B','C'},{'B','C','D'},{'C','D','E'}};
		           //   0   1   2     0   1   2     0   1   2
		//char c[][]= new char[3][3];
	//	}
		
		
		
		
		
		
		
		
		//i=0; 0<6 true  a[i]  a[0]   1  i=1 1<6 true a[i]  a[1]  ....5<6  a[5]  6<6 false
		
		
		
		
		
	//	System.out.println(a);    //it will print the alphaNumeric values
	//	System.out.println(a[0]); //Get the actual Value.
		
		
		// Disadvantages :-
		
		//it does not allows disimilar datatypes
		//memory wastage
		//length is fixed
		

	}

}
