package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.concurrent.TimeUnit;

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

public class CampoDeBuscaCarros extends CommonsBasePage {

	WebDriverWait wait;
	Actions builder;
	
	WebElement botaoVerOfertas;
	
	
	String campoPesquisa = "/html/body/div[1]/main/div[2]/div/div[1]/div[2]/div/div/div/div/input";
	String campoVerOfertas = "/html/body/div[1]/main/div[2]/div/div[1]/div[2]/div/div/a";
	String campoFiltros = "/html/body/div[1]/main/div[1]/div[1]/div/div[2]/div/ul";
	String texto = "HYUNDAI SONATA";
	
	public CampoDeBuscaCarros(){
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
	public void navegaSite() {
		navegarAteSite("https://www.webmotors.com.br");
	}
	
	public void inserirPesquisa(String pesquisa) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoPesquisa))).sendKeys(pesquisa);

	}
	
	public void clicarBotaoVerOfertas() {
		botaoVerOfertas = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoVerOfertas)));
		wait.until(ExpectedConditions.elementToBeClickable(botaoVerOfertas)).click();
	
	}
	
	public void verificaFiltros(String filtro) {
			validaCondicaoVerdadeira("Filtro " + filtro + " não aparece", _Driver().getPageSource().contains(filtro));
	}
}
//	static WebDriver driver;
//
//	@BeforeClass
//	public static void createDriver() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
//		driver = new ChromeDriver();
//	}
//
//	@Test
//	public void testHello() {
//		driver.manage().window().maximize();
//		driver.get("https://www.webmotors.com.br/");
//		Cookie clica = new Cookie();
//		clica.clickCookie(driver);
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	}
//
//
//	@Test
//	public void inserirCarroaComprar() {
//		
//		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[2]/div/div/div/div/input")).sendKeys("Sonata");
//		
//		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[2]/div/div/a")).click();
//		
//		
//		String filtroSonata = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[1]/div/div[2]/div/ul")).getText();
//		assertEquals("HYUNDAI SONATA", filtroSonata);
//		
//	}
//
//	@After
//
//	public void takeScreenshot() throws IOException, InterruptedException {
//		SimpleDateFormat formatoDeData = new SimpleDateFormat("yy-MM-dd-HH-SS");
//		String fileName = formatoDeData.format(new Date());
//		String shotName = String.format("%s.png", fileName);
//		File finalShotFile = new File("C:\\Users\\CASA\\Documents\\Selenium\\TestesAutomacaoBeca\\screenshots", shotName);
//		File shotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(shotFile, finalShotFile);
//	}
//
//	@AfterClass
//	public static void quitDriver() throws InterruptedException {
//		Thread.sleep(5000);
//		driver.quit();
//	}
//}
