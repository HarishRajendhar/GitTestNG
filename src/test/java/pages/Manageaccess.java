package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Manageaccess {
WebDriver driver;

@FindBy(xpath="//input[@placeholder='Email Address']")
WebElement Emailaddress;


@FindBy(xpath="//div[contains(text(),'Admin')]//parent::label")
WebElement Admin;

@FindBy(xpath="//button[contains(text(),'Add User')]")
WebElement Adduser;


@FindBy(xpath="//button[contains(text(),'Reset')]")
WebElement revok;


@FindBy(xpath="//div[@class='group-title']//img[@src='/static/images/reject_invite.svg']")
WebElement closeinvitation;

@FindBy(xpath="//a[@href='/invitations']")
WebElement invitationtab;


@FindBy(xpath="//div[@class='inv-highlight-dot']")
WebElement icon;

public  Manageaccess(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
}

public void revoke() throws InterruptedException {
	Thread.sleep(2000);
	
	try {
		if(revok.isDisplayed()){
			System.out.println("Invitation is sent alredy");
			Thread.sleep(2000);
			revok.click();
		}else {System.out.println("There are no invitations");}
	}catch(NoSuchElementException e){
		System.out.println("There is no invitation");
	}
}
public void manageaccess() throws InterruptedException {
//driver.findElement(By.xpath("//li[@id='users']")).click();
	try {
Emailaddress.sendKeys("thaheer123@yopmail.com");
Admin.click();
Adduser.click();
Thread.sleep(10000);
}
catch(Exception e) {
	System.out.println("Unable to add new user to the project");
	System.out.println("Error is"+e);
}}
public void invitecards() throws InterruptedException {
	Thread.sleep(1000);
	try {
	 closeinvitation.click();
	 
	 invitationtab.click();
	 
	 boolean groupnotification = icon.isDisplayed();
	 if(groupnotification==true) {
		 System.out.println("Notification displayed in users dashboard page");
	 }
	 else
	 {
		 System.out.println("There is no notifucations in users dashbnoard");
	 }
}
catch(Exception e) {
	System.out.println("There are no invited cards displayed to accept");
	System.out.println("Error is"+e);
}}

}