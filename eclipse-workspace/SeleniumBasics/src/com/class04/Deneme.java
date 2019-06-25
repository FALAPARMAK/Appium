package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Deneme {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
	driver.findElement(By.cssSelector("input[name*='first']")).sendKeys("Betul");
	driver.findElement(By.cssSelector("input[name*='lastname']")).sendKeys("Alaparmak");
	driver.findElement(By.cssSelector("label[class$='radio']")).click();
	driver.findElement(By.cssSelector("input[id$='exp-5']")).click();
	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06.28.1980");
	driver.findElement(By.cssSelector("label[class^='check']")).click();
	
	
	
	} 

}
