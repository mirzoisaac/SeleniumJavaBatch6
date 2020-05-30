package com.selenium.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TCAlertMethods extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp();
		driver.manage().window().maximize();
		driver.findElement(By.id("alert")).click();
		Thread.sleep(2000);
		acceptAlert();
		
		driver.findElement(By.id("confirm")).click();
		System.out.println(getAlertText());
		Thread.sleep(2000);
		dismissAlert();
		
		driver.findElement(By.id("prompt")).click();
		System.out.println(getAlertText());
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Hello John");
		Thread.sleep(2000);
		alert.accept();

	}

}
