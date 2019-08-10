package com.orangeHRM.steps;

import org.junit.Assert;

import com.orangeHRM.pages.AddEmployeePage;
import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.LoginPage;
import com.orangeHRM.utils.CommonMethods;
import com.orangeHRM.utils.ConfigsReader;
import com.orangeHRM.utils.Constant;
import com.orangeHRM.utils.ExcelUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExcelSteps extends CommonMethods{

	LoginPage login;
	HomePage home;
	AddEmployeePage emp;
	
	@Given("I logged in OrangeH")
	public void i_logged_in_OrangeH() {
		login=new LoginPage();
	   login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		
	   
	}

	@Given("I click on PIM")
	public void i_click_on_PIM() {
		home=new HomePage();
	   click(home.PIM);
	}

	@Given("I click on Add Employee")
	public void i_click_on_Add_Employee() {
	    click(home.addEmployee);
	}

	@When("I send firstname,middlename,lastname,location")
	public void i_send_firstname_middlename_lastname_location() throws InterruptedException {
		 home=new HomePage();
		  emp=new AddEmployeePage();
		  ExcelUtility excel=new ExcelUtility();
		  excel.openExcel(Constant.EXCEL_PATH,"mysheet");
		int rows=excel.getRowNumber();
		int cols=excel.getcolNumber(0);
		
		
		
		for(int i=1; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				String firstName=excel.getCellData(i, j);
				sendText(emp.firstName, firstName);
				String middleName=excel.getCellData(i, ++j);
				sendText(emp.middleName,middleName);
				String lastName=excel.getCellData(i, ++j);
				sendText(emp.lastName,lastName );
				String location=excel.getCellData(i, ++j);
				click(emp.location);
				
				selectList(emp.locationList,location);
				Thread.sleep(3000);
				waitForElementBeVisible(emp.saveBtn, 30);
				click(emp.saveBtn);
				Thread.sleep(3000);
				waitForElementBeVisible(emp.locationList, 30);
				 click(home.addEmployee);
				
			}
			Thread.sleep(3000);
			     //waitForElementBeVisible(emp., time);
			   
	}
		}

	@When("click Save Button")
	public void click_Save_Button() {
		
	}

	@Then("I see employee added")
	public void i_see_employee_added() {
		
	}

	
}
