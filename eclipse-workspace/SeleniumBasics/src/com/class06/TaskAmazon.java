package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskAmazon {

	public static void main(String[] args) throws InterruptedException {
//		
//				TC 1: Amazon Department List Verification
//				Open chrome browser
//				Go to “http://amazon.com/”
//				Verify how many department options available.
//				Print each department
//				Select Computers
//				Quit browser
		
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");	
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		driver.get("http://amazon.com/");
			WebElement itemDD=driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select select=new Select(itemDD);
		List<WebElement> allOptions=select.getOptions();
		System.out.println("All DEpartment : "+allOptions.size());
		
		Iterator<WebElement> it=allOptions.iterator();
		while(it.hasNext()) {
			String text=it.next().getText();
			System.out.println(text);
		}

	}

}
