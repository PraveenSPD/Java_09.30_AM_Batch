package com.fifteen;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import jdk.swing.interop.SwingInterOpUtils;
public class String_Methods {

	static List ll1;
//	
	
	public void becky()  {   
		
		throw new InputMismatchException(); 
	}
	
	public void bayley() throws InterruptedException {
		becky();
	}
	
	public void alexa() {
		try {
		bayley();
		}
		catch(InterruptedException e) {
			
		}
	}
	
	public void siri() {
		
	}
	 
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(3000);
						  //    Throwable
						  //		|
		                  //    Exception
		//Checked Exception          //UnCheckedException    
		  
		
		System.out.println("Hello");
		try {
		System.out.println(10/0);  //Exception 
		//url load  () 
		}
	
		finally {
			System.out.println("Always Execute");
		}
		
		//try catch, try more catches,try catch finally ,try finally,try more catches,one finally
		//Reverse An Array And Stored into an Another Array
//		int a[]= {40,55,66,77,88};  //find an second largest number in array
//		int b[]=new int[a.length];
//		
//		int c=0;
//		for(int i=a.length-1;i>=0;i--) {
//			for( int j=0;j<a.length;j++) {           
//				b[c]=a[i]; 
//				c++;
//				break;	
//			}
//		}
//	for(int k=0;k<b.length;k++)  {
//		System.out.print(b[k]+",");
//	}
//	
		
//			String str ="dhilip";
//			String duplicate = "";
//			char[] c =str.toCharArray();
//			for(int i=0;i<str.length();i++) {
//				for(int j=i+1;j<str.length();j++) {
//					if(c[i]==c[j]) {
//						if(duplicate.contains(c[i]+"")) {
//							continue;
//						}
//						else {
//							duplicate+=c[i]+"";
//						}
//					}
//				}
//			}
	//	System.out.println(duplicate);
		
	
		//Set --->     HashSet ,LinkedHashSet,TreeSet   (generics)
	    //ValueBased,Set allow not duplicate(Hashing)
//		Set s = new HashSet();
//		Set s1 = new LinkedHashSet();
//		Set s2 = new TreeSet();
		
		//HashSet       --->HashSet (It is stored a values in Randomly) 
		//LinkedHashSet --->LHS(Insertion Order)
		//TreeSet       ---->TreeSet (Ascending Order)That's Why it not allow disimilar and null value
		TreeSet hs = new TreeSet();
		hs.add(10);      
		hs.add(44);        
		hs.add(55);   
		hs.add(66);
	    //similar values
    //    System.out.println(hs);
		
//		Object[] setArray=hs.toArray(); 
//		System.out.println(setArray[0]);                 
//		System.out.println(setArray[1]);                
//		System.out.println(setArray[2]);                
//		System.out.println(setArray[3]);
//	
      //Exercise
      //create one linkedList and add some values..those values contains duplicates
      //create one linkedHashSet and addAll Values Present in LinkedList
      //Let see the difference while printing the LinkedHashSet Object
		
      
		//swappingStringWithoutThirdVariable("is", "the");
		/*
		 * String s1 ="Hey Roman"; String reverseWord=""; String words[]=s1.split(" ");
		 * for(String w : words) { StringBuilder sb = new StringBuilder(w);
		 * sb.reverse(); reverseWord=reverseWord+sb+" "; }
		 * System.out.println("ReversedWord : "+reverseWord);
		 */

		//List
		//		1.ArrayList    LinkedList implements List

		// 1.Own Class refers Own Object ->// did not access others Objects //allMethods override methods and Own Methods
		LinkedList ll = new LinkedList();   
		//ArrayList a = new LinkedList() //not posiible
		//LinkedList l = new ArrayList();//not possible

		//2. Upcasting Way
		List  ll1 = new LinkedList();  //List ref  
		List  ll2 = new ArrayList();   //List ref


		//remove  ----> pop & poll
		//add     ---->offer

		//      ArrayList                       v/s         LinkedList
		//  Searching & retrieving best                Searching & retrieving worst
		//Insertion and Deletion bad                  Insertion & Deletion best
		//(last and first we need index)	         //(we have offer,poll,pop,first,last methods)

		//1234

		/*
		 * for(int i=0;i<al1.size();i++) { ///[10.34,true,,Ravi,10] Object
		 * value=al1.get(i); //0 if(value.equals("Ravi")){ System.out.println(value); }
		 * }
		 */
		//forEachLoop(cursors) //iterator() ListIterator()
		//		for(Object a:al1) {                //al =[10,20]
		//			System.out.println(a);
		//		}
		//		Iterator iterate=al1.iterator(); //al1..[10]
		//		while(iterate.hasNext()) {
		//			
		//			}
		//		ListIterator listIterate=al1.listIterator();
		//	listIterate.add();
		
		
			/*name:***
			Rollno:33
			Sub:tamil
			Date:***
			Time:****/       //methodnames ,refe
//		Map hh = new HashMap();                  
//		TreeMap hm = new TreeMap();  //( java.util )  Map---> {}  List,Set --->[]
		//One Key+One Value =One Pair(One Entry)
	//	{name=Roman,RollNo=23,subject=english}  --->Map is an Collection of Entries --->Key based
//		hm.put("name","Roman");
//		hm.put("Roll No", 23);
//		hm.put("subject", "english");
//		hm.put("Date", 9);
//		hm.put("Time", 9.30); 
//		
//		//HashMap ---->Random Order                     
//		System.out.println(hm);
//		
//		Set keys=hm.keySet();
//		System.out.println(keys);
//		
//		Collection values=hm.values();//List Set  //Collection
//		System.out.println(values);
//		
//		Set entrySet = hm.entrySet();
//		System.out.println(entrySet);
		
		//File Location
		//File Read                        
		//load
		//get and set
//		File file = new File("./LoginCredentials");  
//		FileInputStream fis = new FileInputStream(file);
//		Properties property = new Properties();  //load --->to get ,to set
//		
//		property.load(fis);
//		String location=property.getProperty("email");
//		
//		property.setProperty("passWord","556677");
//		
//		FileOutputStream fos = new FileOutputStream(file);
//		property.store(fos, "");
	}
}

//				 Search Context(I)              
//						|
//}				   	 Iterable
//}						|
//					collection(I)
//					    |
//	List(I) extends Collection             Set(I)               queue(I)            Map(I)
//ArrayList(c) implements List         HashSet implements Set                  HashMap implements Map
//LinkedList                           LinkedHashSet                           LinkedHashMap
//VectorList                           TreeSet                                 TreeMap
//Stack																           HashTable
																				//	properties --->file reading
//																			   Concurrent HashMap



//Create One Integer Type List and Values
//Iterating over for and forEach loop
//Using of Iterator remove specified value
//Using of ListIterator add already Removed Value
//Ex :---> [1,2]
//for and forEach
//1
//2
//iterator
//remove(specifiedValueInTheList)
//ListIterator
//add(that Removed Value)

//JDK,JRE,JVM

