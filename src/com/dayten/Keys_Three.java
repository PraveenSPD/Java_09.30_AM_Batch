package com.dayten;

import java.util.HashMap;

public class Keys_Three  {
	
	public static void countOfCharcters(String value) {
		//Creating one HashMap with <Character,Integer>
		HashMap<Character,Integer> hm = new HashMap();
		//now converting the String value into CharArray with use of toCharArray Method
		char characters[]=value.toCharArray();
		
		//iterating that Characters with use of ForEachLoop
		for(char c :characters) {
			//Give the Condition for Ignoring Spaces
			if(!String.valueOf(c).isBlank()) { 
				//Giving the Condition..the character(Key) is present or not 
				//if it is already present in that HashMap in enters the if condition and put 
				//that character into the Map...by getting the current character(key) value and adding 1.
				
			if(hm.containsKey(c)) {  
				hm.put(c, hm.get(c)+1);
			}
			//if it is not already in that HashMap..it enters the else part and put the character(key) value 1.
			else {
				hm.put(c, 1); //a =1
			}
		}
			}
		System.out.println(hm);
	}
	public static void main(String[] args) {
		countOfCharcters("ap pa");
	}
}
