package com.selenium.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 1: Facebook sign up: 
//Open chrome browser
//Go to “https://www.facebook.com/”
//Enter first name
//Enter last name
//Enter mobile number
//Click on sign up button

public class FacebookTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("Shokl");
		driver.findElement(By.name("lastname")).sendKeys("Mulla");
		driver.findElement(By.name("reg_email__")).sendKeys("+1743292920");
		driver.findElement(By.name("websubmit")).click();
		
		

	}

}
