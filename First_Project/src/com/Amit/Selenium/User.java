package com.Amit.Selenium;

public class User {
	
	public static void main(String[] args){
		
		//Below is conventional way to create object
		//Excel e=new Excel();
		//We can also create object specifying the Interface name, like below Interface MSOffice contains some 
		// unimplemented methods which are implemted in excel class as written below
		
		MSOffice e=new Excel();
		
		e.Open();
		
		Word w=new Word();
		
		w.Open();
	}

}
