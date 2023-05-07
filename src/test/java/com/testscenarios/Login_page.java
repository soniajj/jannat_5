package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

public class Login_page {
	
WebDriver driver;	
Locators obj = new Locators();

@BeforeTest
public void Mango() {
	driver = new ChromeDriver();
	driver.get("https://autotestdata.com/");
}
 @Test
  public void f() {
	 
	 driver.findElement(obj.login_Button).click();
	   driver.findElement(obj.login_Email_EditBox).sendKeys("jferdous2791@gmail.com");
	   driver.findElement(obj.login_pass_EditBox).sendKeys("2345678");
	  // driver.findElement(obj.Login_Box).click();
		  
   
	  driver.quit(); 
	 
	 
	 
  }
}
