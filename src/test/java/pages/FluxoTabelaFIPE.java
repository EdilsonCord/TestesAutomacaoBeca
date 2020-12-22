//CT 03
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

public class FluxoTabelaFIPE extends CommonsBasePage{
	WebDriverWait wait;
	Actions builder;
	
	WebElement serviços, tabelaFipeW, tipoCarro, marcaCarro, modeloCarro, anoCarro, versaoCarro, estadoCarro, v1, v2, v3, v4, v5;
	
	
	String campoServiços = "/html/body/div[1]/header/nav/div/ul/li[3]";
	String campoTabela = "Tabela FIPE Webmotors";
	String campoTipoCarro = "/html/body/app/section/section/div/div[1]/div/div[2]/a[1]";
	String campoMarca = "/html/body/app/section/section/div/div[1]/div/div[2]/ul/li[3]/a";
	String campoModelo = "/html/body/app/section/section/div/div/div/div[3]/ul/li[13]/a/div/img";
	String campoAno = "/html/body/app/section/section/div/div/div/div[3]/ul/li[1]/a";
	String campoVersao = "/html/body/app/section/section/div/div/div/div[3]/ul/li[1]/a";
	String campoEstado = "/html/body/app/section/section/div/div/div/div[3]/ul/li[6]/a";
	
	
	String filtroFiat= "/html/body/app/section/section/div/div[1]/div/div[1]/div/div/ul/li[1]/a";
	String filtroCronos = "/html/body/app/section/section/div/div[1]/div/div[1]/div/div/ul/li[2]/a";
	String filtro2021 = "/html/body/app/section/section/div/div[1]/div/div[1]/div/div/ul/li[3]/a";
	String filtroVersao = "/html/body/app/section/section/div/div[1]/div/div[1]/div/div/ul/li[4]/a";
	String filtroEstado = "/html/body/app/section/section/div/div[1]/div/div[1]/div/div/ul/li[5]/a";
	
	
	public FluxoTabelaFIPE(){
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	

	public void clicarServiçosTabelaFipe() {
		serviços = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoServiços)));
		wait.until(ExpectedConditions.elementToBeClickable(serviços)).click();
		
		tabelaFipeW = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(campoTabela)));
		wait.until(ExpectedConditions.elementToBeClickable(tabelaFipeW)).click();
		
		trocarAba();
		
	}
	
	public void clicarTipoCarro() {
		tipoCarro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoTipoCarro)));
		wait.until(ExpectedConditions.elementToBeClickable(tipoCarro)).click();
	}
	
	public void clicarMarcaCarro() {
		marcaCarro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoMarca)));
		wait.until(ExpectedConditions.elementToBeClickable(marcaCarro)).click();
	}
	
	public void clicarModeloCarro() {
		modeloCarro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoModelo)));
		wait.until(ExpectedConditions.elementToBeClickable(modeloCarro)).click();
	}
	
	public void clicarAnoCarro() {
		anoCarro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoAno)));
		wait.until(ExpectedConditions.elementToBeClickable(anoCarro)).click();
	}
	
	public void clicarVersaoCarro() {
		versaoCarro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoVersao)));
		wait.until(ExpectedConditions.elementToBeClickable(versaoCarro)).click();
	}
	
	public void clicarEstadoCarro() {
		tipoCarro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoEstado)));
		wait.until(ExpectedConditions.elementToBeClickable(tipoCarro)).click();
	}
	
	public void verificaFiltros(String f1, String f2, String f3, String f4, String f5) {
		
		String [] filtros = {f1, f2, f3, f4, f5};
		for (String filtrosBarra : filtros) {
			validaCondicaoVerdadeira("Filtro " + filtrosBarra + " não aparece", _Driver().getPageSource().contains(filtrosBarra));

		}
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
//	public void tabelaFipe() {
//		WebElement servicos = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[3]"));
//		servicos.click();
//		WebElement tabelaFipeW = driver.findElement(By.linkText("Tabela FIPE Webmotors"));
//		tabelaFipeW.click();
//		
//		List <String> abas = new ArrayList<>(driver.getWindowHandles());
//		driver.close();
//		driver.switchTo().window(abas.get(1));
//		
//		WebElement tipoCarro = driver.findElement(By.xpath("/html/body/app/section/section/div/div[1]/div/div[2]/a[1]"));
//		tipoCarro.click();
//		WebElement marcaCarro = driver.findElement(By.xpath("/html/body/app/section/section/div/div[1]/div/div[2]/ul/li[3]/a"));
//		marcaCarro.click();
//		WebElement modeloCarro = driver.findElement(By.xpath("/html/body/app/section/section/div/div/div/div[3]/ul/li[13]/a/div/img"));
//		modeloCarro.click();
//		WebElement anoCarro = driver.findElement(By.xpath("/html/body/app/section/section/div/div/div/div[3]/ul/li[1]/a"));
//		anoCarro.click();
//		WebElement versaoCarro = driver.findElement(By.xpath("/html/body/app/section/section/div/div/div/div[3]/ul/li[1]/a"));
//		versaoCarro.click();
//		WebElement estadoCarro = driver.findElement(By.xpath("/html/body/app/section/section/div/div/div/div[3]/ul/li[6]/a"));
//		estadoCarro.click();
//		
//		
//		
//		
//		String filtroFiat = driver.findElement(By.xpath("/html/body/app/section/section/div/div[1]/div/div[1]/div/div/ul/li[1]/a")).getText();
//        assertEquals("FIAT", filtroFiat);
//        String filtroCronos= driver.findElement(By.xpath("/html/body/app/section/section/div/div[1]/div/div[1]/div/div/ul/li[2]/a")).getText();
//        assertEquals("CRONOS", filtroCronos);
//        String filtro2021 = driver.findElement(By.xpath("/html/body/app/section/section/div/div[1]/div/div[1]/div/div/ul/li[3]/a")).getText();
//        assertEquals("2021", filtro2021);
//        String filtroVersao = driver.findElement(By.xpath("/html/body/app/section/section/div/div[1]/div/div[1]/div/div/ul/li[4]/a")).getText();
//        assertEquals("1.3 FIREFLY FLEX DRIVE MANUAL", filtroVersao);
//        String filtroEstado = driver.findElement(By.xpath("/html/body/app/section/section/div/div[1]/div/div[1]/div/div/ul/li[5]/a")).getText();
//        assertEquals("SÃO PAULO", filtroEstado);
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
