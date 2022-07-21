package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class credentials {
WebDriver driver;
	public credentials(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

public void createcredentials() throws InterruptedException {
	System.out.println("creating credentials");
	try {
	Thread.sleep(3000);
 //driver.findElement(By.xpath("//img[@src='/static/images/menu-icons/credentials.svg']")).click();
	
	//driver.findElement(By.xpath("//div//a[contains(text(),'Add new')]")).click();
	
	driver.findElement(By.id("cr_name")).sendKeys("Big commerce");
	
	
	driver.findElement(By.id("datapoint")).click();
	Thread.sleep(2000);
	
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	
		//	js.executeScript("document.getElementsByName('datapoint')[0].setAttribute('type', 'text');");
		
		//	driver.findElement(By.id("datapoint"));
	driver.findElement(By.xpath("//div[@class='css-1pcexqc-container']//div//input")).sendKeys("Bigcommerce");
	driver.findElement(By.xpath("//div[@class='css-1pcexqc-container']//div//input")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.id("cr_timezone")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='react-select-3-input']")).sendKeys("kol");
	driver.findElement(By.xpath("//*[@id='react-select-3-input']")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//*[@id='creds-step1']/div/button")).click();
	
driver.findElement(By.xpath("//*[@id='X-Auth-Client']")).sendKeys("p8ix10bpx2kktbepy7vxdq6aezg9foe");
driver.findElement(By.xpath("//*[@id='X-Auth-Token']")).sendKeys("grwhqwrv93oagvg0zst00ukwn1rlkno");
driver.findElement(By.xpath("//*[@id='store_hash']")).sendKeys("4603pdm30a");
driver.findElement(By.xpath("//*[@id='creds-step2']/div/button[2]")).click();
}
catch(Exception e) {
	System.out.println("Unable to create new credentials");
	System.out.println("Error is"+e);
}}

public void testconnection() throws InterruptedException {
	try {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[contains(text(),'Test Connection')]")).click();
	Thread.sleep(2000);
	String message = driver.findElement(By.xpath("//span[@class='jconfirm-title']/p")).getText();
	System.out.println("Test connection messageis"+message);
	driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
}
catch(Exception e) {
	System.out.println("Unable to test the credentials connection");
	System.out.println("Error is"+e);
}}
}
