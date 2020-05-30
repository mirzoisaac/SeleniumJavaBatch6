package com.selenium.class10;

import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TC03Hrms extends CommonMethods {
//	TC 3: HRMS Login
//	Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//	Login to the application by writing xpath based on “parent and child relation”

	public static void main(String[] args) {
		setUp();
		WebElement username=xpath("//div[@id='divUsername']//following::input");
		sendKeys(username, "Admin");
		WebElement pass=xpath("//div[@id='divPassword']//following::input");
		sendKeys(pass, "Hum@nhrm123");
		xpath("//div[@id='divLoginButton']//following::input").click();
	}

}
