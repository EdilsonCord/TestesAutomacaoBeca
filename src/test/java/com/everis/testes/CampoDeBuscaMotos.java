package com.everis.testes;

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
import org.openqa.selenium.chrome.ChromeDriver;

public class CampoDeBuscaMotos {

	static WebDriver driver;

	@BeforeClass
	public static void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@Test
	public void testHello() {
		driver.manage().window().maximize();
		driver.get("https://www.webmotors.com.br/");
		Cookie clica = new Cookie();
		clica.clickCookie(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}


	@Test
	public void inserirMotoaComprar() {
		
		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[1]/h2[1]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[2]/div/div/div/div/input")).sendKeys("Honda Xre 190 SE");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[2]/div/div/a")).click();
		
		String filtroHonda = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[1]/div/div[2]/div/ul")).getText();
        assertEquals("HONDA XRE 190 SE", filtroHonda);
				
	}

	@After

	public void takeScreenshot() throws IOException, InterruptedException {
		SimpleDateFormat formatoDeData = new SimpleDateFormat("yy-MM-dd-HH-SS");
		String fileName = formatoDeData.format(new Date());
		String shotName = String.format("%s.png", fileName);
		File finalShotFile = new File("C:\\Users\\CASA\\Documents\\Selenium\\TestesAutomacaoBeca\\screenshots", shotName);
		File shotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(shotFile, finalShotFile);
	}

	@AfterClass
	public static void quitDriver() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
