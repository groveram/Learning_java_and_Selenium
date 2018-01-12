package com.Amit.WebDriverDay1;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchText {
	
	public static void main(String[] args) {
		//For launching the browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Amit\\My_WorkSpaceD:\\\\ToolsQA\\trunk\\Library\\drivers\\geckodriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.google.co.in");
		//search something on google, use find element function of webdriver interface or Chromedriver class
		
		
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div[2]/div/div/h3/a")).click();
		driver.manage().window().maximize();
		
	}

}
