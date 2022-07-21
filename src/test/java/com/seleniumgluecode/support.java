package com.seleniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class support extends Baseclass {
WebDriver driver= getDriver();

@When("^Click on help support icon$")
public void Click_on_help_support_icon() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@href='/support']")).click();
}
@And("^Click on new ticket button$")
public void Click_on_new_ticket_button() throws InterruptedException {
	try {
	Thread.sleep(1000);
driver.findElement(By.xpath("//button[contains(text(),'New Ticket')]")).click();
Thread.sleep(3000);

Select type = new Select(driver.findElement(By.xpath("//select[@name='support_type']")));
type.selectByVisibleText("General Enquiry");

Select prname = new Select(driver.findElement(By.xpath("//select[@name='project_id']")));
prname.selectByIndex(1);

driver.findElement(By.name("subject")).sendKeys("Test Ticket Created By Automation");

driver.findElement(By.xpath("//div[@data-placeholder='Type your message here...']")).sendKeys("Test ticket from automation script");

}catch(Exception e) {
	System.out.println("failed to create a new ticket");
	System.out.println("Error is"+e);
}}
@Then("^Submit the ticket")
public void Submit_the_ticket() {
driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
}
@When("Upload any documents")
public void upload_any_documents() {
	try {
   WebElement uploaddco = driver.findElement(By.id("upload_input"));
   uploaddco.sendKeys("C:\\Users\\L70\\Pictures\\Testing Image files\\Files\\file_example_XLS_10.xls");
   uploaddco.sendKeys("C:\\Users\\L70\\Pictures\\Testing Image files\\Files\\file-sample_150kB.pdf");
}catch(Exception e) {
	System.out.println("Unable to upload documents in support");
	System.out.println("Error is"+e);
}}
}





