package com.selenium.class05;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC01Amazon {
//	TC 1: Amazon Department List Verification
//	Open chrome browser
//	Go to “http://amazon.com/”
//	Verify how many department options available.
//	Print each department 
//	Select Computers
//	Quit browser

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		WebElement departments=driver.findElement(By.cssSelector("select[id='searchDropdownBox']"));
		
		Select selectD= new Select(departments);
		List<WebElement> listD=selectD.getOptions();
		
		System.out.println("Available departments are :"+listD.size());
		
		for(WebElement l:listD) {
			System.out.println(l.getText());
			//System.out.println(l.getAttribute("value"));
		}
		selectD.selectByVisibleText("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		driver.findElement(By.cssSelector("input[type='submit'][class='nav-input']")).click();
		
		
		List<WebElement> options=driver.findElements(By.className("a-spacing-micro"));
		System.out.println(options.size());
//		for(WebElement o:options) {
//			System.out.println(o.getText());
//		}
//		WebDriverWait wait= new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.stalenessOf(option));
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		for (WebElement option : options) {
			String text=option.getText();
			
		
			if(!option.isSelected() && text.equals("Unofficial Cookbook")){
				   option.click(); 
				   break;  
				}
			
		}
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//
//		for (WebElement option : options) {
//			String text=option.getText();
//			if(!option.isSelected() && text.equals("English")) {
//				option.click();
//				break;
//			}
//		}

	}

}
