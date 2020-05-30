package com.selenium.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TXpathTask01 {
//	Using xPath ONLY
//	TC 2: Mercury Tours Registration: 
//		Open chrome browser
//		Go to “http://newtours.demoaut.com/”
//		Click on Register Link
//		Fill out all required info (skip dropdowns)
//		Click Submit
//		User successfully registered
	 public static String url="http://newtours.demoaut.com";


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(url);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Shoklbek");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Mullayev");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("+12345883833");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("124 River ");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Woodbridge");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("VA");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shokl@gamil.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("virginia123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("virginia123");
		driver.findElement(By.xpath("//input[@type='image']")).click();
		

	}

}
