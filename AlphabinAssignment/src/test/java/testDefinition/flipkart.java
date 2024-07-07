package testDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.CheckboxClick;
import PageObject.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class flipkart {
	WebDriver driver;
	Homepage homepage;
	CheckboxClick checkbox;
	@Given("I navigate to Flipkart")
	public void i_navigate_to_flipkart() {
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

	@Then("I fetch all categories visible below the search bar and verify the text")
	public void i_fetch_all_categories_visible_below_the_search_bar_and_verify_the_text() throws InterruptedException {
		homepage=new Homepage(driver);
		List<WebElement> category=homepage.categoriesdisplay();
		for(WebElement category1:category){
			String categoryLsit=category1.getText();
			System.out.println(categoryLsit);
		}
 	}

	@Then("I validate the carousel showing offers")
	public void i_validate_the_carousel_showing_offers() throws InterruptedException {
		driver.get("https://www.flipkart.com/"); 
		WebElement selectingcat=driver.findElement(By.xpath("(//div[@class='_2GaeWJ'])[6]"));
	    selectingcat.click();
//		 Thread.sleep(5000);
//		 driver.close();
 		 WebElement offer=driver.findElement(By.xpath("//a[normalize-space()='Offer Zone']"));
 		 offer.click();
 		 System.out.println(driver.getTitle());

 	}

	@When("I select a product and search for it")
	public void i_select_a_product_and_search_for_it() {
          WebElement searchtf=driver.findElement(By.xpath("//input[@class='zDPmFV']"));
          searchtf.sendKeys("T shirts");
          searchtf.sendKeys(Keys.ENTER);
//		WebElement product=driver.findElement(By.xpath("//img[@alt='Apple iPads (Shop Now!)']"));
//		product.click();
	}

	@Then("I open the details page of the product")
	public void i_open_the_details_page_of_the_product() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		   driver.get("https://www.flipkart.com/");
		   WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		   search.sendKeys("mobiles");
		   search.sendKeys(Keys.ENTER);
 		   WebElement select=driver.findElement(By.xpath("//div[normalize-space()='Motorola Edge 50 Fusion (Marshmallow Blue, 256 GB)']"));
 		   select.click();
		   System.out.println(driver.getTitle());
//		   Thread.sleep(Duration.ofSeconds(2000));
//		   driver.close();
	}

	@Then("I check the compare checkbox and validate if the compare modal opens")
	public void i_check_the_compare_checkbox_and_validate_if_the_compare_modal_opens() {
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("https://www.flipkart.com/");
		   WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		   search.sendKeys("mobiles");
		   search.sendKeys(Keys.ENTER);
		   WebElement select=driver.findElement(By.xpath("//div[normalize-space()='Motorola Edge 50 Fusion (Marshmallow Blue, 256 GB)']"));
 		   select.click();
 		   WebElement compare=driver.findElement(By.xpath("//label[@class='tJjCVx']"));
 		   compare.click();
 		   System.out.println("Clicked on the compare button");
 		   WebElement comparebtn=driver.findElement(By.xpath("//span[contains(text(),'COMPARE')]"));
	       comparebtn.click();
		   System.out.println(driver.getTitle());
 		   System.out.println(driver.getTitle());
	} 
    
	@When("I click on the compare modal")    
	public void i_click_on_the_compare_modal(){
 		   driver=new ChromeDriver();
 		   driver.get("https://www.flipkart.com/");
		   WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		   search.sendKeys("mobiles");
		   search.sendKeys(Keys.ENTER);
		   WebElement select=driver.findElement(By.xpath("//div[normalize-space()='Motorola Edge 50 Fusion (Marshmallow Blue, 256 GB)']"));
 		   select.click();
 		   WebElement compare1=driver.findElement(By.xpath("//label[@class='tJjCVx']"));
 		   compare1.click();
 		   WebElement comparebtn=driver.findElement(By.xpath("//span[contains(text(),'COMPARE')]"));
 	       comparebtn.click();
 		   System.out.println(driver.getTitle());
 
	}

	@Then("I validate the selected device is visible on the compare page")
	public void i_validate_the_selected_device_is_visible_on_the_compare_page() {
		 
		
	}

	@Then("I add three more products to the compare page making a total of four products")
	public void i_add_three_more_products_to_the_compare_page_making_a_total_of_four_products() {
		  driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		   WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		   search.sendKeys("mobiles");
		   search.sendKeys(Keys.ENTER);
		   WebElement select=driver.findElement(By.xpath("//div[normalize-space()='Motorola Edge 50 Fusion (Marshmallow Blue, 256 GB)']"));
		   select.click();
		   WebElement compare=driver.findElement(By.xpath("//label[@class='tJjCVx']"));
		   compare.click();
		   driver.navigate().back();
		  //2nd product
		   WebElement search1=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		   search1.clear();
		   search1.sendKeys("realme");
		   search1.sendKeys(Keys.ENTER);
		   WebElement realme=driver.findElement(By.xpath("//body/div[@id='container']/div/div[@class='nt6sNV JxFEK3 _48O0EI']/div[@class='DOjaWF YJG4Cf']/div[@class='DOjaWF gdgoEp']/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]"));
		   realme.click();
		   WebElement compare1=driver.findElement(By.xpath("//label[@class='uu79Xy']"));
		   compare1.click();
		   driver.navigate().back();
		   //3rd product
		   WebElement search3=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		   search3.clear();
		   search3.sendKeys("redme");
		   search3.sendKeys(Keys.ENTER);
		   WebElement redmi=driver.findElement(By.xpath("//body/div[@id='container']/div/div[@class='nt6sNV JxFEK3 _48O0EI']/div[@class='DOjaWF YJG4Cf']/div[@class='DOjaWF gdgoEp']/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]"));
		   redmi.click();
		   WebElement compare3=driver.findElement(By.xpath("//label[@class='tJjCVx']"));
		   compare3.click();
	}

	@Then("I fetch ratings and reviews for all four products")
	public void i_fetch_ratings_and_reviews_for_all_four_products() {
		 
		
	}
}
