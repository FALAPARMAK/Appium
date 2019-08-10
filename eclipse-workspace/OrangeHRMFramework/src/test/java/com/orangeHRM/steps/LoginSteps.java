package com.orangeHRM.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.LoginPage;
import com.orangeHRM.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;



public class LoginSteps  extends CommonMethods{
	
	LoginPage login;
	
	@Given("I navigated to OrangeHrm")
	public void i_navigated_to_OrangeHrm() {
	    setUp();
	}

	@Given("I see OrangeHrm logo")
	public void i_see_OrangeHrm_logo() {
	    login=new LoginPage();
	    boolean isDisplayed=login.logo.isDisplayed();
	    Assert.assertTrue(isDisplayed);
	} 

	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
		sendText(login.userName, "Admin");
		sendText(login.password, "XsWIb@cT45");
		
	}

	@When("I click login button")
	public void i_click_login_button() {
	   
		click(login.loginBtn);
	}
 
	@Then("I successfully logged in")
	public void i_successfully_logged_in() {
		HomePage home = new HomePage();
		Assert.assertTrue(home.dashboardText.isDisplayed());

	}
	@Then("I close browser")
	public void i_close_browser() {
	   tearDown();
	}
	@When("I enter invalid username and password")
	public void i_enter_invalid_username_and_password() {
		sendText(login.userName, "Test");
		sendText(login.password, "12345");
		

	}  

	@When("I click on login button")
	public void i_click_on_login_button() {
		click(login.loginBtn);
	}

	@Then("I see error message is displayed")
	public void i_see_error_message_is_displayed() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(login.message.isDisplayed());
		String errorText=login.message.getText();
		Assert.assertEquals("Invalid Credentials", errorText);
	    
	}
	@When("I enter invalid username and password I see errorMessage")
	public void i_enter_invalid_username_and_password_I_see_errorMessage(DataTable WrongCredentials) throws InterruptedException {
	 login=new LoginPage();
	List<Map<String,String>> listOfMap=WrongCredentials.asMaps(String.class,String.class);
	 for (Map<String, String> map : listOfMap) {
		 //passing username and password from datatable
		 sendText(login.userName,map.get("UserName") );
		 sendText(login.password, map.get("Password"));
		 Thread.sleep(2000);
		 click(login.loginBtn);
		String actualError= login.message.getText().trim();
		String expectedError=map.get("ErrorMessage");
		 Assert.assertEquals(expectedError, actualError);
		
		
		
		System.out.println(map.get("UserName"));
		System.out.println(map.get("Password"));
		System.out.println(map.get("ErrorMessage"));
		System.out.println("---------------------");
		
	}
		
	 

}
	}
