package com.selenium.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		 driver.get("https://www.redfin.com/");
		 String baseUrl= driver.getCurrentUrl();
		 System.out.println(baseUrl);
		 
		 String expectedUrl= "https://www.redfin.com/";
		 
		 if(baseUrl.equalsIgnoreCase(expectedUrl)) {
			 System.out.println("Test Passed");
		 }else {
			 System.out.println("Test Failed");
		 }
		
		
		

	}

}
