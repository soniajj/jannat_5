package com.testscenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.commonfunctions;

public class Login_page extends commonfunctions{/* with the help of extends key words we have to inheritance our parent class
	and child class*/
	
	
Locators obj = new Locators();
// we stored our re-usable methods under utility packege inside the commonfunctions class.
 @Test
  public void f() throws InterruptedException, Exception {
	 //Read the testdata.
	 Properties A = new Properties();
	 FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata\\QAtestdata.properties");
	 // Load the testdata file into A object.
	 A.load(fi);
	 ChromebrowserLunch();// its coming from child class. 
	// HeadlessbrowserLunch(); //for backend execution.
	 driver.get(A.getProperty("URL"));
		Thread.sleep(5000);
		sendKeysByAnyLocators(obj.login_UserName_EditBox,A.getProperty("UserName"));
		sendKeysByAnyLocators(obj.login_pass_EditBox,A.getProperty("Password"));
		ClickByAnyLocators(obj.Login_Button);
		
		
	
		}	}  
	
		
		
			
			
		
 
	   
	 
	 
	 
  

