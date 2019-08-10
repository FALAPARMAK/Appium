package com.orangeHRM.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.orangeHRM.utils.BaseClass;
import com.orangeHRM.utils.CommonMethods;
import com.orangeHRM.utils.DbUtils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void start(Scenario scenario) {
		
		System.out.println("Starting test : "+scenario.getName());
		BaseClass.setUp();
	}
	@After
	public void end(Scenario scenario ) {
		System.out.println("Ending test:" + scenario.getName());
		
		if(scenario.isFailed() || !scenario.isFailed() ) {
			
			TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;
			byte [] source=ts.getScreenshotAs(OutputType.BYTES);
			scenario.embed(source, "image/png");
			
//			byte[] shot=CommonMethods.takeScreenshot();
//			scenario.embed(shot, "image/png");
		}
		
		BaseClass.tearDown();
	}
	
	@Before("@db")
	public void open() {
		DbUtils.createConnection();
	}
	
	@After("@db")
		public void close() {
		DbUtils.closeConnection();
		}
	
	
	
	}
	
	
	

