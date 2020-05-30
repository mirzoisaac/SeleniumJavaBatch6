package com.selenium.class08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class OpeningWindows extends CommonMethods {

	public static void main(String[] args) {
		setUp();
		driver.findElement(By.linkText("Follow On Instagram")).click();
		switchSecondWindow(1);

		// driver.switchTo().window(arg0);
		tearDown();
	}

	public static void switchSecondWindow(int index) {

		Set<String> windows = driver.getWindowHandles();
		List<String> window = new ArrayList<>(windows);
		if (index == 0) {
			String mainWindow = window.get(0);
			driver.switchTo().window(mainWindow);
		}
		if(index==1) {
			String secondWindow=window.get(1);
			driver.switchTo().window(secondWindow);
		}
		if(index==2) {
			String secondWindow=window.get(2);
			driver.switchTo().window(secondWindow);
		}
		
		
	}

}
