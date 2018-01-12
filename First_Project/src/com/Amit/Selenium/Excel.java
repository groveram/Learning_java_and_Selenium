package com.Amit.Selenium;

public class Excel implements MSOffice{

	@Override
	public void Open() {
		// TODO Auto-generated method stub
		
		System.out.println("This is to Open Excel file");
		
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		System.out.println("This is to Edit Excel file");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("This is to Save Excel file");
	}

}
