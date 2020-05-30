package com.selenium.class02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOfJava {
//	CREATE A PROPERTY FILE TO STORE following configurations:
//		browser=
//		url=
//		username=
//		password=
//
//		In your Selenum code use values from properties file to open specifified browser, 
//		navigate to specified url and enter username and password

	    public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String fileLoc = "C:\\Users\\mirzo\\eclipse-workspace\\JavaBasics\\configs\\Task01.properties";

		FileInputStream fis = new FileInputStream(fileLoc);

		Properties prop = new Properties();
		prop.load(fis);
		
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		
		driver.get(url);
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);

	}

}
