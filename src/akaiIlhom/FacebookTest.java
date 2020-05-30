package akaiIlhom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.ConfigsReader;

public class FacebookTest {
	
	public static Properties prop;

	public static void main(String[] args) {
//		// if(text.equals("firefox"))
//		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
//		WebDriver driver1 = new FirefoxDriver();
//		// if(text.equals("chrome"))
		String chromeDriverPath=System.getProperty("user.dir")+"/Drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();

		String filePath = System.getProperty("user.dir") + "/configurations/akailhomconfigs.properties";
		
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException e) {
   		   e.printStackTrace();
   		   System.out.println("The Path is Incorrect");
		} catch (IOException e) {
		    e.printStackTrace();
		} 
		
		String url=prop.getProperty("url");
		driver.get(url);
		String browser=ConfigsReader.getProperty("browser");//chrome
		
		//driver.get("https://www.facebook.com");
		// driver.navigate().to("https://www.facebook.com");
		//driver.manage().window().maximize();
		// driver.navigate().refresh();
		// driver.get("https://www.google.com");
		// Thread.sleep(2000);
		// driver.navigate().back();

		// driver.findElement(By.name("firstname"));
		// driver.findElement(By.xpath("//input[@id='u_0_m']"));
		// driver.findElement(By.cssSelector("input[id='u_0_m']"));
//		WebElement firstName = driver.findElement(By.id("u_0_m"));
//		firstName.sendKeys("Saidnukriddin");
//		WebElement lastName = driver.findElement(By.name("lastname"));
//		lastName.sendKeys("Yakubov");

	}

}
