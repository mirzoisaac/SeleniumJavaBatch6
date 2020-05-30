package com.selenium.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class Tc01 extends BaseClass {
//	TC 1: HRMS Application Login: 
//		Open chrome browser
//		Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//		Enter valid username and password
//		Click on login button
//		Then verify Syntax Logo is displayed.

	public static void main(String[] args) {
		
		setUp();
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		WebElement logoD=driver.findElement(By.xpath("//img[contains(@src,'syntax.png') ]"));
		boolean logo=logoD.isDisplayed();
		System.out.println("Logo is displayed "+logo);
		
		tearDown();

	}

}
