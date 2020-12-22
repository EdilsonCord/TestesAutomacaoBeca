//CT 02 
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

public class ComprarNovo extends CommonsBasePage{
	
	WebDriverWait wait;
	Actions builder;
	
	WebElement comprar;
	WebElement carros; 
	WebElement carros1;
	WebElement verifica1;
	WebElement verifica2;
	
	String campoComprar= "//*[@id=\"root\"]/header/nav/div/ul/li[1]";
	String campoCarrosNovos = "Carros novos";
	String campoCarrosUsados = "Carros usados ou seminovos";
	String campoFiltro1 = "/html/body/div[1]/main/div[1]/div[1]/div/div[2]/div/ul/li[1]/a";
	String campoFiltro2 = "/html/body/div[1]/main/div[1]/div[1]/div/div[2]/div/ul/li[2]/a";
	
	
	public ComprarNovo(){
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
	public void navegaSite() {
		navegarAteSite("https://www.webmotors.com.br");
	}
	
	public void clicarComprar() {
		comprar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoComprar)));
		wait.until(ExpectedConditions.elementToBeClickable(comprar)).click();
		
	}
	
	public void clicarComprarNovo () {
		carros = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(campoCarrosNovos)));
		wait.until(ExpectedConditions.elementToBeClickable(carros)).click();
		
		trocarAba();
	}
	
	public void clicarComprarUsado() {
		carros1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(campoCarrosUsados)));
		wait.until(ExpectedConditions.elementToBeClickable(carros1)).click();
		trocarAba();
	}
	
	public void verificaFiltros(String filtro1, String filtro2) {
		String [] filtros = {filtro1, filtro2};
		for (String filtrosBarra : filtros) {
			validaCondicaoVerdadeira("Filtro " + filtrosBarra + " não aparece", _Driver().getPageSource().contains(filtrosBarra));

		}
	}
	
	
}
//	static WebDriver driver; 
	
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
//	public void comprar() {
//		WebElement comprar = driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/div/ul/li[1]"));
//		comprar.click();
//		WebElement carros = driver.findElement(By.linkText("Carros novos"));
//		carros.click();
////		String windowHandle = driver.getWindowHandle();
//
//		
//		List <String> abas = new ArrayList<>(driver.getWindowHandles());
//		driver.close();
//		driver.switchTo().window(abas.get(1));
//		
//		
//		String filtroBrasil = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[1]/div/div[2]/div/ul/li[1]/a")).getText();
//        assertEquals("BRASIL", filtroBrasil);
//        String filtroNovos = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[1]/div/div[2]/div/ul/li[2]/a")).getText();
//        assertEquals("NOVOS", filtroNovos);
//        
////		
////		WebElement filtroBrasil = driver.findElement(By.id("brasil"));
////		String brasilFiltro = filtroBrasil.getText();
////		assertTrue("O filtro contido deve ser 'brasil'", brasilFiltro.contains("brasil"));
////		
////		WebElement filtroUsados = driver.findElement(By.id("novos"));
////		String usadosFiltro = filtroUsados.getText();
////		assertTrue("O filtro contido deve ser 'novos'", usadosFiltro.contains("novos"));
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
