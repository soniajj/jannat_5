package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.commonfunctions;

public class Login_page extends commonfunctions{/* with the help of extends key words we have to inheritance our parent class
	and child class*/
	
//WebDriver driver;	
//Classname Objectname = new Classname();	
Locators obj = new Locators();

//@BeforeTest
//public void Mango() {
	//driver = new ChromeDriver();
	//driver.get("https://autotestdata.com/");
//}
 @Test
  public void f() throws InterruptedException {
	 ChromebrowserLunch();// its coming from child class. 
	// HeadlessbrowserLunch(); //for backend execution.
	 /*driver.get("https://autotestdata.com/");
	 driver.findElement(obj.login_Button).click();
	   driver.findElement(obj.login_Email_EditBox).sendKeys("jferdous2791@gmail.com");
	   driver.findElement(obj.login_pass_EditBox).sendKeys("2345678");
	   driver.findElement(obj.Login_Box).click();*/
	   
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		if(driver.findElements(obj.login_UserName_EditBox).size()>0) {
			System.out.println("Given username locator is displayed");
			if(driver.findElement(obj.login_UserName_EditBox).isEnabled()) {
				driver.findElement(obj.login_UserName_EditBox).clear();
				driver.findElement(obj.login_UserName_EditBox).sendKeys("Admin");
			}
			else {
				System.out.println("Given locator is not displayed");
				}
		}	  
		Thread.sleep(5000);
		// password edit box.
		if(driver.findElements(obj.login_pass_EditBox).size()>0) {
			System.out.println("Given password locator is displayed");
			if(driver.findElement(obj.login_pass_EditBox).isEnabled()) {
				driver.findElement(obj.login_pass_EditBox).clear();
				driver.findElement(obj.login_pass_EditBox).sendKeys("admin123");
			}
			else {
				System.out.println("Given locator is not displayed");
				}
		}
			Thread.sleep(5000);
			// login button edit box.
			if(driver.findElements(obj.Login_Button).size()>0) {
				System.out.println("Given login button locator is displayed");
				if(driver.findElement(obj.Login_Button).isEnabled()) {
					driver.findElement(obj.Login_Button).click();
					
				}
				else {
					System.out.println("Given locator is not displayed");
					}
				}
				driver.quit(); }
			}
		
 
	   
	 
	 
	 
  

