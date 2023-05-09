package com.utilities;

import org.openqa.selenium.WebDriver;
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
	}
