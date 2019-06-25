package com.class06;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDene {

	public static void main(String[] args) throws InterruptedException {
//		1) Launch new Browser
//
//	2) Open URL “http://toolsqa.com/automation-practice-switch-windows/”
//
//	3) Get Window name (Use GetWindowHandle command)
//
//	4) Click on Button “New Message Window”, it will open a Pop Up Window
//
//	5) Get all the Windows name ( Use GetWindowHandles command)
//
//	6) Close the Pop Up Window (Use Switch Command to shift window)

		
			System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
			WebDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.get("http://toolsqa.com/automation-practice-switch-windows/");
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 String handle= driver.getWindowHandle();
			 
	         System.out.println(handle);
	         Set handles = driver.getWindowHandles();
	         System.out.println(handles);
	         //driver.findElement(By.name("New Message Window")).click();
	         
	      // Pass a window handle to the other window
	         for (String handle1 : driver.getWindowHandles()) {
	        	 
	             System.out.println(handle1);
	    
	             driver.switchTo().window(handle1);
	    
	             }
	}

}
