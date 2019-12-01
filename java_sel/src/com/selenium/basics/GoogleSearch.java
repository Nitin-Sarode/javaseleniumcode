package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearch {

	//As a end user I should able to search any text from www.google.com page
		
		public static void main(String [] args)
		{
			//Set path 
			
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			//opening URL
			
			
			
		}
		
	}