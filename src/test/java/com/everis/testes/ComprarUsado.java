//CT 01
package com.everis.testes;

import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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



public class ComprarUsado {

		
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
			Cookie clica = new Cookie();
			clica.clickCookie(driver);
		}
		
		
		@Test
		public void comprar() {
			WebElement comprar = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[1]"));
			comprar.click();
			WebElement carros = driver.findElement(By.linkText("Carros usados ou seminovos"));
			carros.click();
//			String windowHandle = driver.getWindowHandle();

			
			List <String> abas = new ArrayList<>(driver.getWindowHandles());
			driver.close();
			driver.switchTo().window(abas.get(1));
			
			
			String filtroBrasil = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[1]/div/div[2]/div/ul/li[1]/a")).getText();
	        assertEquals("BRASIL", filtroBrasil);
	        String filtroUsados = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[1]/div/div[2]/div/ul/li[2]/a")).getText();
	        assertEquals("USADOS", filtroUsados);
		}
		
		
		@After
		public void takeScreenShot() throws IOException { 
			SimpleDateFormat formatoDeData = new SimpleDateFormat("yyyyMMdd-HHmmss-SSSS");
			String fileName = formatoDeData.format(new Date());
			String shotName = String.format("%s.png", fileName);
			File finalShotFile = new File("C:\\Users\\CASA\\Documents\\Selenium\\TestesAutomacaoBeca\\screenshots", shotName);
			File shotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(shotFile, finalShotFile);
		}
		

		@AfterClass 
		public static void closeDriver() throws InterruptedException {
			Thread.sleep(5000);
			driver.quit();
			
		}
		
	}

