package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

public class BotaoHome extends CommonsBasePage {
	
	WebDriverWait wait;
	Actions builder;
	
	WebElement financiar;
	WebElement botaoHome;
	
	String campoBotaoFinanciar = "/html/body/div[1]/main/div[2]/div/div[1]/div[1]/h2[3]/a";
	String campoBotaoHome = "/html/body/div/div/header/div/a";
	String texto = "Webmotors | Compre, venda e financie carros usados, novos e motos";
	
	public BotaoHome(){
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
	public void navegaSite() {
		navegarAteSite("https://www.webmotors.com.br");
	}
	
	public void botaoHomeFinanciar() {
		financiar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoBotaoFinanciar)));
		wait.until(ExpectedConditions.elementToBeClickable(financiar)).click();
		
		trocarAba();
	}
	
	public void clicarBotaoHome() {
	botaoHome = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoBotaoHome)));
	wait.until(ExpectedConditions.elementToBeClickable(botaoHome)).click();
	
	}
	
	public void validaPaginaHome() {
		assertEquals(_Driver().getTitle(), texto);
	}
}

//
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
//	public void botaoHomeFinanciar() {
//		WebElement financiar = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[1]/h2[3]/a"));
//		financiar.click();
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
