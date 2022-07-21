package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Flow {

	
WebDriver driver;
	

@FindBy(xpath="//div[contains(text(),'Console')]")
WebElement Console;

@FindBy(xpath="//div[text()='Drag & Drop Handlers here to start building your Flow']")
WebElement drop;

	public Flow(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void createflow() throws InterruptedException {
		try {
		Thread.sleep(5000);
			
		driver.findElement(By.xpath("//*[@id='flows']")).click();
		System.out.println("Adding new Flow");
		driver.findElement(By.xpath("//a[contains(text(),'Add new')]")).click();
		Thread.sleep(2000);
	}
	catch(Exception e) {
		System.out.println("Unable to create a new flow");
		System.out.println("Error is"+e);
	}}
	public void importflow() throws InterruptedException {
		try {
		WebElement importflow = driver.findElement(By.id("upload"));
		
		importflow.sendKeys("C:\\Users\\L70\\Downloads\\Offers Flow (6).json");
		Thread.sleep(2000);

		
			}catch(Exception e) {
				System.out.println("Unable to import the flow");
				System.out.println("Error is"+e);
			}}
	public void draghandlers() throws InterruptedException {
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		  builder.clickAndHold(Console)
		  .pause(Duration.ofSeconds(3))
				.moveToElement(drop)
				.release()
				.build()
				.perform();
		

	        
	}
}
