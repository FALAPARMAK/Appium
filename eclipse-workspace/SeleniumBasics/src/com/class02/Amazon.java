package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/newowner/Selenium/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		
		if(title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("This is the right tittle");
		}else {
			System.out.println("Sorry!This is not right tittle");
		}

	}

}
