package com.selenium.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZillowTest {

//TC 2: Syntax Page URL Verification: 
//Open chrome browser
//Navigate to �https://www.zillow.com/�
//Navigate to �https://www.google.com/�
//Navigate back to Zillow Page
//Refresh current page
//Verify url contains �Zillow�

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		String zillow="https://www.zillow.com/";
		driver.navigate().to(zillow);
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		
		if(zillow.contains("Zillow")) {
			System.out.println("Test passed");
		}else{
			System.out.println("Test failed");
		}

	}

}
