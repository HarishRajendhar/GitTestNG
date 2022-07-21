package com.seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {

	
	protected static  WebDriver driver;
	
	protected WebDriver getDriver() {
		
		if(driver ==null) {
			System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
			//System.setProperty("webdriver.gecko.driver", "E:/geckodriver.exe");
		String baseUrl = "https://v3-dev.cloras.com/";
		//	 String baseUrl = "https://v3.cloras.com/";
			 
		      
		      System.out.println("Launching Google Chrome browser"); 
		      driver = new ChromeDriver();
		     //driver = new FirefoxDriver();
		      driver.manage().window().maximize();
		      driver.get(baseUrl);
		}
		return driver;
	}
	
}
