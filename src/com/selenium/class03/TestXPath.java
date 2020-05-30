package com.selenium.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestXPath {
	
	public static String url="http://newtours.demoaut.com/";

	public static void main(String[] args) {
		// Xpath 
		//--> "//tag[@element='Attrivute']"
		
		//String url="http://newtours.demoaut.com/";

		 
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.navigate().to(url);
		driver.get(url);
		
		//driver.findElement(By.xpath("//a[contains(@href,'register.php']")).click();
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ilhom");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("ilhom@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("virginia123");
		
		driver.findElement(By.xpath("//input[contains(@name, 'confirm')]")).sendKeys("virginia123");
		
		
		driver.quit();
		driver=new ChromeDriver();

		
		driver.get(url);
		
		
		

	}

}
