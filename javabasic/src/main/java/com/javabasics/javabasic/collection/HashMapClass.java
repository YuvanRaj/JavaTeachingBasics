package com.javabasics.javabasic.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.javabasics.javabasic.Employee;

/**
 * What is hashMap?
   HashMap is key value paired Data Structured storge collection 
      Example:   Father name and Son name
				 Key -> Value PAir all Real time example.
				 
				 
How HashMap Works Internally?
    
	Creation: Map map = new HashMap();
	   Initially 16 buckets in the back end will be created.
	   
	   map.put("Yuvaraj",15000);  => We are storing 
	   
	   1. Calculate the Hash For Yuvaraj.
	         calling public int hash("Yuvaraj") ==> 123456789
			 Minimie the size with in 16 ==>  123456789 & 16 ==> always values will be with  in 16.
			 Assume index 5 comes.
			 
		2. At index 5, store the 
			   EntrySet{
			      Key key;  = Yuvaraj
				  Value value; = 15000
				  int hashcode; = 123456789
				  Node next = null.
			   }
			   
	    Get:
			map.get("Yuvaraj");
			
			1. Calculate the Hash For Yuvaraj.
				Assume index 5 comes.
			
			2. Get the value of "Yuvaraj" 15000.
			
Category:
    HashMap -> No Order Maintanence.
	LinkedHashMap -> Order maintain
	TreeMap -> Ascending Order Maintain.
	

Override and Equals Method if in case of Custom Object?
What is hashCollision?

   Employee employee = new Employee();
   map.put(employee,"25");
   
   
   class Employee{
        public String employeeName;
		
		  // First Check
		  @Override
		  public int hashCode() 
		  {
			 return (int)employeeName.charAt(0);
		  }

		 // Second Check
		  @Override
		  public boolean equals(Object obj)
		  {
			return employeeName.equals((String)obj);
		  }
   }
	

 * @author Yuvaraj
 *
 */
public class HashMapClass {

	public static void main(String[] args) {
		//Map<Key,Value> mapReference = new HashMap<Key,Value>();
		Map<String,String> map = new HashMap<String,String>();
		Map<String,String> linkedHashmap = new LinkedHashMap<String,String>();
		Map<String,String> treeMap = new TreeMap<String,String>();
		
		treeMap.put("Z", "value");
		treeMap.put("A", "value");
		treeMap.put("T", "value");
		
		System.out.println("TreeMap"+treeMap);
		
		// Storing the value in HashMap
		// mapReference.put(Key,Value)
		Employee firstEmployee = new Employee();
		firstEmployee.setName("Nidhi");
		firstEmployee.setRollNo(26);
		map.put("firstEmployee", "First Employee");
		linkedHashmap.put("firstEmployee", "First Employee");
		
		Employee secondEmployee = new Employee();
		secondEmployee.setName("Yuvaraj");
		secondEmployee.setRollNo(25);
		map.put("secondEmployee", "Second Employee");
		linkedHashmap.put("secondEmployee", "Second Employee");
		
		// Retrieving the value in HashMap
		// mapReference.get(Key)
		map.get(firstEmployee);
		map.get(secondEmployee);
		
		System.out.println("Map********"+map);
		System.out.println("Linked********"+linkedHashmap);
		System.out.println(map.get("firstEmployee"));
		System.out.println(map.get("secondEmployee"));

	}

}
