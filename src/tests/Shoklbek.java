package tests;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class Shoklbek extends CommonMethods{
	
	

	public static void main(String[] args) {
		Object[][] data= new Object[4][2];	
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		
		data[1][0]="locked_out_user";
		data[1][1]="secret_sauce";
		
		data[2][0]="problem_user";
		data[2][1]="secret_sauce";
		
		data[3][0]="performance_glitch_user";
		data[3][1]="secret_sauce";
		
		
	}

}
