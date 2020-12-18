package com.everis.testes;

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

public class FluxoTabelaFIPE {
static WebDriver driver; 
	
	@BeforeClass
	public static void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver(); 
		
	}
	
	@Test
	public void testHello() {
		driver.manage().window().maximize();
		driver.get("https://www.webmotors.com.br/");
		
	}
	
	
	@Test
	public void tabelaFipe() {
		WebElement servicos = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[3]"));
		servicos.click();
		WebElement tabelaFipeW = driver.findElement(By.linkText("Tabela FIPE Webmotors"));
		tabelaFipeW.click();
		
		List <String> abas = new ArrayList<>(driver.getWindowHandles());
		driver.close();
		driver.switchTo().window(abas.get(1));
		
		WebElement tipoCarro = driver.findElement(By.xpath("/html/body/app/section/section/div/div[1]/div/div[2]/a[1]"));
		tipoCarro.click();
		WebElement marcaCarro = driver.findElement(By.xpath("/html/body/app/section/section/div/div[1]/div/div[2]/ul/li[3]/a"));
		marcaCarro.click();
		WebElement modeloCarro = driver.findElement(By.xpath("/html/body/app/section/section/div/div/div/div[3]/ul/li[13]/a/div/img"));
		modeloCarro.click();
		WebElement anoCarro = driver.findElement(By.xpath("/html/body/app/section/section/div/div/div/div[3]/ul/li[1]/a"));
		anoCarro.click();
		WebElement versaoCarro = driver.findElement(By.xpath("/html/body/app/section/section/div/div/div/div[3]/ul/li[1]/a"));
		versaoCarro.click();
		WebElement estadoCarro = driver.findElement(By.xpath("/html/body/app/section/section/div/div/div/div[3]/ul/li[6]/a"));
		estadoCarro.click();
		
		
		String filtroFiat = driver.findElement(By.xpath("/html/body/app/section/section/div/div[1]/div/div[1]/div/div/ul/li[1]/a")).getText();
        assertEquals("FIAT", filtroFiat);
        String filtroCronos= driver.findElement(By.xpath("/html/body/app/section/section/div/div[1]/div/div[1]/div/div/ul/li[2]/a")).getText();
        assertEquals("CRONOS", filtroCronos);
        String filtro2021 = driver.findElement(By.xpath("/html/body/app/section/section/div/div[1]/div/div[1]/div/div/ul/li[3]/a")).getText();
        assertEquals("2021", filtro2021);
        String filtroVersao = driver.findElement(By.xpath("/html/body/app/section/section/div/div[1]/div/div[1]/div/div/ul/li[4]/a")).getText();
        assertEquals("1.3 FIREFLY FLEX DRIVE MANUAL", filtroVersao);
        String filtroEstado = driver.findElement(By.xpath("/html/body/app/section/section/div/div[1]/div/div[1]/div/div/ul/li[5]/a")).getText();
        assertEquals("SÃO PAULO", filtroEstado);
	}
	
	
	@After
	public void takeScreenShot() throws IOException { 
		SimpleDateFormat formatoDeData = new SimpleDateFormat("yyyyMMdd-HHmmss-SSSS");
		String fileName = formatoDeData.format(new Date());
		String shotName = String.format("%s.png", fileName);
		File finalShotFile = new File("C:\\cursoSelenium\\exemploSelenium\\screenshots", shotName);
		File shotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(shotFile, finalShotFile);
	}
	

	@AfterClass 
	public static void closeDriver() {
		
		driver.quit();
		
	}
}
