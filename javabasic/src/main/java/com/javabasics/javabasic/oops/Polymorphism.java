package com.javabasics.javabasic.oops;

/**
 * In Java polymorphism is mainly divided into two types:

		Compile time Polymorphism
		Runtime Polymorphism
		
1. Compile-time(when we write the program) polymorphism: It is also known as static polymorphism. 
This type of polymorphism is achieved by function overloading or operator overloading. 
	
	Method Overloading: When there are multiple functions with same name but different parameters then these functions are said to be 
	overloaded. 
	Functions can be overloaded by change in number of arguments or/and change in type of arguments.


 * @author dell
 *
 */
public class Polymorphism {

	public static void main(String[] args) {
		System.out.println(Multiply(2, 4));
		 
        System.out.println(Multiply(5.5, 6.3));
	}
	
    // Method with 2 parameter
    static int Multiply(int a, int b)
    {
        return a * b;
    }
    
   
    
   
    // Method with the same name but 2 double parameter
    static double Multiply(double yuvaraj, double b)
    {
        return yuvaraj * b;
    }

    
  
    // Method with the same name but 3 parameter
    static int Multiply(int a, int b, int c)
    {
        return a * b * c;
    }

}
