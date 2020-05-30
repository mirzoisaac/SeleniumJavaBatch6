package com.selenium.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
		String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more" ;
		
		if(title.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		driver.close();

	}

}
