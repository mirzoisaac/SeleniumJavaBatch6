package com.selenium.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class TC01Clickable extends CommonMethods {
//	TC 1: Verify element is clickable
//	Open chrome browser
//	Go to “https://the-internet.herokuapp.com/”
//	Click on “Click on the “Dynamic Controls” link
//	Select checkbox and click Remove
//	Click on Add button and verify “It's back!” text is displayed   
//	Close the browser 

	public static void main(String[] args) {
		setUp();
		WebElement element=driver.findElement(By.linkText("Dynamic Controls"));
		element.click();
		//driver.findElement(By.cssSelector("input[type=checkbox]")).click();
		cssSelector("input[type=checkbox]").click();
		//driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']")).click();
		cssSelector("button[onclick='swapCheckbox()']").click();
		WebElement addBtn=cssSelector("button[onclick='swapCheckbox()']");
		waitAndClick(addBtn);
		
		//WebDriverWait wait= new WebDriverWait(driver, 10);
		WebElement itsBackTxt=cssSelector("p[id=message]");
		if(itsBackTxt.isDisplayed()) {
			String text=itsBackTxt.getText();
			System.out.println("The text is:"+text+" and  it is "+itsBackTxt.isDisplayed());
		}
		tearDown();
		
		
		

	}

}
