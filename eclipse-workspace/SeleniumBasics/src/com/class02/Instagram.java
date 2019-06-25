package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/newowner/Selenium/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.Instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.id("f1779af1257b9f8")).sendKeys("Betul");
		Thread.sleep(2000);
		driver.findElement(By.id("f326966ebafa994")).sendKeys("Oktay");
		Thread.sleep(2000);
		driver.findElement(By.id("f1c3d4039b41e3")).sendKeys("aa");
		Thread.sleep(2000);
		driver.close();
		
	}

}
