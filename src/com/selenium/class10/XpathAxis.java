package com.selenium.class10;

public class XpathAxis {
	

	/*
	 * if one element is unique, you identify the next following sibling.
	 * 
	 * Example:
	 * //input[@id='calFromDate']/following-sibling::img
	 * 
	 *if you want any follwoing tag and want to use index, use below example
	 * //input[@id='calFromDate']/following::label[3]
	 * 
	 * 
	 *Using preceding-sibling:
	 *if you want to identify the proceeding tag by the current element/tag then use following syntax
	 *Example:
	 * //input[@id='calFromDate']/preceding-sibling::label
	 * 
	 * preceding::label
	 * //input[@id='calToDate']/preceding::label[2]
	 * 
	 * if you want to identify your ancestor tag from a child one use below example
	 * //input[@id='calToDate']/ancestor::form
	 * 
	 */

}
