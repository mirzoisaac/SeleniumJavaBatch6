package com.selenium.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class AddEmployeePage {
	
	@FindBy(id="firstName")
	public WebElement firstName;
	@FindBy(id="lastName") public WebElement lastName;
	@FindBy (id="employeeId") public WebElement employeeId;
	@FindBy (id="photofile") public WebElement photofile;
	@FindBy (id="btnSave") public WebElement btnSave; 
	
	@FindBy(id="txtUsername") public WebElement username;
	
	@FindBy(name="txtPassword") public WebElement password;
	
	@FindBy(css="input#btnLogin") public WebElement loginBtn;
	@FindBy(id="menu_pim_addEmployee") public WebElement addEmployee;
	@FindBy(id="menu_pim_viewPimModule") public WebElement pimBtn;
	@FindBy(id="personal_txtLicExpDate") public WebElement licExpDate;
	@FindBy(xpath="//select[@class='ui-datepicker-month']") public WebElement licExpMonth;
	@FindBy(xpath="//select[@class='ui-datepicker-year']") public WebElement licExpYear;
	@FindBy(xpath="//input[@name='personal[optGender]']") public List<WebElement> gender;
	
	public AddEmployeePage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
