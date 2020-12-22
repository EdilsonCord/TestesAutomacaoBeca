package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cookie {
	
	 
	WebDriver driver;
	
	protected void clickCookie (WebDriver driver){
		
		WebElement cookiee = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/button"));
		cookiee.click();
		this.driver = driver; 
	}
	
}
