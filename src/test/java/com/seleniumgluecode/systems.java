package com.seleniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.seleniumgluecode.Baseclass;

public class systems extends Baseclass {

	
	WebDriver driver = getDriver();
	
	public  systems(WebDriver driver) {
		this.driver = driver;
	}
	
	

	public void createsystem() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[@id='systems']")).click();
		
	System.out.println("Adding new system");
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//a[contains(text(),'Add new')]")).click();
	driver.findElement(By.id("system_add")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='title']/input")).click();
	
	driver.findElement(By.id("title")).sendKeys("Custom Big Commerce");
	driver.findElement(By.xpath("//*[@id='description']/div")).click();
	driver.findElement(By.id("description")).sendKeys("Custom Big commerce system");
	driver.findElement(By.xpath("//*[@id='form-container']/div/form/div[1]/div[1]/div[2]/div/div/div/div[2]")).click();
	driver.findElement(By.name("status_code")).sendKeys("401");
	driver.findElement(By.name("message")).sendKeys("title");
	driver.findElement(By.name("test_url")).sendKeys("https://api.bigcommerce.com/stores/GET_FROM_USER[store_hash]/v3/catalog/products");
	driver.findElement(By.xpath("//a[contains(text(),'Header')]")).click();
	driver.findElement(By.xpath("//p[contains(text(),' Bulk Edit ')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("test_header")).click();
	driver.findElement(By.name("test_header")).sendKeys("Content-Type::Content-Type::application/x-www-form-urlencoded\r\n"
			+ "X-Auth-Client::X-Auth-Client::GET_FROM_USER\r\n"
			+ "X-Auth-Token::X-Auth-Token::GET_FROM_USER\r\n"
			+ "Accept::Accept::application/json");
	

	driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	System.out.println("System added successfully");
	
	
	}
}


 

