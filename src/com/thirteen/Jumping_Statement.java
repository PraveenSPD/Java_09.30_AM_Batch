package com.thirteen;

import java.util.Scanner;

public class Jumping_Statement {

	public static void main(String[] args) {
		
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter the month");
              String month=sc.nextLine();
              
              switch(month) {
              case "jan" : {
            	  System.out.println("Pongal");
            	  break;
              }
              case "feb" : {
            	  System.out.println("No holidays");
            	  break;
              }
              default : {
            	  System.out.println("I need English Month");
              }
              }
	}
} 
