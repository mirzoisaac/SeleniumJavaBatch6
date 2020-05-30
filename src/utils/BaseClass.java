package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void setUp() {
		
		ConfigsReader.readProperties(Constants.CONFIGS_FILEPATH);
		
		switch (ConfigsReader.getProperty("browser").toLowerCase()) {//chrome/firefox
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);//ChromePath
			driver= new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", Constants.FIREFOX_DRIVER_PATH);
			driver= new FirefoxDriver();
			break;  
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.get(ConfigsReader.getProperty("url"));	
	}
	public static void tearDown() {
		if (driver!=null) {
			driver.quit();
		}
	}

}
