package com.selenium.class10;

import utils.CommonMethods;

public class TC04Hrms extends CommonMethods{

	public static void main(String[] args) {
		setUp();
		
		sendKeys(xpath("//span[@class='form-hint']/preceding-sibling::input"), "Admin");
		

	}

}
