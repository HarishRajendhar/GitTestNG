package com.seleniumgluecode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class template extends Baseclass {

		WebDriver driver = getDriver();
		
		Actions act = new Actions(driver);
		
	@When("Navigate to exchange")
	public void navigate_to_exchange() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[@id='exchange']")).click();
	}

	@When("Create new template")
	public void create_new_template() throws InterruptedException {
		Thread.sleep(5000);
			WebElement CT= driver.findElement(By.xpath("//span[contains(text(),'Create Template')]"));
			
			act.doubleClick(CT).perform();
			Thread.sleep(1000);	
	   driver.findElement(By.name("templateName")).sendKeys("Testing template from automation");
	   driver.findElement(By.name("shortDescription")).sendKeys("Testing");
	   driver.findElement(By.xpath("//div[@data-placeholder='Type Detailed Description']")).sendKeys("Testing decription");
	   driver.findElement(By.name("selectAll")).click();
	  
	}

	@Then("Save and publish the template")
	public void save_and_publish_the_template() throws InterruptedException {
		Thread.sleep(1000);
	act.doubleClick(driver.findElement(By.xpath("//span[contains(text(),'Save & Publish')]"))).perform();
	driver.findElement(By.name("versionChange")).sendKeys("1.0.0");
	driver.findElement(By.xpath("//div[@data-placeholder='Provide Release Notes']//p")).sendKeys("Testing notes");
	act.click(driver.findElement(By.xpath("//div[@class='ant-modal-footer']//button//span[contains(text(),'Publish')]"))).perform();
	}
	@When("^Update Template$")
	public void Update_templates() throws InterruptedException {
		Thread.sleep(1000);
		act.click(driver.findElement(By.xpath("//*[@id='template-list']/div/div[2]/div/div/div[1]/div[1]/div[1]/img"))).perform();
	}
}


