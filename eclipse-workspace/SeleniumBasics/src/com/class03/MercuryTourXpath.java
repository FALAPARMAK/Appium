package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryTourXpath {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Mercury Tours Registration: Open chrome browser Go to
		 * “http://newtours.demoaut.com/” Click on Register Link Fill out all required
		 * info Click Submit User successfully registered
		 * 
		 */
		
		System.setProperty("webdriver.gecko.driver", "/Users/newowner/Selenium/geckodriver");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Hafsa");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("PSWDEQ");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Hafsa");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("PSWDEQ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		driver.close();
	}

}
