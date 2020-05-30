package akaiIlhom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class FacebookTestMethods extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		//driver.findElement(By.id("u_0_m")).sendKeys("Ilhom");
		WebElement firstName=driver.findElement(By.id("u_0_m"));
		//firstName.sendKeys("Ilhom");
		sendKeys(firstName, "Ilhom");
		WebElement lastName=driver.findElement(By.id("u_0_o"));
		//lastName.sendKeys("Rasulov");
		sendKeys(lastName, "Ishankulov");
		
		List<WebElement> elements=driver.findElements(By.xpath("//input[@name='sex']"));
		radioButtonOrCheckbox(elements, "1");

		
		
	}
	public static void sendKeys(WebElement element, String value ) {
		element.clear();
		element.sendKeys(value);
		
	}
	public static void radioButtonOrCheckbox(List<WebElement> elements, String value) {
		
		for (WebElement sex : elements) {
			String actualValue=sex.getAttribute("value").trim();//returns a String//2
			//String actualValue=sex.getText();
			if(actualValue.equals(value) ){
				sex.click();
				break;
			}
		}
		
	}
	

}
