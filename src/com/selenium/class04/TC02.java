package com.selenium.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import utils.BaseClass;

public class TC02  extends BaseClass{
	/*
	 * TC 2: HRMS Application Negative Login: Open chrome browser Go to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login” Enter
	 * valid username Leave password field empty Verify error message with text
	 * “Password cannot be empty” is displayed.
	 * 
	 */

	public static void main(String[] args) {
		setUp();
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[id='txtPassword']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).sendKeys(Keys.RETURN);
		
		String text=driver.findElement(By.id("spanMessage")).getText();
		System.out.println(text);
		driver.quit();
		
		

	}

}
