package com.selenium.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class HrmLoginPage extends CommonMethods {
	
	public WebElement username= driver.findElement(By.id("txtUsername"));
	public WebElement password= driver.findElement(By.id("txtPassword"));
	public WebElement logo= driver.findElement(By.xpath("//div[@id='divLogo']/img"));
	

	
	

}
