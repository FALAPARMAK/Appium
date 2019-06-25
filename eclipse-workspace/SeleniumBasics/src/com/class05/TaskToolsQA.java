package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskToolsQA {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: Tools QA check all elements Open chrome browser Go to
		 * “https://www.toolsqa.com/automation-practice-form/” Fill out: First Name Last
		 * Name Check that sex radio buttons are enabled and select “Male” Check all
		 * Years of Experience radio buttons are clickable Date
		 *  Select both checkboxesfor profession 
		 *  Check all Automation Tools checkboxes are clickable and keep
		 * “Selenium WebDriver” option as selected Quit browser
		 */
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Ali");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Alaparmak");
		WebElement male = driver.findElement(By.id("sex-0"));
		System.out.println(male.isDisplayed());
		System.out.println(male.isSelected());
		 male.click();

		String str = "Male";
		List<WebElement> list = driver.findElements(By.id("Sex"));
		System.out.println(list.size());
		for (WebElement listt : list) {
            if(listt.isEnabled()) {
            	String value=listt.getAttribute("value");
            	System.out.println(value);
            	if(value.equals(str)) {
            		listt.click();
            	}
            }
		}
		List<WebElement>year=driver.findElements(By.xpath("//input[@name='exp']"));
		for(WebElement radio:year) {
			if(radio.isEnabled()) {
				radio.click();
				Thread.sleep(1000);
			}
		}
		driver.findElement(By.cssSelector("input[id='datepicker']")).sendKeys("01.01.2011");
		driver.findElement(By.cssSelector("input[id^='profession-0']")).click();
		driver.findElement(By.cssSelector("input[id^='profession-1']")).click();
		
		List<WebElement>tool=driver.findElements(By.name("tool"));
		for(WebElement findTool:tool) {
			if(findTool.isEnabled()) {
				String strr=findTool.getAttribute("value");
				System.out.println(strr+" checkboxess work");
				Thread.sleep(1000);
				if(strr.equals("Selenium Webdriver")) {
					findTool.click();
				}
			}
		}
		driver.quit();
	}

}
