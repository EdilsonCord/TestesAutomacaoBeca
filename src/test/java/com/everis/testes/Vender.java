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

public class Vender {
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
	public void vender() {
		WebElement vender = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]"));
		vender.click();
		WebElement venderVeiculo = driver.findElement(By.linkText("Vender meu veículo"));
		venderVeiculo.click();
		
		List <String> abas = new ArrayList<>(driver.getWindowHandles());
		driver.close();
		driver.switchTo().window(abas.get(1));
		
		assertEquals(driver.getTitle(), "Venda seu carro usado ou seminovo na Webmotors");
		
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
