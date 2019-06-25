package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https:www.saucedemo.com/");
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@type='text']")).sendKeys("B");
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@type='password']")).sendKeys("w");
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@value='LOGIN']")).click();
		driver.close();
		
		
		
		
		
		
		
		
	}

}
