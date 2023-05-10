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
	
	
Locators obj = new Locators();
// we stored our re-usable methods under utility packege inside the commonfunctions class.
 @Test
  public void f() throws InterruptedException {
	 ChromebrowserLunch();// its coming from child class. 
	// HeadlessbrowserLunch(); //for backend execution.
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		sendKeysByAnyLocators(obj.login_UserName_EditBox, "Admin");
		sendKeysByAnyLocators(obj.login_pass_EditBox, "admin123");
		ClickByAnyLocators(obj.Login_Button);
		
		
	
		}	}  
	
		
		
			
			
		
 
	   
	 
	 
	 
  

