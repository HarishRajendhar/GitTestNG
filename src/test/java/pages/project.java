package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class project {
	WebDriver driver;
	
	
	@FindBy(xpath="//a[@href='/projects/add']")
	WebElement add;
	
	@FindBy(name="project_name")
	WebElement projectname;
	
	@FindBy(name="project_description")
	WebElement projectdescription;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	
	@FindBy(xpath="//div//a[@href='/workspace/61b2f9b91f68b5000e68b522/integrations']")
	WebElement v3dev;
	
	
	public  project(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickadd() {
		add.click();
	}
	public void createproject() throws InterruptedException {
		System.out.println("creating a new project");
try {
		  
		  projectname.sendKeys("Automation by page factory");
		  projectdescription.sendKeys("created a project using automation script");
		  save.click();
	
		  System.out.println("Project added successfully");
		  }catch(Exception e) {
				System.out.println("Unable to create new project");
			}}
	
	public void manage() throws InterruptedException {
		  Thread.sleep(5000);
		  try {
		  v3dev.click();
		  
		  System.out.println("Entered into integration page");

		  }
	catch(Exception e) {
		System.out.println("Unable to Navigate to work space");
		System.out.println("Error is"+e);
	}}
	
	public void v3manage() throws InterruptedException {
		  Thread.sleep(5000);
		  try {
		  driver.findElement(By.xpath("//div//a[@href='/workspace/6221d4d82943b4007cec1976/integrations']")).click();
		  System.out.println("Entered into integration page");
		  		
		  }
	catch(Exception e) {
		System.out.println("Unable to Navigate to work space");
		System.out.println("Error is"+e);
	}}

	public void searchproject() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		//driver.findElement(By.className("form-control")).sendKeys("Automation");
		//driver.findElement(By.xpath("//input[@placeholder='Search...']")).click();
		driver.findElement(By.xpath("//div//a[@href='/workspace/61b2f9b91f68b5000e68b522/integrations']")).click();
		driver.findElement(By.xpath("//div//input[@name=\"search\"]")).sendKeys("Automation");
		driver.findElement(By.xpath("//button[@class='btn cls-search']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Manage')]")).click();
	}
	public void updateproject() throws InterruptedException {
		Thread.sleep(2000); 
	//	driver.findElement(By.className("cls-menu-icon")).click();
		driver.findElement(By.xpath("/html/body/section/div/main/div/div[3]/div/div/div[4]/div/div/div[2]/div[1]/div[6]/span/img"));
	}
}
