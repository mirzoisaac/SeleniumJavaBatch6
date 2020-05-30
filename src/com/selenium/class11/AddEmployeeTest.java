package com.selenium.class11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.pages.AddEmployeePage;

import utils.CommonMethods;
import utils.ConfigsReader;

public class AddEmployeeTest extends CommonMethods{

	public static void main(String[] args) {
		setUp();
		
		AddEmployeePage addEmp= new AddEmployeePage();
		
		sendKeys(addEmp.username, ConfigsReader.getProperty("username"));
		sendKeys(addEmp.password, ConfigsReader.getProperty("password"));
		addEmp.loginBtn.click();
		
	    addEmp.pimBtn.click();
		addEmp.addEmployee.click();
		sendKeys(addEmp.firstName, "Misha");
		sendKeys(addEmp.lastName, "Jacksn");
		sendKeys(addEmp.employeeId, "0789");
		//addEmp.photofile.sendKeys("");--> adds Photo
		waitAndClick(addEmp.btnSave);
		addEmp.btnSave.click();
		addEmp.licExpDate.click();
		selectDdValue(addEmp.licExpMonth, "Jul");
		selectDdValue(addEmp.licExpYear, "2023");
		
		List<WebElement> day=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for (WebElement d : day) {
			if(d.getText().equals("18")){
				d.click();
				break;
			}
		}
		clickRadioOrCheckbox(addEmp.gender, "2");

	}

}
