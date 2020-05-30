package com.selenium.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
//		Thread.sleep(3000);
//		driver.close();
		driver.get("https://www.facebook.com");
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		
		//System.out.println(driver.getTitle());
		
		String actual=driver.getCurrentUrl();
		String expected="https://www.facebook.com";
		
		if(actual.equalsIgnoreCase(expected)) {
			String title=driver.getTitle();
			System.out.println(title);
		}else {
			System.out.println("Wrong Url is returned");
		}

		
	}

}
