package com.orangeHRM.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

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


public class AddEmployeeSteps extends CommonMethods{
	LoginPage login;
	HomePage home;
	AddEmployeePage emp;
	
	
 
@Given("I logged in into OrangeHrm")
public void i_logged_in_into_OrangeHrm() {
    login=new LoginPage();
    home=new HomePage();
    emp=new AddEmployeePage();
    login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
}

@Given("I click on PIM link")
public void i_click_on_PIM_link() throws InterruptedException {
	 click(home.PIM);
Thread.sleep(20);
	
}

@Given("I click on  Add Employee link")
public void i_click_on_Add_Employee_link() {
	waitForElementBeClickable(home.addEmployee, 30);
    click(home.addEmployee);
}

  
//@When("I provide {string}, {string}, {string} and {string}")
//public void i_provide_and(String fName,String mName,String lName,String location) throws InterruptedException {
//	
//}


@When("I click on save button")
public void i_click_on_save_button() throws InterruptedException {
	Thread.sleep(2000);
   click(emp.saveBtn);
}
@Then("I see {string}, {string} is displayed")
public void i_see_is_displayed(String fName, String lName) throws InterruptedException {
	
	Thread.sleep(3000);
	//waitForElementBeVisible(emp.checkEmployee, 20);
	String empName=emp.checkEmployee.getText();
	Assert.assertEquals(fName+" "+lName,empName );
    
}

@When("I click on create login details")
public void i_click_on_create_login_details() {
   click(emp.createLoginBtn);
}

@When("I provide all mandatory fields")
public void i_provide_all_mandatory_fields() {
	sendText(emp.createUserName, "Sarah");
    sendText(emp.createPassword, "AqazWSX123!#$");
    sendText(emp.confirmPassword,"AqazWSX123!#$");
    click(emp.ESS);
    selectList(emp.selectESSList, "Default ESS");
    click(emp.Supervisor);
    selectList(emp.selectSupervisorList,"Default Supervisor");
    click(emp.createSaveBtn);
    
    
}

@Then("I see employee is added successfully")
public void i_see_employee_is_added_successfully() {
  
}
@When("I provide {string}, {string}, {string} and {string}")
public void i_provide_and(String fName, String mName, String lName, String location) throws InterruptedException {
	sendText(emp.firstName,fName );
	sendText(emp.middleName,mName);
	sendText(emp.lastName, lName);
	click(emp.location);
	waitForElementBeVisible(emp.locationList, 30);
	selectList(emp.locationList, location);
}

@When("I provide firstname,midlename, lastname and location")
public void i_provide_firstname_midlename_lastname_and_location() throws InterruptedException {
	
	}
	
	




@Then("I see following labels")
public void i_see_following_labels(io.cucumber.datatable.DataTable addEmpLabels) throws InterruptedException {
   List<String>labels=addEmpLabels.asList();
   System.out.println("----Printing labels from cucumber dataTable----");
  
  List<String>expectedLabels= addEmpLabels.asList();
   for (String label : labels) {
	System.out.println(label);
}
   
   
   //create an empty arrayList where we store labels text
   List<String> actualLabels = new ArrayList<String>();
   //get all label elements
  List<WebElement>labelList= emp.addEmpLabels;
   for (WebElement label : labelList) {
	  Thread.sleep(2000);
	  String labelText= label.getText().trim();
	  System.out.println(labelText);
	  //if text is not empty replace * and store it inside actualLabels
	
	  if(!labelText.isEmpty()) {
		  actualLabels.add(labelText.replace("*", ""));
	  }
	  
}
//   Assert.assertTrue(actualLabels.equals(expectedLabels));
   
   
   
//   
//   System.out.println("----Printing labels text from the application----");
//List<WebElement> labelList=emp.addEmpLabels;
//for (WebElement label: labelList) {
//	String labeltxt=label.getText();
//	System.out.println(labeltxt);
//	System.out.println(labeltxt.replace("*", ""));
//}
   
   
}


}
