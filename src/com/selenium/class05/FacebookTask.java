package com.selenium.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.BaseClass;
//Open chrome browser
//Go to “https://www.facebook.com”
//Verify:
//month dd has 12 month options
//day dd has 31 day options
//year dd has 115 year options
//Select your date of birth	
//Quit browser

public class FacebookTask extends BaseClass{
	
	public static void main(String[] args) {
		
		setUp();
		WebElement verify=driver.findElement(By.id("month"));
		Select select= new Select(verify);
		
		
		
		List<WebElement> list=select.getOptions();
		int a=list.size();
		if(a==12) {
			System.out.println("Months are "+a);
		}else {
			System.out.println("The months quantity does not match");
		}
		select.selectByIndex(12);
		
		verify= driver.findElement(By.id("day"));
		select= new Select(verify);
		int b=select.getOptions().size();
		
		if(b==32) {
			System.out.println("It has 32 days");
		}else {
			System.out.println("The days are not matching");
		}
		
		select.selectByVisibleText("30");
		
		verify= driver.findElement(By.id("year"));
		select= new Select(verify);
		select.selectByValue("1991");
		
		verify=driver.findElement(By.cssSelector("input[id='u_0_7']"));
		verify.click();
		
		
		
	}

}
