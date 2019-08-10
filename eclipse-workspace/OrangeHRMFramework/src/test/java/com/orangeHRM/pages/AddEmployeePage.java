package com.orangeHRM.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.utils.BaseClass;

public class AddEmployeePage extends BaseClass {
	@FindBy(id="firstName")
    public WebElement firstName;

    @FindBy(id="middleName")
    public WebElement middleName;

    @FindBy(id="lastName")
    public WebElement lastName;

    @FindBy(id="employeeId")
    public WebElement employeeId;

    @FindBy(xpath="//div[@id='location_inputfileddiv']//input")
    public WebElement location;

    @FindBy(xpath="//div[@id='location_inputfileddiv']//ul")
    public WebElement locationList;


    @FindBy(id="systemUserSaveBtn")
    public WebElement saveBtn;
    
    @FindBy(xpath="//span[@id='pim.navbar.employeeName']")
    public WebElement checkEmployee;
    
    @FindBy(xpath="//form[@id='pimAddEmployeeForm']//label")
    public List<WebElement> addEmpLabels;
    
    
    @FindBy(css="label[for='hasLoginDetails']")
    public WebElement createLoginBtn;
    
    @FindBy(css="input[id='username']")
    public WebElement createUserName;
    
    @FindBy(id="password")
    public WebElement createPassword;
    
    @FindBy(id="confirmPassword")
    public WebElement confirmPassword;
   
    @FindBy(xpath="//div[@id='essRoleId_inputfileddiv']//input")
    public WebElement ESS;
    
    @FindBy(xpath="//div[@id='essRoleId_inputfileddiv']//ul")
    public WebElement selectESSList;
    
    @FindBy(css="div[id^='supervisorRoleId'] input")
    public WebElement Supervisor;
    
    @FindBy(css="div[id^='supervisorRoleId'] ul")
    public WebElement selectSupervisorList;
    
    @FindBy(css="a[id='systemUserSaveBtn']")
    public WebElement createSaveBtn;
    
    public AddEmployeePage() { 
        PageFactory.initElements(driver,this);
    }
}
