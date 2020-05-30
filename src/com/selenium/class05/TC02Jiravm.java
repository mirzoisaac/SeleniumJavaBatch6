package com.selenium.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC02Jiravm {

	public static void main(String[] args) throws InterruptedException {
//		TC 2: Select and Deselect values
//		Open chrome browser
//		Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//		Click on “Input Forms” links
//		Click on “Select Dropdown List” links
//		Select value from “Select List Demo” section
//		Verify value has been selected
//		Select 4 options from “Multi Select List Demo”
//		Deselect 1 of the option from the dd
//		Quit browser
//		Collapse
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.linkText("Select Dropdown List")).click();
		
		WebElement demo=driver.findElement(By.xpath("//select[@id='select-demo']"));
	    Select selectDD= new Select(demo);
	    
	    List<WebElement> listSelect=selectDD.getOptions();
		
		for (WebElement l : listSelect) {
			//System.out.println(l.getAttribute("value"));
			//System.out.println(l.getText());
			//selectDD.selectByIndex(4);
		   //selectDD.selectByValue("Monday");
			selectDD.selectByVisibleText("Saturday");
			
			String day=l.getText();
			if(day.equals("Saturday")) {
				System.out.println(l.isSelected());
			}
			
		}
		WebElement multi= driver.findElement(By.id("multi-select"));
		Select multiDD=new Select(multi);
		
		System.out.println(multiDD.isMultiple());
		
		if(multiDD.isMultiple()) {
			multiDD.selectByIndex(1);
			multiDD.selectByValue("New York");
			multiDD.selectByValue("Ohio");
			multiDD.selectByVisibleText("Washington");
		}
		
		multiDD.deselectByValue("Ohio");
		
		
		
		
		//driver.close();
		

	}
}
