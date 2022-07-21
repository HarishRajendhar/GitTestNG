package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class APImanager {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id='api-manager']")
	WebElement apimanager;
	
	@FindBy(id="fileToUpload")
	WebElement uploaddco;
	
	@FindBy(xpath="//button//span[contains(text(),'Yes')]")
	WebElement accept;
	
	public APImanager(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void importAPI() throws InterruptedException {
		Thread.sleep(3000);
		apimanager.click(); 
		Thread.sleep(3000);
		
		   uploaddco.sendKeys("C:\\Users\\L70\\Pictures\\Testing Image files\\Files\\sample api.JSON");
		   Thread.sleep(4000);
		 
		  Actions actions= new Actions(driver);
		  actions.click(accept).perform();
	}
	
	public void EditAPI() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='/static/images/options.svg']")).click();
	}
	public void createAPI() throws InterruptedException {
		Thread.sleep(3000);
		
		try {
			apimanager.click();  
		
	System.out.println("Adding new API");
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//a[contains(text(),'Add new')]")).click(); 
	driver.findElement(By.id("api-manager_add")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("api_name")).click();
	driver.findElement(By.id("api_name")).sendKeys("Get All Products");
	driver.findElement(By.id("api_description")).click();
	driver.findElement(By.id("api_description")).sendKeys("Get all products from Bigcommerce");
	driver.findElement(By.xpath("//*[@id='api-container']/div/form/div/div[1]/div[2]/div/div/div[2]")).click();
	driver.findElement(By.xpath("//*[@id='api-container']/div/form/div/div[1]/div[3]/div/div/div[2]/div/div/div[1]")).click();
	driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys("Custom");
	driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys(Keys.ENTER);
	driver.findElement(By.name("api_url")).sendKeys("https://api.bigcommerce.com/stores/GET_FROM_CREDENTIAL[store_hash]/v3/catalog/products");
	
	driver.findElement(By.xpath("//a[contains(text(),'Header')]")).click();
	driver.findElement(By.xpath("//p[contains(text(),' Bulk Edit ')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("api_header")).click();
	driver.findElement(By.name("api_header")).sendKeys("X-Auth-Client::X-Auth-Client::GET_FROM_CREDENTIAL\r\n"
			+ "X-Auth-Token::X-Auth-Token::GET_FROM_CREDENTIAL");


	driver.findElement(By.xpath("//a[contains(text(),'Response')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("api_response")).click();
	driver.findElement(By.name("api_response")).sendKeys("{\r\n"
			+ "  \"id\": 355,\r\n"
			+ "  \"name\": \"3M 8233 N100 Particulate Dust Mask with Cool Flow Exhalation Valve (1 Each)\",\r\n"
			+ "  \"type\": \"physical\",\r\n"
			+ "  \"sku\": \"320-3M8233\",\r\n"
			+ "  \"description\": \"\",\r\n"
			+ "  \"weight\": 0.8,\r\n"
			+ "  \"width\": 0,\r\n"
			+ "  \"depth\": 0,\r\n"
			+ "  \"height\": 0,\r\n"
			+ "  \"price\": 10.99,\r\n"
			+ "  \"cost_price\": 0,\r\n"
			+ "  \"retail_price\": 0,\r\n"
			+ "  \"sale_price\": 0,\r\n"
			+ "  \"map_price\": 0,\r\n"
			+ "  \"tax_class_id\": 0,\r\n"
			+ "  \"product_tax_code\": \"\",\r\n"
			+ "  \"calculated_price\": 10.99,\r\n"
			+ "  \"categories\": [\r\n"
			+ "    7613,\r\n"
			+ "    7658,\r\n"
			+ "    7660,\r\n"
			+ "    7671,\r\n"
			+ "    125\r\n"
			+ "  ],\r\n"
			+ "  \"brand_id\": 1,\r\n"
			+ "  \"option_set_id\": null,\r\n"
			+ "  \"option_set_display\": \"right\",\r\n"
			+ "  \"inventory_level\": 22,\r\n"
			+ "  \"inventory_warning_level\": 0,\r\n"
			+ "  \"inventory_tracking\": \"product\",\r\n"
			+ "  \"reviews_rating_sum\": 0,\r\n"
			+ "  \"reviews_count\": 0,\r\n"
			+ "  \"total_sold\": 712,\r\n"
			+ "  \"fixed_cost_shipping_price\": 0,\r\n"
			+ "  \"is_free_shipping\": false,\r\n"
			+ "  \"is_visible\": true,\r\n"
			+ "  \"is_featured\": false,\r\n"
			+ "  \"related_products\": [\r\n"
			+ "    -1\r\n"
			+ "  ],\r\n"
			+ "  \"warranty\": \"\",\r\n"
			+ "  \"bin_picking_number\": \"\",\r\n"
			+ "  \"layout_file\": \"product.html\",\r\n"
			+ "  \"upc\": \"50051138541434\",\r\n"
			+ "  \"mpn\": \"8233\",\r\n"
			+ "  \"gtin\": \"50051138541434\",\r\n"
			+ "  \"search_keywords\": \"\",\r\n"
			+ "  \"availability\": \"available\",\r\n"
			+ "  \"availability_description\": \"Available for Purchase Online Only\",\r\n"
			+ "  \"gift_wrapping_options_type\": \"any\",\r\n"
			+ "  \"gift_wrapping_options_list\": [],\r\n"
			+ "  \"sort_order\": 0,\r\n"
			+ "  \"condition\": \"New\",\r\n"
			+ "  \"is_condition_shown\": true,\r\n"
			+ "  \"order_quantity_minimum\": 0,\r\n"
			+ "  \"order_quantity_maximum\": 5,\r\n"
			+ "  \"page_title\": \"\",\r\n"
			+ "  \"meta_keywords\": [],\r\n"
			+ "  \"meta_description\": \"\",\r\n"
			+ "  \"date_created\": \"2011-08-29T17:22:56+00:00\",\r\n"
			+ "  \"date_modified\": \"2021-05-10T21:18:58+00:00\",\r\n"
			+ "  \"view_count\": 17646,\r\n"
			+ "  \"preorder_release_date\": null,\r\n"
			+ "  \"preorder_message\": \"\",\r\n"
			+ "  \"is_preorder_only\": false,\r\n"
			+ "  \"is_price_hidden\": false,\r\n"
			+ "  \"price_hidden_label\": \"\",\r\n"
			+ "  \"custom_url\": {\r\n"
			+ "    \"url\": \"/3m-8233-n100-particulate-dust-mask-with-cool-flow-exhalation-valve-1-each/\",\r\n"
			+ "    \"is_customized\": false\r\n"
			+ "  },\r\n"
			+ "  \"base_variant_id\": 2384,\r\n"
			+ "  \"open_graph_type\": \"product\",\r\n"
			+ "  \"open_graph_title\": \"\",\r\n"
			+ "  \"open_graph_description\": \"\",\r\n"
			+ "  \"open_graph_use_meta_description\": true,\r\n"
			+ "  \"open_graph_use_product_name\": true,\r\n"
			+ "  \"open_graph_use_image\": true\r\n"
			+ "}");
	
	driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	System.out.println("API added added successfully");
	
}
		catch(Exception e) {
			System.out.println("Unable to crate API for the system");
			System.out.println("Error is"+e);
		}}
	
}