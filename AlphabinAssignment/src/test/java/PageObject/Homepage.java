package PageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
      WebDriver driver;  
	public Homepage(WebDriver  driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="//div[@class='_3sdu8W emupdz']//a")
	List<WebElement> categaries;
	
	public List<WebElement> categoriesdisplay(){
		return categaries;
		
	}
	
	@FindBy(xpath="//input[@class='Pke_EE']")
	WebElement search ;
	
	public void searchfield(String  seartchtf) {
		search.sendKeys( );
	}
	
	@FindBy(xpath="//button[@class='_2iLD__']") 
	WebElement searchbtn;
	
	public void searchbtn() {
		searchbtn.click();
	}
	  public void tearDown() throws InterruptedException {
	    	
	    	Thread.sleep(Duration.ofSeconds(5));
	    	driver.close();
	    }
	
}
