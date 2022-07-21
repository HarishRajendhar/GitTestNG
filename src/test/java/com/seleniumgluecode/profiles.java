package com.seleniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class profiles extends Baseclass {
	WebDriver driver = getDriver();
	
	
	@And("^select Change password$")
	public void select_change_password() throws InterruptedException {
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//img[@src='/static/images/avatar-new.svg']")).click();
		 driver.findElement(By.xpath("//div[@class='user-link-info']//div[contains(text(),'Change Password')]")).click();
	}

	
	@Then("^Enter \"(.*)\" and \"(.*)\"$")
	public void Enter_password_and_newpassword(String password,String newpassword) throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.name("old")).sendKeys(password);
		driver.findElement(By.name("new")).sendKeys(newpassword);
		driver.findElement(By.name("new1")).sendKeys(newpassword);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	 @And("^page refresh$")
	 public void page_refresh() throws InterruptedException {
		 Thread.sleep(1000);
		 driver.navigate().refresh();
	 }
	 
	 @And("^User click on user groups$")
	 public void User_click_on_user_groups() throws InterruptedException {
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@src='/static/images/avatar-new.svg']")).click();
		 driver.findElement(By.xpath("//div[@class='user-link-info']//div[contains(text(),'User Groups')]")).click();
	 }
	 @Then("^Click on Add new button$")
	 public void Click_on_Add_new_button() {
			driver.findElement(By.xpath("//div//a[contains(text(),'Add new')]")).click();
	 }
	 
	 @And("^user enter \"(.*)\" and \"(.*)\"$")
	 public void user_enter_groupname_and_description(String groupname ,String description) {
		 try {
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys(groupname);
		 driver.findElement(By.xpath("//textarea[@class='user-grp-desc']")).sendKeys(description);
		 driver.findElement(By.xpath("//label[@class='access-level-item']//div[contains(text(),'Admin')]")).click();
		 System.out.println("selecting admin level access for group");
		 driver.findElement(By.xpath("//button[contains(text(),'Create New User Group')]")).click();
	 }
		 catch(Exception e) {
				System.out.println("Unable to create new user group");
				System.out.println("Error is"+e);
			}}
	 @And("^Enter user mail id \"(.*)\"$")
	 public void Enter_user_mail_id_usermailid(String usermailid) throws InterruptedException {
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys(usermailid);
		 driver.findElement(By.xpath("//button[contains(text(),'Add User')]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		 driver.findElement(By.xpath("//button[contains(text(),'Update User Group')]")).click();
	 }
	 @And("^Accept invitation$")
	 public void Accept_invitation() throws InterruptedException {
		 try {
		 driver.findElement(By.xpath("//span[contains(text(),'Accept')]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
	 }catch(Exception e) {
			System.out.println("Unable to accept invitation");
			System.out.println("Error is"+e);
		}}
	 @Given("^Send project invite to \"(.*)\"$")
	 public void Send_project_invite_to_groupname(String groupname) throws InterruptedException {
		 try {
		 Thread.sleep(2000);
		 driver.findElement(By.id("react-select-2-input")).sendKeys(groupname);
		 driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath("//button[contains(text(),'Add Group')]")).click();
		 System.out.println("project invitation sent to the group"+groupname);
	 }catch(Exception e) {
			System.out.println("Unable to send project invite to group");
			System.out.println("Error is"+e);
		}}
	//from here code for logs page available 
	 @Then("^Navigate to logs page$")
	 public void Navigate_to_logs_page() {
		 driver.findElement(By.xpath("//img[@src='/static/images/menu-icons/logs.svg']")).click();
	 }
	 
	 @And("^Download log$")
	 public void Download_log() throws InterruptedException {
		 Thread.sleep(5000);
		 try {
		//driver.findElement(By.xpath("//button[contains(text(),'View Console')]")).click();
		 driver.findElement(By.xpath("//div[contains(text(),'01/05/2022 04:12:51 PM')]/following-sibling::div[2]/button")).click();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@src='/static/images/download_log.svg']")).click();
		System.out.println("Downloaded the console log");
	 }catch(Exception e) {
			System.out.println("Unable to Download logs");
			System.out.println("Error is"+e);
		}}
	 
	 @And("^Download log in v3 project$")
	 public void Download_log_in_v3_project() throws InterruptedException {
		 Thread.sleep(5000);
		 try {
		//driver.findElement(By.xpath("//button[contains(text(),'View Console')]")).click();
		 driver.findElement(By.xpath("//div[contains(text(),'02/17/2022 05:39:38 PM')]/following-sibling::div[2]/button")).click();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@src='/static/images/download_log.svg']")).click();
		System.out.println("Downloaded the console log");
	 }catch(Exception e) {
			System.out.println("Unable to Download logs");
			System.out.println("Error is"+e);
		}}
	 @And("^Click on view detailed logs$")
	 public void Click_on_view_detailed_logs() {
		 driver.findElement(By.xpath("//div[contains(text(),'01/05/2022 04:12:51 PM')]/following-sibling::div[3]/span")).click();
		 driver.findElement(By.xpath("//div//button[contains(text(),' View Detailed Logs')]")).click();
	 }
	 
	 @And("^Switch to \"(.*)\"$")
	 public void Switch_to_projectname(String projectname) {
		 try {
		 driver.findElement(By.xpath("//li[@class='switch_to_project']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Search project']")).sendKeys(projectname);
		 driver.findElement(By.xpath("//h4[contains(text(),'Mirakl - BigCommerce')]")).click();
		 driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		 
	 }catch(Exception e) {
			System.out.println("Unable to switch to different project");
			System.out.println("Error is"+e);
		}}
	 @And("^Switch to different \"(.*)\"$")
	 public void Switch_to_different_account(String account) throws InterruptedException {
		 try {
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class='switch-accounts-group']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Search account']")).sendKeys(account);
		 driver.findElement(By.xpath("//div[@class='account-email']")).click();
		 driver.findElement(By.xpath("//button[contains(text(),'Switch')]")).click();
	 }catch(Exception e) {
			System.out.println("Unable to switch to different account");
			System.out.println("Error is"+e);
		}}
	 }
