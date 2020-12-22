package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class HomeWebmotorsPage extends CommonsBasePage{
	
	WebDriverWait wait;
	Actions builder;
	
	WebElement pesquisar;
	
	String campoPesquisar = "/html/body/div/main/div[2]/div/div[1]/div[2]/div/div/div/div/input";
	
	public HomeWebmotorsPage(){
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
	public void navegaSite() {
		navegarAteSite("https://www.webmotors.com.br");
	}
	
	public void validaUrlWebmotors() {
		assertTrue("URL não contém WebMotors", wait.until(ExpectedConditions.urlContains("webmotors")));
	}
	
	public void hoverPesquisar() {
		pesquisar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoPesquisar)));
		builder.moveToElement(pesquisar).build().perform();
	}

}
