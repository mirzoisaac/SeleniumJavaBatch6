package com.selenium.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskAmazon {
//	TC 1: Amazon link count: 
//		Open chrome browser
//		Go to “https://www.amazon.com/”
//		Get all links
//		Get number of links that has text
//		Print to console only the links that has text
	public static String url="https://www.amazon.com/";


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get(url);
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		int quantity=allLinks.size();
		System.out.println(quantity);
		int count=0;
		
		for (WebElement links : allLinks) {
			
			String text=links.getText();
			
			if(!text.isEmpty()) {
				//System.out.println(text);
				count++;
			}
		}
		System.out.println("Number of links with text are : "+count);
		
		driver.quit();

	}

}
