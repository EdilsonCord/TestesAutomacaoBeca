package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class BotaoHomeQueroVender extends CommonsBasePage {
	
	WebDriverWait wait;
	Actions builder;
	
	WebElement queroVender;
	WebElement botaoHomeQueroVender;
	
	String campoQueroVender = "Quero Vender";
	String campoBotaoHome = "/html/body/div/div/header/div/a/img";
	String texto = "Webmotors | Compre, venda e financie carros usados, novos e motos";
	
	public BotaoHomeQueroVender(){
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
	public void navegaSite() {
		navegarAteSite("https://www.webmotors.com.br");
	}
	
	public void botaoHomeQueroVender() {
		queroVender = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(campoQueroVender)));
		wait.until(ExpectedConditions.elementToBeClickable(queroVender)).click();
		
		trocarAba();
	}
	
	public void clicarBotaoHome() {
		botaoHomeQueroVender = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoBotaoHome)));
		wait.until(ExpectedConditions.elementToBeClickable(botaoHomeQueroVender)).click();
	
	}
	
	public void validaPaginaHome() {
		assertEquals(_Driver().getTitle(), texto);
	}
}
	
	
	

//static WebDriver driver; 
//	
//	@BeforeClass
//	public static void createDriver() {
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
//		driver = new ChromeDriver(); 
//		
//	}
//	
//	@Test
//	public void testHello() {
//		driver.manage().window().maximize();
//		driver.get("https://www.webmotors.com.br/");
//		Cookie clica = new Cookie();
//		clica.clickCookie(driver);
//	}
//	
//	
//	@Test
//	public void botaoHomeQueroVender() {
//		WebElement quero = driver.findElement(By.linkText("Quero Vender"));
//		quero.click();
//		
//		List <String> abas = new ArrayList<>(driver.getWindowHandles());
//		driver.close();
//		driver.switchTo().window(abas.get(1));
//		
//	
//		WebElement botaoHome = driver.findElement(By.xpath("/html/body/div/div/header/div/a/img"));
//		botaoHome.click();
//		
//		
//		assertEquals(driver.getTitle(), "Webmotors | Compre, venda e financie carros usados, novos e motos");
//		
//		
//	}
//	
//	
//	@After
//	public void takeScreenShot() throws IOException { 
//		SimpleDateFormat formatoDeData = new SimpleDateFormat("yyyyMMdd-HHmmss-SSSS");
//		String fileName = formatoDeData.format(new Date());
//		String shotName = String.format("%s.png", fileName);
//		File finalShotFile = new File("C:\\Users\\CASA\\Documents\\Selenium\\TestesAutomacaoBeca\\screenshots", shotName);
//		File shotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(shotFile, finalShotFile);
//	}
//	
//
//	@AfterClass 
//	public static void closeDriver() throws InterruptedException {
//		Thread.sleep(5000);
//		driver.quit();
//		
//	}
//}
