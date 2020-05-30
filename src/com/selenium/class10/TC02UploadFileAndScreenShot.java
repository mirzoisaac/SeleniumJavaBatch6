package com.selenium.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import utils.CommonMethods;

public class TC02UploadFileAndScreenShot extends CommonMethods {

	/*
	 * TC 2: Upload file and Take Screenshot 
	 * Navigate to“http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
	 * Upload file
	 * Verify file got successfully uploaded and take screenshot
	 */

	public static void main(String[] args) throws WebDriverException, IOException {
		setUp();
		String filePath="C:\\Users\\mirzo\\Desktop//test case.txt";
		xpath("//input[@id='gwt-debug-cwFileUpload']").sendKeys(filePath);
		
		xpath("//button[@class='gwt-Button']").click();
		
		Alert alert= driver.switchTo().alert();
		String alertText=alert.getText();
		
		
		if(alertText.equals("File uploaded!")) {
		alert.accept();
		System.out.println("File got successfully uploaded");
		}else {
			System.out.println("The file could not uploaded");
		}

		TakesScreenshot ts=(TakesScreenshot) driver;
		File uploaded=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(uploaded, new File("screenshots/uitestpractice/uploaded.png"));

	}

}
