package com.seleniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.APImanager;
import pages.Flow;
import pages.Manageaccess;
import pages.credentials;
import pages.integrationpage;
import pages.loginpage;
import pages.project;

public class login extends Baseclass {
	WebDriver driver = getDriver();
  
//WebDriver driver;
  integrationpage pipe = new integrationpage(driver);
  APImanager api = new APImanager(driver);
  Flow flow=new Flow(driver);
  systems s=new systems(driver);
  credentials cred = new credentials(driver);
  Manageaccess access = new Manageaccess(driver);
  project projectpage = new project(driver);
  
  
	@Given("^User is on homepage$") 
	public void User_is_on_homepage()     {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("first step");
	System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		
	//	System.setProperty("webdriver.gecko.driver", "E:/geckodriver.exe");
		  String baseUrl = "https://v3-dev.cloras.com/";
	      
	      
	      System.out.println("Launching Google Chrome browser"); 
	    driver = new ChromeDriver();
	   //  driver = new FirefoxDriver();
	      driver.manage().window().maximize();
	      driver.get(baseUrl);
	    
	      
	}
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void User_enters_username_and_password(String username, String password) throws InterruptedException {
		try {
		Thread.sleep(1000);
		  driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("password")).sendKeys(password);
	
	}
	catch(Exception e) {
		System.out.println("Unable to enter username and password");
	}}
	@When("^User navigates to Login Page$")
	public void User_navigates_to_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		
		  String baseUrl = "https://v3-dev.cloras.com/";
	      
	      
	      System.out.println("Launching Google Chrome browser"); 
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get(baseUrl);
	}

	@And("^User enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//  driver.findElement(By.name("username")).sendKeys("shaikth@dckap.com");
		  //driver.findElement(By.name("password")).sendKeys("Thaheer498");
		loginpage loginuser = new loginpage(driver);
	      loginuser.invalidlogin();
	     
	      loginuser.Enteremail();
	      loginuser.enterpassword("Thaheer498");
	      loginuser.lightitup();
	}

	
	@Then("^Invalid login message is displayed$")
	public void Invalid_login_message_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[contains(text(),'Light It Up')]")).click();
	}
	@Then("^Success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[contains(text(),'Light It Up')]")).click();
	}
	@And("^Click on Light It Up button$")
	public void Click_on_Light_It_Up_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Light It Up')]")).click();
	}
	
	@When("^User click on project icon$")
	public void User_click_on_project_icon() throws InterruptedException {
		Thread.sleep(2000); 
		try {
		driver.findElement(By.xpath("//img[@src='/static/images/menu-icons/projects.svg']")).click();
	}catch(Exception e) {
		System.out.println("Unable to click on project icon");
	}}
	
	@And("^Create new project$")
	public void Create_new_project() {
		//driver.findElement(By.xpath("//a[@href='/projects/add']")).click();
		projectpage.clickadd();
	}
	
	@And("^User1 enters \"(.*)\" and \"(.*)\"$")
	public void User_enters_ProjectName_and_Description(String projectname, String description) throws InterruptedException {
	try {
		//driver.findElement(By.name("project_name")).sendKeys(projectname);
		 // driver.findElement(By.name("project_description")).sendKeys(description);
		  //driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		projectpage.createproject();
	}
	catch(Exception e) {
		System.out.println("Unable to enter project name and description");
	}}
	 @Then("^Navigate to project workspace$")
	 public void Navigate_to_project_workspace() throws InterruptedException {
		 project openproject = new project(driver);
		      openproject.manage();
	 }
	 @Then("^Navigate to v3 project workspace$")
	 public void Navigate_to_v3_project_workspace() throws InterruptedException {
		 project openproject = new project(driver);
		      openproject.v3manage();
	 }           
	 
	 @Given("^User click on credentials icon$")
	 public void User_click_on_credentials_icon() throws InterruptedException {
		 try {
	 	Thread.sleep(5000);
	 	driver.findElement(By.xpath("//img[@src='/static/images/menu-icons/credentials.svg']")).click();
		driver.findElement(By.xpath("//div//a[contains(text(),'Add new')]")).click();
	 }
	 catch(Exception e) {
			System.out.println("Unable to click on credentials Icon");
			System.out.println("Error is"+e);
		}}
	 @And("^Create new credentials$")
	 public void Create_new_credentials() throws InterruptedException {
	  
		cred.createcredentials();

	   
	 }

	 @Then("^Test credential connection$")
	 public void Test_credential_connection() throws InterruptedException {
		//  cred.testconnection();
		 try {
		 Thread.sleep(3000);
			driver.findElement(By.xpath("//button[contains(text(),'Test Connection')]")).click();
			Thread.sleep(1000);
			String message = driver.findElement(By.xpath("//span[@class='jconfirm-title']/p")).getText();
			System.out.println("Test connection messageis"+message);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
	 }catch(Exception e) {
			System.out.println("Unable to test the credential connection");
			System.out.println("Error is"+e);
		}}
	 
	 @When("^Hover on Advanced icon$")
	 public void Hover_on_Advanced_icon() throws InterruptedException {
		 try {
		 Thread.sleep(5000);
			WebElement ele =driver.findElement(By.xpath("//*[@id='advanced']/a/img"));
			//Creating object of an Actions class
			Actions action = new Actions(driver);

			//Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			
	 }catch(Exception e) {
			System.out.println("Unable to hover on advance tab");
			System.out.println("Error is"+e);
		}}
	 @And("^Create new system Bigcommerce$")
	 public void Create_new_system_Bigcommerce() throws InterruptedException {
		 
	      s.createsystem();   
	 }
	 @And("^Create new API$")
	 public void Create_new_Api() throws InterruptedException {
		 
		 
	     api.createAPI(); 
	 }
	 @And("^Click on importbutton$")
	 public void Click_on_importbutton() throws InterruptedException {
		 api.importAPI();
		 //api.EditAPI();
	 }
	 
	 
	 
	@And("^Create flow using import option$")
	public void Create_flow_using_import_option() throws InterruptedException {
		
	     flow.createflow();
	     flow.importflow();
	}
	
	@Then("^Save the flow$")
	public void Save_the_flow() {
		driver.findElement(By.xpath("//button[contains(text(),'Save')][2]")).click();
		System.out.println("Flow created successfully");
	}
	
	@And("^Create flow using drag and drop option$")
	public void Create_flow_using_drag_and_drop_option() throws InterruptedException {
		flow.createflow();
	     flow.draghandlers();
	    
	}
	
	 @Given("^Navigate to project settings page$")
	 public void Navigate_to_project_settings_page() throws InterruptedException {
		 Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@src='/static/images/menu-icons/settings.svg']")).click();
	 }
	 @When("^Select timezone$")
	 public void  When_Select_timezone() {
		 try {
		 driver.findElement(By.xpath("//*[@id='setting__general']/div[2]/div/div/div/div/div/div/div[1]")).click();
			driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys("Kolkata");
			driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys(Keys.ENTER);
	 }catch(Exception e) {
			System.out.println("Unable to select time zone from project settings");
			System.out.println("Error is"+e);
		}}
	 @And("^Enable console logs$")
	 public void Enable_console_logs() throws InterruptedException {
		 Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='setting__projects_console']/div[2]/div/div/div/div/div")).click();
		
			driver.findElement(By.xpath("//div[contains(text(),'Yes')]")).click();
	 }
	 @Then("^Save project settings$")
	 public void Save_project_settings() throws InterruptedException {
		 Thread.sleep(2000);
			try {
			driver.findElement(By.xpath("//button[contains(text(),'Save Configuration')]")).click();
			driver.navigate().refresh();
			
			
	 }catch(Exception e) {
			System.out.println("Unable to clicve on save configuration in project settings page");
			System.out.println("Error is"+e);
		}}
	 @Given("^Create a pipe$")
	 public void Create_a_pipe() throws InterruptedException {
		 
	     pipe.createpipe();
	     
	 }
	 
	 
	 @When("Select a flow")
	 public void select_a_flow() throws InterruptedException {
	     pipe.selectflow();
	 }
	 @When("Select a flow with mapings")
	 public void select_a_flow_with_mapings() throws InterruptedException {
	     pipe.selectflowwithmappings();
	 }
	 @Then("Select Credentials")
	 public void select_credentials() throws InterruptedException {
	     pipe.selectcredentials();
	 }

	 @Then("Enter config detaisl")
	 public void enter_config_detaisl() throws InterruptedException {
	     pipe.enterconfig();
	 }

	 @Then("Configure mapping")
	 public void configure_mapping() throws InterruptedException {
	     pipe.configmapping();
	 }

	 @Then("Save the Pipe")
	 public void save_the_pipe() {
	   pipe.savepipe();
	 }
	 @Then("^Edit the offers Pipe$")
	 public void Edit_the_offers_pipe() throws InterruptedException {
		pipe.editpipe();
	 }
	 
	 @And("^Turn on pipe Status$")
	 public void Turn_on_pipe_Status() throws InterruptedException {
		 pipe.enablepipe();
	     
	 }
	 
	 @And("^Sync the pipe$")
	 public void Sync_the_pipe() throws InterruptedException 
	 {
		 pipe.sync();
	 }
	 
	 @And("^Add scheduler$")
	 public void Add_scheduler() throws InterruptedException {
		 pipe.Addscedule();
	     
	 }
	 @Then("^Navigate to manage access page$")
	 public void Navigate_to_manage_access_page() throws InterruptedException {
		 driver.findElement(By.xpath("//li[@id='users']")).click();
		  
	 }
	 @And("^Send Project invite to user mail$")
	 public void Send_project_invite_to_user_mail() throws InterruptedException {
		 
		 access.manageaccess();
	 }
	 
	 @And("^Revoke Invitations$")
	 public void Revoke_Invitations() throws InterruptedException {
		 access.revoke();
	 }
	 
	 @And("^Signout from login$")
	 public void Signout_from_login() throws InterruptedException {
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//img[@src='/static/images/avatar-new.svg']")).click();
		 driver.findElement(By.xpath("//div[contains(text(),'Signout')]")).click();
	 }
	 
	 @Then("^Check invite cards$")
	 public void Check_invite_cards() throws InterruptedException {
		 access.invitecards();
	 }
	 
	 
}
