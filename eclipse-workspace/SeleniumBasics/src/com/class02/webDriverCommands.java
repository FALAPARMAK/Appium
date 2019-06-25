package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDriverCommands {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "/Users/newowner/Selenium/geckodriver");
//		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","/Users/newowner/Selenium/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("google")) {
			System.out.println("this is the right tittle");
		}else {
			System.out.println("sorry this not the tiitle");
		}
		driver.get("http://facebook.com");
		String title2=driver.getTitle();
		System.out.println(driver.getTitle());

	}

}
