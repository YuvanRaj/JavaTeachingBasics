package com.javabasics.javabasic.oops;
/**
 * It is the mechanism in java by which one class is allowed to inherit the features(fields and methods) of another class.
 * 
 * 	Super Class: The class whose features are inherited is known as superclass(or a base class or a parent class).
 * 
 * Sub Class: The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class). 
 * 				The subclass can add its own fields and methods in addition to the superclass fields and methods.
 * 
 * How to use inheritance in Java

The keyword used for inheritance is extends.

class derived-class extends base-class  
{  
   //methods and fields  
} 
 * @author dell
 *
 */
class Bicycle {
	// the Bicycle class has two fields
	public int gear;
	public int speed;
	private String name;

	// the Bicycle class has one constructor
	public Bicycle(int gear, int speed)
	{
		this.gear = gear;
		this.speed = speed;
	}

	
	
	public int getGear() {
		return gear;
	}



	private void setGear(int gear) {
		this.gear = gear;
	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}



	// the Bicycle class has three methods
	public void applyBrake(int decrement)
	{
		speed -= decrement;
	}

	public void speedUp(int increment)
	{
		speed += increment;
	}

	// toString() method to print info of Bicycle
	public String toString()
	{
		return ("No of gears are " + gear + "\n"
				+ "speed of bicycle is " + speed);
	}
}

// derived class
class MountainBike extends Bicycle {

	// the MountainBike subclass adds one more field
	public int seatHeight;

	// the MountainBike subclass has one constructor
	public MountainBike(int gear, int speed,
						int startHeight)
	{
		// invoking base-class(Bicycle) constructor
		super(gear, speed);
		seatHeight = startHeight;
	}

	// the MountainBike subclass adds one more method
	public void setHeight(int newValue)
	{
		seatHeight = newValue;
	}

	// overriding toString() method
	// of Bicycle to print more info
	@Override public String toString()
	{
		return (super.toString() + "\nseat height is "
				+ seatHeight);
	}
}

// driver class
public class Inheritance {
	public static void main(String args[])
	{

		MountainBike mb = new MountainBike(3, 100, 25);
		mb.speedUp(2);
		
		
		System.out.println("Get Gear"+mb.getGear());
		
		System.out.println(mb.toString());
	}
}
