package com.class06;

import java.util.Iterator;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownReview {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "/Users/newowner/Selenium/geckodriver");
		
		//if we dont set the property we will get IllegalStateException
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");

		// if we pass wrong element type to the Select class
		// we will get UnexpectedTagNameException
//		WebElement button=driver.findElement(By.cssSelector("button#submit"));
//		Select select=new Select(button);
		// identify DD with <select>
		WebElement contriesDD = driver.findElement(By.cssSelector("select#continents"));
		// Pass to the Select class constructor
		Select select = new Select(contriesDD);
		//find how many options is available 
		List<WebElement> allOptions=select.getOptions();
		System.out.println("# of option in Country DD="+allOptions.size());
		
		System.out.println("------ all options from countries dd-------");
		Iterator<WebElement> it=allOptions.iterator();
		while(it.hasNext()) {
			String optionText=it.next().getText();
			System.out.println(optionText);
		}
		
		select.selectByVisibleText("Africa");
		Thread.sleep(3000);
		select.selectByIndex(5);
		Thread.sleep(3000);
		//deselect from single DD--> we will get UnsupportedOperationException: 
		//You may only deselect options of a multi-select
		//select.deselectByIndex(5);
		
		//working with MultiSelect
		WebElement commandsDD=driver.findElement(By.id("selenium_commands"));
		Select select1=new Select(commandsDD);
		List<WebElement> allOptions1=select1.getOptions();
		System.out.println("# of options in commands DD="+allOptions1.size());
		//printing all options
		System.out.println("------ all options from commands dd-------");
		for(int i=0; i<allOptions1.size(); i++) {
			String text=allOptions1.get(i).getText();
			System.out.println(text);
		}
		//checks if DD support multiple options
		if (select1.isMultiple()) {
			select1.selectByVisibleText("Navigation Commands");
			select1.selectByIndex(2);
			select1.selectByIndex(3);
			select1.selectByIndex(4);
			
			Thread.sleep(3000);
		}
		//deselecting options from MULTIPLE select/
		select1.deselectByIndex(2);
		Thread.sleep(3000);
		select1.deselectByVisibleText("Navigation Commands");
		select1.deselectAll();
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
