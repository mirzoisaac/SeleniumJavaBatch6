package com.selenium.class08;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.BaseClass;
import utils.CommonMethods;
import utils.ConfigsReader;

public class TC01Facebook extends CommonMethods {

	public static void main(String[] args) {
		setUp();

		WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
		sendKeys(firstName, "Shoklbek");

		WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
		sendKeys(lastName, "Shoklbekov");

		WebElement email = driver.findElement(By.cssSelector("input[name='reg_email__']"));
		sendKeys(email, "shoklbek@mail.ru");

//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		WebElement reEnterEmail = driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
		sendKeys(reEnterEmail, "shoklbek@mail.ru");

		WebElement passW = driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
		sendKeys(passW, ConfigsReader.getProperty("password"));

		List<WebElement> sex = driver.findElements(By.name("sex"));
		clickRadioOrCheckbox(sex, "2");

		WebElement month = driver.findElement(By.id("month"));
		selectDdValue(month, "Sep");

		WebElement day = driver.findElement(By.id("day"));
		selectDdValue(day, "22");
		
		WebElement year = driver.findElement(By.id("year"));
		selectDdValue(year, "1991");
		
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();

	}

}
