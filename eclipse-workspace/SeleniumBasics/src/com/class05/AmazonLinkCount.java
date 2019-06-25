package com.class05;
import java.util.*;
import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinkCount {

	public static void main(String[] args) {
//		Amazon link count:
//			Open chrome browser
//			Go to “https://www.amazon.com/”
//			Using Iterator get text of each link
//			Get number of links that has text
		System.setProperty("webdriver.chrome.driver","/Users/newowner/Selenium/chromedriver" );
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		
		
		Iterator<WebElement>it=links.iterator();
		int count=0;
		while(it.hasNext()) {
			String link=it.next().getText();
			if(!link.isEmpty()) {
				System.out.println(link);
				count++; 
			}
		}

	}

}
