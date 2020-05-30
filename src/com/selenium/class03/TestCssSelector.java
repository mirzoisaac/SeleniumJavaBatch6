package com.selenium.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCssSelector {
	
	public static String url="https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {
		
		//CSS method
		// tagName[Attribute='Attribute Value']
		
		//
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get(url);
//		Thread.sleep(2000);
//		driver.navigate().refresh();
		//driver.findElement(By.name("email")).sendKeys("ilhom@gmail.com");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("ilhom@gmail.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("virginia123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// *= contains;
		// ^= starts-with;
		// $= ends-with;
		
		driver.quit();
		
		
	    

	}

}
