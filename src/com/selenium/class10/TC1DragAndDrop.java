package com.selenium.class10;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class TC1DragAndDrop extends CommonMethods {
	/*
	 * TC 1: Drag and Drop verification
	 *  Open chrome browser
	 *  Go to “http://www.uitestpractice.com/” 
	 * Click on “Droppable” link
	 *  Using mouse drag “Drag me to my target” to the “Drop Here” 
	 * Close the browser
	
	 */

	public static void main(String[] args) {
		setUp();
		
		WebElement drag=xpath("//div[@id='draggable']");
		WebElement drop=xpath("//div[@id='droppable']");
		
		Actions action= new Actions(driver);
		//action.clickAndHold(drag).moveToElement(drop).release().perform();
		
		action.dragAndDrop(drag, drop).perform();
		
		
		

	}

}
