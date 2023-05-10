package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class commonfunctions {
	// here we will develop re_usable code.
	public WebDriver driver;
	
	public void ChromebrowserLunch() {//multiple re usable browser.
		driver = new ChromeDriver();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		System.out.println("Window will maximize");
	}
	public void EdgebrowserLunch() {
		driver = new EdgeDriver();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		System.out.println("edge will maximize");
	}
	
	public void HeadlessbrowserLunch() {// we have to add htmlunit driver dependenciy.
		driver = new HtmlUnitDriver();
	System.out.println("Headless browser is Lunched");// it will execute the code backend.
	
	
	
	}
	//Re- useble methods.
	public void sendKeysByAnyLocators(By locators,String inputdata) {
		WebElement element = driver.findElement(locators);
		//Check your locator id displayed?
		if(driver.findElements(locators).size()>0) {
			// check your element is in enable state?
		
			if(element.isEnabled()) {
				System.out.println("Given locators is enable state***");
				//Clear any existing data.
				element.clear();
				//send the data to edit box.
				element.sendKeys(inputdata);
			}
			else {
				System.out.println("Given locator is not enable state on DOM(current page***) ");
			}
			}
			else {
				System.out.println("Given locator is not displayed on DOM(current page***) ");
			}
		}
	public void ClickByAnyLocators(By locators) {
		WebElement element = driver.findElement(locators);
		//Check your locator id displayed?
		if(driver.findElements(locators).size()>0) {
			// check your element is in enable state?
		
			if(element.isEnabled()) {
				System.out.println("Given locators is enable state***");
				//click on button/check box/radio box.
				element.click();
				
			}
			else {
				System.out.println("Given locator is not enable state on DOM(current page***) ");
			}
			}
			else {
				System.out.println("Given locator is not displayed on DOM(current page***) ");
			}
	}
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
