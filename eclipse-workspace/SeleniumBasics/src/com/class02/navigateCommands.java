package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/newowner/Selenium/chromedriver" );
		WebDriver driver=new ChromeDriver();
	 	driver.navigate().to("https://walmart.com");
		Thread.sleep(1000);
		driver.navigate().to("https://google.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		

	}

}
