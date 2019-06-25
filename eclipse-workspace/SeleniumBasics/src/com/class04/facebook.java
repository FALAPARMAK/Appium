package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		
//				TC 1: Facebook login:
//			 	Open chrome browser
//				Go to “https://www.facebook.com/”
//				Enter valid username and valid password and click login
//				User successfully logged in
		
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("Betul");
driver.findElement(By.xpath("//input[starts-with(@id,'pas')]")).sendKeys("1231234");
driver.findElement(By.xpath("//input[starts-with(@value,'Log In')]")).click();

	}

} 
