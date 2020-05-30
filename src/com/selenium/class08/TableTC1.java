package com.selenium.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TableTC1  extends CommonMethods{
//	TC 1: Table headers and rows verification
//	Open chrome browser
//	Go to “http://166.62.36.207/syntaxpractice/”
//	Click on “Table” link
//	Click on “ITable Data Search” link
//	Verify second table consist of 5 rows and 4 columns
//	Print name of all column headers 
//	Print data of all rows
//	Quit Browser

	public static void main(String[] args) throws InterruptedException {
		setUp();
		driver.findElement(By.linkText("Table")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Table Data Search")).click();
        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
        List<WebElement> columns=driver.findElements(By.xpath("//table[@class='table']/thead[@class='thead-inverse']/tr/th"));
        System.out.println("Size of rows are "+rows.size()+" and columns are "+columns.size());
        
        for(WebElement c:columns) {
        	System.out.println(c.getText());
        }
        
        for(WebElement r:rows) {
        	System.out.println(r.getText());
        }
        
        
        driver.close();

	}

}
