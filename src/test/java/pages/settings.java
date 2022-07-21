package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class settings {

	
	WebDriver driver;
	//locating all element in setting page
	@FindBy(xpath="//*[@id='setting__general']/div[2]/div/div/div/div/div/div/div[1]")
	WebElement Timezone;
	
	@FindBy(xpath="//*[@id='react-select-2-input']")
	WebElement EnterTZ;
	
	@FindBy(xpath="//*[@id='setting__projects_console']/div[2]/div/div/div/div/div")
	WebElement consolelogs;
	
	@FindBy(xpath="//div[contains(text(),'Yes')]") WebElement Yes;
	
	@FindBy(xpath="//button[contains(text(),'Save Configuration')]") WebElement saveconfig;
	
	public settings(WebDriver driver) {
		this.driver = driver;
	}
	//All method and actions performing on settings pages
	public void enableconsolelogs() throws InterruptedException {
		try {
		Timezone.click();
		EnterTZ.sendKeys("Kolkata");   //searching for kolkata timezone
		EnterTZ.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		consolelogs.click();
	
		Yes.click(); //selecting console logs as yes
		
		Thread.sleep(2000);
		
		saveconfig.click();
		
		
	}
	catch(Exception e) {
		System.out.println("Unable to change project settings");
		System.out.println("Error is"+e);
	}}
}
