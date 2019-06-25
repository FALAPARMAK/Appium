package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.saucedemo.com");
		  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		  driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
		  driver.findElement(By.xpath("//input[@class=\"btn_action\"]")).click();
          driver.close();
	}

}
