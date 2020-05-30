package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task01 {

	public static void main(String[] args) throws IOException {
		String filePath="C:\\Users\\mirzo\\eclipse-workspace\\JavaBasics\\configs\\Amazon.properties";
		//String filePath="C:\\Users\\mirzo\\eclipse-workspace\\JavaBasics\\Datas\\Task01.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fis);
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		String name=prop.getProperty("name");
		String password=prop.getProperty("password");
		String email=prop.getProperty("email");
		
		WebDriver driver = null;
		
		switch(browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			 driver=new ChromeDriver();
			
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
			 driver=new FirefoxDriver();
			 break;
		}
		
		driver.get(url);
		driver.findElement(By.className("nav-action-inner")).submit();
		driver.findElement(By.id("a-autoid-0-announce")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys(name);
		driver.findElement(By.id("ap_email")).sendKeys(email);
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("ap_password_check")).sendKeys(password);
		driver.findElement(By.id("continue")).click();
		
		

		
		

	}

}
