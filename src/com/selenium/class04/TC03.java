package com.selenium.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.BaseClass;

public class TC03 extends BaseClass{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form/");
		
		//driver.findElement(By.xpath("//strong[text()='Partial Link Test']")).click();
		//driver.findElement(By.linkText("Partial Link Test")).click();
		
		WebElement male=driver.findElement(By.cssSelector("input[id='sex-0']"));
		
		System.out.println(male.isEnabled());
		male.click();
		System.out.println(male.getAttribute("value"));
		System.out.println(male.isSelected());
		
		
	    List<WebElement> gender=driver.findElements(By.xpath("//input[@name='sex']"));
	    
	    for(WebElement g:gender) {
	    	String values=g.getAttribute("value");
	    	System.out.println(values);
	    	if(g.isEnabled()) {
	    		if(values.contains("Female")) {
	    			g.click();
	    			break;
	    		}
	    	}
	    	
	    }
	    
	    
		
		
		
		

	}

}
