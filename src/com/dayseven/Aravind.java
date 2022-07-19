package com.dayseven;

import java.util.HashMap;

public class Aravind  {

	public static void countOfNumbers(String name) {

		HashMap<Character,Integer> hm = new HashMap();
		char ch[] =name.toCharArray();

		for(char c:ch) {
			if(!String.valueOf(c).isBlank()) {
				if(hm.containsKey(c)) {

					hm.put(c, hm.get(c)+1);
				}

				else {
					hm.put(c, 1);
				}
			}
		}
		System.out.println(hm);
	}

	public static void main(String[] args) {
		countOfNumbers("Raja Raja");
	}

}
