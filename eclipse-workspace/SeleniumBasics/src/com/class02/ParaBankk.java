package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankk {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/newowner/Selenium/chromedriver" );
		WebDriver driver=new ChromeDriver();
	 	
		driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		//driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.firstName")).sendKeys("Anna");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.lastName")).sendKeys("Smith");
		Thread.sleep(2000);
	 driver.findElement(By.id("customer.address.city")).sendKeys("Asel town");
	 Thread.sleep(2000);
	 driver.findElement(By.id("customer.address.state")).sendKeys("Tx");
	 Thread.sleep(2000);
 	 driver.findElement(By.id("customer.phoneNumber")).sendKeys("2787676522");
	 Thread.sleep(2000);
	 driver.findElement(By.id("customer.ssn")).sendKeys("222999110");
	 Thread.sleep(2000);
	 driver.findElement(By.id("customer.username")).sendKeys("BB");
	 Thread.sleep(2000);
	 driver.findElement(By.id("customer.password")).sendKeys("111122");
	 Thread.sleep(2000);
	 driver.findElement(By.id("repeatedPassword")).sendKeys("111122");
	 Thread.sleep(2000);
	 driver.findElement(By.className("button")).click();
	 Thread.sleep(5000);
	 driver.close();
	
	 



	}

}
