package com.selenium.class08;

import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class TC3WindowHandling extends CommonMethods {
//	TC 3: Windows Handling
//	Open chrome browser
//	Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//	Click on “Javascript Alerts” link
//	Click on “Window Popup Modal” link
//	Click on the “ Follow On Instagram” button
//	Verify title of the page is “Syntax Technologies (@syntaxtechs) • Instagram photos and videos” 
//	Click on the “Like us On Facebook ” button
//	Verify title of the page is “Go to Facebook Home” 
//	Quit the browser

	public static void main(String[] args) {
		
		setUp();
		xpath("//a[text()='Alerts & Modals']").click();
		driver.findElement(By.linkText("Window Popup Modal")).click();
		//driver.findElement(By.linkText("Follow On Instagram")).click();
		//switchSecondWindow(1);
		//System.out.println(driver.getTitle());
		//switchSecondWindow(0);
		driver.findElement(By.linkText("Like us On Facebook")).click();
		//switchSecondWindow(1);
		//System.out.println(driver.getTitle());
		String mainWindow=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		for (String window : windows) {
			if(!window.equals(mainWindow)) {
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			}
		}
		
		
		
		

	}

}
