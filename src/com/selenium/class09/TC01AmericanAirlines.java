package com.selenium.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TC01AmericanAirlines extends CommonMethods{
//	TC 1: Calendar headers and rows verification
//	Open chrome browser
//	Go to “https://www.aa.com/homePage.do”
//	Enter From and To
//	Select departure as July 14 of 2020
//	Select arrival as November 8 of 2020
//	Close browser
//	Depart Month Year Xpath: "//div[contains(@class, 'ui-corner-left')]/div"
//	Depart Month Days Xpath: //div[contains(@class, 'ui-corner-left')]/following-sibling::table/tbody/tr/td
//	Next Button Xpath: //a[@title='Next']
//	Return Month Xpath: //span[@class='ui-datepicker-month']
//	Return Days Xpath: //table[@class='ui-datepicker-calendar']/tbody/tr/td
//	You can put the logic the way you want.
	public static void main(String[] args)  {
		setUp();
		WebElement departCity=driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
		sendKeys(departCity, "JFK");
		WebElement arrivalCity=driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
		sendKeys(arrivalCity, "IAD");
		driver.findElement(By.xpath("//input[@id='aa-leavingOn']")).click();	
		
		WebElement dMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		while(!dMonth.getText().equals("July")){
			WebElement next=driver.findElement(By.xpath("//a[@title='Next']"));
			waitForClickability(next);
			next.click();
			dMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		}
		List<WebElement> daysElements=driver.findElements(By.xpath("//*[contains(@data-handler,'selectDay')]"));
		
		for (WebElement dayEl : daysElements) {
			String dDay=dayEl.getText();
			if(dDay.equals("14")) {
				dayEl.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@id='aa-returningFrom']")).click();
		
		WebElement aMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		while(!aMonth.getText().equals("November")){
			WebElement next=driver.findElement(By.xpath("//a[@title='Next']"));
			waitForClickability(next);
			next.click();
			aMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		}
		
		List<WebElement> arrDaysELements=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		for (WebElement arrDaysEl : arrDaysELements) {
			String aDay=arrDaysEl.getText();
			if(aDay.equals("8")) {
				arrDaysEl.click();
				break;
			}
		}
	}
	
}
