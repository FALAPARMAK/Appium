package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test {

	public static void main(String[] args) {
//		
//		System.setProperty("webdriver.chrome.driver","/Users/newowner/Selenium/chromedriver" );
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://google.com");
//		driver.get("http://facebook.com");
//		driver.get("http://amazon.com");
		
		System.setProperty("webdriver.gecko.driver", "/Users/newowner/Selenium/geckodriver");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://facebook.com");
		driver.get("http://amazon.com");
		driver.get("http://google");
	}

}
  