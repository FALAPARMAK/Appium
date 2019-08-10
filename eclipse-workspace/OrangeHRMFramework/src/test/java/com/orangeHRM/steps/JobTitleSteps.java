package com.orangeHRM.steps;

import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.LoginPage;
import com.orangeHRM.utils.CommonMethods;
import com.orangeHRM.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JobTitleSteps extends CommonMethods {
	LoginPage login;
	HomePage home;
	@Given("I logged in OrangeHrm")
	public void i_logged_in_OrangeHrm() {
	login=new LoginPage();
	 login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@Given("I click on Admin link")
	public void i_click_on_Admin_link() {
		home=new HomePage();
		home.click(home.admin);
	   
	}

	@Given("I click on Job Link")
	public void i_click_on_Job_Link() {
		home.click(home.Job);
	    
	}

	@When("I click on Job Titles")
	public void i_click_on_Job_Titles() {
		home.click(home.JobTitle);
	  
	}

	@When("I get all Job Titles from UI")
	public void i_get_all_Job_Titles_from_UI() {
	    
	}

	@When("I execute {string}")
	public void i_execute(String string) {
	   
	}

	@Then("I see results from UI and Database are matched")
	public void i_see_results_from_UI_and_Database_are_matched() {
	    
	}


}
