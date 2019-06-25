package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement maleRadio=driver.findElement(By.id("sex-0"));
		System.out.println(maleRadio.isDisplayed());
		System.out.println(maleRadio.isEnabled());// true
		System.out.println(maleRadio.isSelected());// false
		Thread.sleep(2000);
		// 1 way of clicking on the element
		maleRadio.click();
		System.out.println(maleRadio.isSelected());// true

		// 2 way - preffered way
		String valueToSelect = "Automation Tester";
		List<WebElement> professionList = driver.findElements(By.name("profession"));

		System.out.println(professionList.size());

		for (WebElement profession : professionList) {
			
			if (profession.isEnabled()) {
				
				String value = profession.getAttribute("value");
				System.out.println(value);
				
				if (value.equals(valueToSelect)) {
					profession.click();
				}
			}
		}
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
