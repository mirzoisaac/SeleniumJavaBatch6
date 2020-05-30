package com.selenium.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorTask {
//	Open chrome browser
//	Go to “http://newtours.demoaut.com/”
//	Click on Register Link
//	Fill out all required info (skip dropdowns)
//	Click Submit
//	User successfully registered
	public static String url = "http://newtours.demoaut.com";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.cssSelector("a[href*='register.php']")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Shoklbek");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Mullayev");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("+122344566");
		driver.findElement(By.cssSelector("input[id='userName']")).sendKeys("shoklbek@gmail.com");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("12847 River");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Woodbridge");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("VA");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("63626");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("shoklbek@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Virginia123");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("Virginia123");
		driver.findElement(By.cssSelector("input[type='image']")).click();

	}

}
