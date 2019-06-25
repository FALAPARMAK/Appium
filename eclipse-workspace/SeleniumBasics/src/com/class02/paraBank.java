package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paraBank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/newowner/Selenium/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.firstName"));
		Thread.sleep(2000);
		driver.findElement(By.id("customer.lastName"));
		Thread.sleep(2000);
	 driver.findElement(By.id("customer.address.city"));//.sendKeys("Asel town");
	 Thread.sleep(2000);
	 driver.findElement(By.id("customer.address.state"));
	 Thread.sleep(2000);
 	 driver.findElement(By.id("customer.phoneNumber"));
	 Thread.sleep(2000);
	 driver.findElement(By.id("customer.ssn"));
	 Thread.sleep(2000);
	 driver.findElement(By.id("customer.username"));
	 Thread.sleep(2000);
	 driver.findElement(By.id("customer.password"));
	 Thread.sleep(2000);
	 driver.findElement(By.id("repeatedPassword"));
	 Thread.sleep(2000);
	 driver.findElement(By.className("button")).click();
	 Thread.sleep(5000);
	 driver.close();
	}

}
