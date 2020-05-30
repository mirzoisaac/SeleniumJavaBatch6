package com.selenium.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAutomation {
//	TC 2: Mercury Tours Registration: 
//		Open chrome browser
//		Go to “http://newtours.demoaut.com/”
//		Click on Register Link
//		Fill out all required info
//		Click Submit
//		User successfully registered
//		(Create 2 scripts using different locators)

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("Register here")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Shoklbek");
		driver.findElement(By.name("lastName")).sendKeys("Mulla");
		driver.findElement(By.name("phone")).sendKeys("+12636489");
		driver.findElement(By.id("userName")).sendKeys("sair.exclusive@mail.ru");
		driver.findElement(By.name("address1")).sendKeys("1293 River");
		driver.findElement(By.name("city")).sendKeys("Woodbridge");
		driver.findElement(By.name("state")).sendKeys("Virginia");
		driver.findElement(By.name("postalCode")).sendKeys("22191");
		
		
		Select country= new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("RUSSIA");
		
		driver.findElement(By.id("email")).sendKeys("sair.exclusive@mail.ru");
		driver.findElement(By.name("password")).sendKeys("shoklbek");
		driver.findElement(By.name("confirmPassword")).sendKeys("shoklbek");
		driver.findElement(By.name("register")).click();
		
		
		
		
		
		

	}

}
