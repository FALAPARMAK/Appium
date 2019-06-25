package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskCss {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 1: Mercury Tours Registration: Open
		 * chrome browser Go to “http://newtours.demoaut.com/” Click on Register Link
		 * Fill out all required info Click Submit User successfully registered
		 * 
		 */
		/*
		 * 
		 * css=tag#id   css= tag[attribute=’value’]
		 *  css=tag.class   css=tag^='value'] for starts with 
		 *  css=tag$='value'] for ends with 
		 *  css=tag*='value'] for contains
		 * 
		 */ 

		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.cssSelector("input[name*='first']")).sendKeys("Ali");
		driver.findElement(By.cssSelector("input[name*='lastName']")).sendKeys("Akar");
		driver.findElement(By.cssSelector("input[name^='pho']")).sendKeys("123223212");
		driver.findElement(By.cssSelector("input[id^='user']")).sendKeys("QWERE");
		driver.findElement(By.cssSelector("input[name$='address1']")).sendKeys("ertytgffjgdf");
		driver.findElement(By.cssSelector("input[name*='city']")).sendKeys("plano");
		driver.findElement(By.cssSelector("input[name$='te']")).sendKeys("Tx");
		driver.findElement(By.cssSelector("input[name*='postalCode']")).sendKeys("23232");
		driver.findElement(By.cssSelector("input[name*='email']")).sendKeys("Ali");
		driver.findElement(By.cssSelector("input[name$='password']")).sendKeys("QWERE");
		driver.findElement(By.cssSelector("input[name^='confirm']")).sendKeys("QWERE");
		driver.findElement(By.cssSelector("input[name$='register']")).click();
		driver.close();

	}

}
