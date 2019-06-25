package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsPositive {

	public static void main(String[] args) {
		/*TC 1: Swag Labs Positive login:
Open chrome browser
Go to “https://www.saucedemo.com/”
Enter valid username and valid password and click login
Verify robot icon is displayed
Verify “Products” text is available next to the
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input[id^='user']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[id$='word']")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[class*='btn_']")).click();
		
		boolean isDisplayed=driver.findElement(By.cssSelector("div[class*='product_label']")).isDisplayed();
		if (isDisplayed) {
			System.out.println("Logo is displayed");
		} else {
			System.out.println("Logo is NOT displayed");
		}
		WebElement element=driver.findElement(By.cssSelector("div.product_label"));
		String value=element.getText();
		
		if(isDisplayed&&value.equalsIgnoreCase("Products")) {
			System.out.println("Test case pass");
		}else {
			System.out.println("Test case fail");
		}
			
		driver.close();
		
	}

}
