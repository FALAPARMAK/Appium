package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contain {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.saucedemo.com/");
		driver.findElement(By.xpath("//input[contains(@data-test,'user')]")).sendKeys("standart_user");
		driver.findElement(By.xpath("//input[starts-with(@type,'password')]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts_with(@class,'sub')]")).click();

	}

}
