package com.selenium.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class HrmLogo extends CommonMethods {

	public static void main(String[] args) {
		setUp();

		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']/img"));

		
		if(logo.isDisplayed()) {
			System.out.println("The test has passed");
		}else {
			System.out.println("It did not pass");
		}
		tearDown();

	}

}
