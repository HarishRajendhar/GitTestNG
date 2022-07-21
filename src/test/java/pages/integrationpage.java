package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class integrationpage {
	
WebDriver driver;
	@FindBy(xpath="//span[contains(text(),'Offers')]//following::img[7][@class='clo-opt-h']") 
	WebElement editthepipe;
	
	@FindBy(xpath="//span[@class='cls-wrap-element text-left']//div[contains(text(),'Clone')]")
	WebElement editpipe1;
	
	@FindBy(xpath="//input[@placeholder='Manual Sync  Time']")
	WebElement configdata;
	
	@FindBy(xpath="//textarea[@placeholder='Failure Alert Email Addresses']")
	WebElement configdata1;
	
	@FindBy(how = How.CLASS_NAME, using="mapping-configure-link")
	WebElement configure;
	
	@FindBy(xpath="//input[@type='file']")
	WebElement importmapping;
	
	@FindBy(xpath="//span[text()='id']")
	WebElement id;
	
	@FindBy(xpath="//div[contains(text(),'Save & Exit')]")
	WebElement saveExit;
	
	@FindBy(id="srcdrop-1")
	WebElement srcdrop1;
	
	public  integrationpage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void createpipe() throws InterruptedException {
		Thread.sleep(1000);
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("//*[@id='integrations']/a/img")).click();
		System.out.println("Adding new pipe");
		driver.findElement(By.xpath("//a[contains(text(),'Add new')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("pipe_name")).sendKeys("sample Big commerce");
		
				
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//input[@name='search_flow']")).click();
		//Actions actions = new Actions(driver);
		//WebElement elementLocator = driver.findElement(By.xpath("//input[@name='search_flow']"));
		//actions.doubleClick(elementLocator).perform();
		}
		public void selectflow() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='61b98f601f68b5000defd663']")).click(); // change Flow Id here(Flow without mapping and configs works here)
		}
		
		
		public void selectflowwithmappings() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id='6128edcb1f68b5000cfd3e4f']")).click(); // change Flow Id here(Flow with mapping and configs works here)
			}
		
		
		public void selectcredentials() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		WebElement cred1 =driver.findElement(By.xpath("//div[contains(text(),'Big commerce')]//following::div[@class='ant-select-selection__rendered']"));  
		WebElement cred2 =driver.findElement(By.xpath("//div[contains(text(),'Miracle demo')]//following::div[@class='ant-select-selection__rendered']"));
		cred1.click();
		
		Thread.sleep(1000);
		System.out.println("Failed here");
		//driver.findElement(By.xpath("//div[@class='ant-select-dropdown ant-select-dropdown--single ant-select-dropdown-placement-bottomLeft  ant-select-dropdown-hidden']//li[contains(text(),'Bigcommerce')]")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//li[@class='ant-select-dropdown-menu-item credential-select-options ant-select-dropdown-menu-item-active']")).click();

		driver.findElement(By.xpath("//li[contains(text(),'Bigcommerce')]")).click();
		if(cred2.isDisplayed()) {
		cred2.click();
		driver.findElement(By.xpath("//li[contains(text(),'Miracle')]")).click();
		}else {
			System.out.println("These is no second credentials to choose");
		}
		}
		public void savepipe() {
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	}
	
public void enablepipe() throws InterruptedException {
	try {
	Thread.sleep(5000);
driver.findElement(By.xpath("/html/body/section/div/main/div/div[4]/div/div/div[4]/div/div/div[2]/div/div[2]/div/div/div/div[2]")).click();
	


//WebElement minute= driver.findElement(By.xpath("//div[@class='schedule__selectbtn ant-select ant-select-enabled']"));
//minute.click();



//driver.findElement(By.xpath("//button//span[contains(text(),'OK')]")).click();



}
catch(Exception e) {
	System.out.println("Unable to Enable pipe status");
	System.out.println("Error is"+e);
}}

public void sync() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'Sync Now')]")).click();
}

public void Addscedule() throws InterruptedException {
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='cron-add-sync']")).click();
	driver.findElement(By.xpath(" //button[contains(text(),'+ Add schedule')]")).click();
	driver.findElement(By.xpath("//input[@value='including_min']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
}

public void filter() throws InterruptedException {
	Thread.sleep(1000);
	driver.findElement(By.className("filter")).click();
	
	
}
@SuppressWarnings("deprecation")
public void editpipe() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement element = wait.until(ExpectedConditions.visibilityOf(editthepipe));
editthepipe.click();	

	WebElement element1 = wait.until(ExpectedConditions.visibilityOf(editpipe1));
//Actions action = new Actions(driver);
//action.moveToElement(editpipe1).click();
editpipe1.click();

}

public void enterconfig() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)", "");
	Thread.sleep(1000);
	configdata.click();
	configdata.sendKeys("2021-08-17");
	configdata1.sendKeys("tester123@yopmail.com");
}

public void configmapping() throws InterruptedException {
	configure.click();
	Thread.sleep(1000);
importmapping.sendKeys("D:\\Offers.json");
Thread.sleep(1000);
saveExit.click();
	//Actions action = new Actions(driver);
	//action.moveToElement(id).dragAndDrop(id,srcdrop1).build().perform();
	//action.clickAndHold(id).moveToElement(srcdrop1).release(srcdrop1).build().perform();
}


}
