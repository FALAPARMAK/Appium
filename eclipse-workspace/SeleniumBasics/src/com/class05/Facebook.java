package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * : Facebook dropdown verification
Open chrome browser
Go to “https://www.facebook.com”
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth    
Quit browser
		 */
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("u_0_c")).sendKeys("Betul");  
		driver.findElement(By.id("u_0_e")).sendKeys("Tarik");
		driver.findElement(By.id("u_0_h")).sendKeys("23212223390");
		driver.findElement(By.id("u_0_o")).sendKeys("232123");
		
		WebElement monthsDD=driver.findElement(By.cssSelector(("select[name='birthday_month']")));
		
		Select obj=new Select(monthsDD);
		//select by index
		obj.selectByIndex(9);
		Thread.sleep(2000);
		//select by visibleText
		//obj.selectByVisibleText("april");
		//get all options
		List<WebElement>allOptions=obj.getOptions();
		System.out.println(allOptions.size());
		
		Thread.sleep(2000);
		//driver.quit();
		
	WebElement dayDD=driver.findElement(By.cssSelector("select[name='birthday_day']"));
	Select obj1=new Select(dayDD);
	obj1.selectByIndex(2);
	Thread.sleep(2000);
	obj.selectByValue("14");
	List<WebElement>allOption=obj.getOptions();
	System.out.println(allOption.size());
	
	
	WebElement yearDD=driver.findElement(By.id("year"));
	Select obj2=new Select(yearDD);
	//obj2.selectByIndex(1999);
	obj2.selectByVisibleText("2000");
	Thread.sleep(2000);
	List<WebElement>allOpt=obj.getOptions();
	System.out.println(allOpt.size());
		
		}
	
		
		
		
		
//		WebElement identifier = driver.findElement(By.id("periodId"));
//		Select select = new Select(identifier);
//		select.selectByVisibleText("Last 52 Weeks");
	}


