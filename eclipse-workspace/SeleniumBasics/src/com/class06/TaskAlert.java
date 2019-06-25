package com.class06;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskAlert {

	public static void main(String[] args) throws InterruptedException {
		//: JavaScript alert text verification
//		Open chrome browser
//		Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
//		Verify
//		alert box with text “I am an alert box!” is present
//		confirm box with text “Press a button!” is present
//		prompt box with text “Please enter your name” is present
//		Quit browser
		System.setProperty("webdriver.chrome.driver","/Users/newowner/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
  driver.findElement(By.linkText("Switch to")).click();
  driver.findElement(By.linkText("Alerts & Modals")).click();
  Alert alert=driver.switchTo().alert();
  alert.accept();
  driver.findElement(By.className("btn btn-default")).click();
	Thread.sleep(2000);
	
	Alert confirmAlert=driver.switchTo().alert();
	String Text=confirmAlert.getText();
	System.out.println(Text);
	}

}
