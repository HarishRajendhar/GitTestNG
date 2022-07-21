package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginpage {

	WebDriver driver;
	
	public loginpage(WebDriver driver) {
		this.driver = driver;
	}

	public void Enteremail() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("Entering username and password");
		Thread.sleep(1000);
		  driver.findElement(By.name("username")).sendKeys("shaikth@dckap.com");
	}
	public void enterpassword(String password) {
		  driver.findElement(By.name("password")).sendKeys(password);
	}
	
	
	public void invalidlogin() {
		driver.findElement(By.name("username")).sendKeys("shaikth@dckap.com");
		driver.findElement(By.name("password")).sendKeys("Hello@123");
		  driver.findElement(By.xpath("//button[contains(text(),'Light It Up')]")).click();
	}
	public void lightitup() {
		  driver.findElement(By.xpath("//button[contains(text(),'Light It Up')]")).click();
	
		  String originalTitle1 = driver.getTitle();
		  System.out.println("Title of dashboard" +originalTitle1);
		  System.out.println("User login successfull");
	
}
}
