//CT 04 
package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Ajuda extends CommonsBasePage{

	WebDriverWait wait;
	Actions builder;
	
	WebElement ajudaComprador;
	WebElement compradores;
	
	String campoAjuda = "/html/body/div[1]/header/nav/div/ul/li[4]";
	String campoCompradores = "Compradores e Anunciantes";
	String texto = "Compradores & Anunciantes – Webmotors";
	
	public Ajuda(){
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
	public void navegaSite() {
		navegarAteSite("https://www.webmotors.com.br");
	}
	
	public void validaUrlWebmotors() {
		assertTrue("URL não contém WebMotors", wait.until(ExpectedConditions.urlContains("webmotors")));
	}
	
	public void ajudaCompradores() {
		ajudaComprador = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoAjuda)));
		wait.until(ExpectedConditions.elementToBeClickable(ajudaComprador)).click();
	
		compradores = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(campoCompradores)));
		wait.until(ExpectedConditions.elementToBeClickable(compradores)).click();
		
		trocarAba();
	}
	
	public void validaPagina(String texto) {
		validaIgualdade(texto);
	}
}
	
//	
//	
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
//	@Test
//	public void ajudacompradores() {
//		WebElement ajudaComprador = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[4]"));
//		ajudaComprador.click();
//		WebElement compradores = driver.findElement(By.linkText("Compradores e Anunciantes"));
//		compradores.click();
//
//		List<String> abas = new ArrayList<>(driver.getWindowHandles());
//		driver.close();
//		driver.switchTo().window(abas.get(1));
//
//		assertEquals(driver.getTitle(), "Compradores & Anunciantes – Webmotors");
//
//	}
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
//	@AfterClass
//	public static void closeDriver() throws InterruptedException {
//		Thread.sleep(5000);
//		driver.quit();
//		
//	}
//
//}
