package com.selenium.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import utils.BaseClass;

public class AlertTestMyself extends BaseClass {

	public static void main(String[] args) {
		setUp();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println(alertText);
		alert.accept();

	}

}
