package com.everis.beca;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class ExemploSelenium {
	
	static WebDriver driver; 
	
	@BeforeClass
	public static void createDriver () {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver(); 
	}
	
	@Test
	public void testHello() {
		driver.manage().window().maximize();
		driver.get("https://duque.dev");
		assertEquals(driver.getTitle(), "{duque.dev}");
	}
	
	@Test
	public void testMenuOptions() {
		
		String[] elementos = {"Home", "Sobre mim", "valores", "Portfolio"};
		
		for (String elemento : elementos) {
			driver.getPageSource().contains(elemento);
		}
		
	}
	
	
	@Test
	public void testSobreMim() {
		By locator = By.xpath("/html/body/nav/div/div/ul/li[2]/a");
		WebElement sobreMimButton = driver.findElement(locator);
		
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
