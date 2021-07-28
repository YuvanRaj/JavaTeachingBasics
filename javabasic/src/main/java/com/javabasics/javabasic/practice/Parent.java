package com.javabasics.javabasic.practice;

import java.util.Scanner;

class Parent{
 
  public static String PARENT= "i am parent";
  public  double circleArea(double r){
     return 3.14 * r * r;
  }
  
  public double areaOfRectangle(double length,double breadth) {
	  return length*breadth;
  }
  
  public static void main(String[] str){
    Scanner scan = new Scanner(System.in);
	double radius = scan.nextDouble();
	Parent p = new Parent();
	double area = p.circleArea(radius);
	System.out.println("Area of Circle"+area);
	scan.close();
  }
}