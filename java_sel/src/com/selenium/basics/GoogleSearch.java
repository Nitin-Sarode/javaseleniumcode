package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearch 
{

	//As a end user I should able to search any text from www.google.com page
		
		public static void main(String [] args)
		{
			//Set Path 
			
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
			
			//WebDriver driver = new ChromeDriver();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			//opening URL	
			
			Thread.sleep(5000);
			
			//find a web element location
			
			WebElement searchbox = driver.findElementByName("q");
			
			//to seach a text you need to use sendkeys element			
			searchbox.sendKeys("w3 school site");
			
			//Hide ho raha he google search button so using tab hum log search kar rahe he
			
			searchbox.sendKeys(Keys.ENTER);
			
			//Google search element find
			//WebElement clickme = driver.findElementByName("btnk");
			
			//clickme.click();
	}	
}