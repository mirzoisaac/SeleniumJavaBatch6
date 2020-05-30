package tests;

import org.openqa.selenium.By;

import utils.BaseClass;
import utils.ConfigsReader;
import utils.Constants;

public class TestofUtils extends BaseClass{

	public static void main(String[] args) {
		
		
		setUp();
		
		driver.findElement(By.id("email")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(ConfigsReader.getProperty("password"));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tearDown();

	}

}
