package com.selenium.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePracticeMyself {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://testingpool.com/data-types-in-java/");
		
		List<WebElement> rows=driver.findElements(By.xpath("//div[contains(@class, 'su-table')]//tr"));
		int rowsize=rows.size();
		System.out.println("rowSize is "+rowsize);
		for (WebElement row : rows) {
			System.out.println(row.getText());
			System.out.println("-----");
		}
		
		
		List<WebElement> cols=driver.findElements(By.xpath("//div[contains(@class, 'su-table')]//tr[1]/td"));
	
		int colsize= cols.size();
		System.out.println("Size of cols are "+colsize);
		
		for(int i=1; i<=rowsize; i++) {
			for(int j=1; j<=colsize; j++ ) {
				WebElement cellData=driver.findElement(By.xpath("//div[contains(@class,'su-table')]//tr["+i+"]/td["+j+"]"));
				String cellDataText=cellData.getText();
				if(i==2 && j==3) {
					System.out.println(cellDataText);
			       break;
				}
			}
		}
		driver.close();
		
		
	}

}
