package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import util.CommonMethods;

public class TaskUites {

	public static void main(String[] args) throws InterruptedException {
//		TC 2: Select and Deselect values
//		Open chrome browser
//		Go to “http://uitestpractice.com/”
//		Click on “Select” tab
//		Verify how many options available in the first drop down and then select “United states of America”
//		Verify how many options available in the second drop down and then select all.
//		Deselect China from the second drop down
//		Quit browser (edited) 
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.linkText("Select"));
      WebElement countriesDD=driver.findElement(By.id("select#countriesSingle"));
      CommonMethods.selectValueFromDropDown(countriesDD, "“United states of America");
		Select select =new Select(countriesDD);
		Thread.sleep(2000);
		
		select.selectByVisibleText("United states of America");
		
		
	}

}
