package com.tweleve;

import java.util.Scanner;

public class Scanner_Demo {
public static void stdDetails() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your name");
	String name=sc.next();
	System.out.println(name);
	}
	public void empDetails() {
		Scanner sc =new Scanner(System.in);
		sc.next();
	}
	
	public static void main(String[] args) {
 //i=10++i  1+10  =11=i               1+variable=variable  
		//Pre Increment,Decrement           (1)++Variable,(1)--Variable       1+10=i
		//Post Increment,Decrement			   variable++  ,   variable--     i=10+1    
		
		//a() --->b
		//a() --->b
		
//fibonacci series ----> 0,1,1,2,3,5
		int firstValue=0;
		int secondValue=1;
		
		int thirdValue=firstValue+secondValue;  //1
	
		firstValue=secondValue;    //1
		secondValue=thirdValue;    //1
		
		thirdValue=firstValue+secondValue;  //2  =1+1
		firstValue=secondValue;  //1
		secondValue=thirdValue; //2
	
		System.out.println("* * *");
		System.out.println("* * *");
		System.out.println("* * *");
		
		thirdValue=firstValue+secondValue;       //1+2  ==3
		
		
		//prime Numbers  ---> a number divided by 1 and itself   11
		
		//factors ---> 
		
		
		
		
	} 
}
