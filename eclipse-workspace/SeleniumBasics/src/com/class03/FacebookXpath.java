package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	public static void main(String[] args) {
		/*
		 * Using Xpath ONLY TC 1: Facebook login: Open chrome browser Go to
		 * “https://www.facebook.com/” Enter valid username and valid password and click
		 * login User successfully logged in
		 * 
		 */
		
		  System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		  WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hafsa");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("122117");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		

	}

}
