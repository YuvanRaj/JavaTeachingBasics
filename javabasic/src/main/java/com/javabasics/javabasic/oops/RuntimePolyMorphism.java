package com.javabasics.javabasic.oops;

import java.sql.SQLException;

/**
 * 2. Runtime polymorphism: It is also known as Dynamic Method Dispatch. 
 * It is a process in which a function call to the overridden method is resolved at Runtime. 
 * This type of polymorphism is achieved by Method Overriding.

Method overriding, on the other hand, occurs when a derived class has a definition for one of the member functions of the 
	base class. That base function is said to be overridden.


 * @author dell
 *
 */
public class RuntimePolyMorphism {

			
	
	public static void main(String[] args) {
        
        
        Parent a = new subclass1();
        a.Print();
  
        a = new subclass2();
        a.Print();

	}

}


//Java program for Method overriding

// can static method be overiden?
// Can we override final method
// Can we change the Exception type 
//

class Parent {

 void Print()
 {
     System.out.println("parent class");
 }
}

class subclass1 extends Parent {

 void Print() 
 {
     System.out.println("subclass1");
 }
}

class subclass2 extends Parent {

 void Print()
 {
     System.out.println("subclass2");
 }
}

