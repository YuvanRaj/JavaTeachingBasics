package com.javabasics.javabasic.practice;

import java.util.Scanner; 
import com.javabasics.javabasic.practice.Parent;

public class ChildClass extends Parent{

	public static void main(String[] str) {
		Scanner scan = new Scanner(System.in);
		double radius = scan.nextDouble();
		ChildClass childClass = new ChildClass();
		
		System.out.println(childClass.PARENT);
		
	}
}
