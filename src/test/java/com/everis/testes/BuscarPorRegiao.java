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

public class BuscarPorRegiao {
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
	public void buscaRegiao() throws InterruptedException {
		WebElement cookie = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/button"));
		cookie.click();
		WebElement maisInformaçoes = driver.findElement(By.xpath("/html/body/div[1]/footer/div/div[1]/div[2]"));
		maisInformaçoes.click();
		Thread.sleep(3000);
		WebElement saoPaulo = driver.findElement(By.linkText("/html/body/div[1]/footer/div/div[1]/ul[2]/li[1]/ul/li[1]/a"));
		saoPaulo.click();
		
		
		List <String> abas = new ArrayList<>(driver.getWindowHandles());
		driver.close();
		driver.switchTo().window(abas.get(1));
		
		
		String filtroSaoPaulo = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[1]/div/div[2]/div/ul/li/a")).getText();
        assertEquals("SAO PAULO", filtroSaoPaulo);
        
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
