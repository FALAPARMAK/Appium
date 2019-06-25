package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
	
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Anna");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_e")).sendKeys("Smith");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("annaksllmez.@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("QWERTY");
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("May");
		
		Thread.sleep(2000);
		driver.findElement(By.id("day")).sendKeys("12");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("1992");
		Thread.sleep(2000);
		driver.findElements(By.id("login_page _39il UIPage_LoggedOut _-kb sf _61s0 _605a b_c3pyn-ahh chrome webkit mac x1 Locale_en_US cores-gte4 _19_u hasAXNavMenubar\""));
		driver.findElement(By.id("u_0_a")).click();
	}

}
