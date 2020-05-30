package com.selenium.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class TC2VerifyElisEnabled extends CommonMethods {
//	TC 2: Verify element is enabled
//	Open chrome browser
//	Go to “https://the-internet.herokuapp.com/”
//	Click on “Click on the “Dynamic Controls” link
//	Click on enable button
//	Enter “Hello” and verify text is entered successfully
//	Close the browser 

	public static void main(String[] args) {
		
		setUp();
		WebElement element=driver.findElement(By.linkText("Dynamic Controls"));
		element.click();
		
		cssSelector("button[onclick='swapInput()']").click();
		
		//WebDriverWait wait= new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='text']")));
		WebElement text=driver.findElement(By.cssSelector("input[type='text']"));
		waitForClickability(text);
		text.sendKeys("Hello");
		
		

	}

}
