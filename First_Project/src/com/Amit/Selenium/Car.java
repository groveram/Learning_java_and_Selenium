package com.Amit.Selenium;

public class Car {
	
	public Car(){
		
		System.out.println("This is Car class, it does not need object reference to execute, it just needs object creation");
	}

	public void test(){
		System.out.println("This is my first Method");
		
	}
	
	public static void main(String[] args){
		
		//Create an object classname object name=new classname()
		
		//Actually object creation format is 
		//ClassName Object Name=new Constructor()
		
		Car carobj=new Car();
		//Below statement shows memory allocated once object is created
		//System.out.println(carobj);
		
		carobj.test();
	}
	
}
