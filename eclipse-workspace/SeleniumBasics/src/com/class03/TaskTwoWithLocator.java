package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTwoWithLocator {
	public static void main(String[] args) {
		/*
		 * Open chrome browser
		Go to “http://newtours.demoaut.com/”
		Click on Register Link
		Fill out all required info
		Click Submit
		User successfully registered
		 * 
		 */ 
				
				System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
				WebDriver driver = new ChromeDriver();
				driver.navigate().to("http://newtours.demoaut.com/");
				driver.findElement(By.linkText("REGISTER")).click();
				driver.findElement(By.name("firstName")).sendKeys("john");
				driver.findElement(By.name("lastName")).sendKeys("Doe");
				driver.findElement(By.name("phone")).sendKeys("911");
				driver.findElement(By.id("userName")).sendKeys("test123@gmail.com");
				driver.findElement(By.name("address1")).sendKeys("123 main street");
				driver.findElement(By.name("city")).sendKeys("Ashburn");
				driver.findElement(By.name("state")).sendKeys("VA");
				driver.findElement(By.name("postalCode")).sendKeys("00000");
				driver.findElement(By.id("email")).sendKeys("test123");
				driver.findElement(By.name("password")).sendKeys("123");
				driver.findElement(By.name("confirmPassword")).sendKeys("123");
				driver.findElement(By.name("register")).click();
				driver.close();
				
				
			}
}
