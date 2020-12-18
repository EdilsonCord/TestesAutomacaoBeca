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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testHello() {
		driver.manage().window().maximize();
		driver.get("https://www.webmotors.com.br/");
		assertEquals(driver.getTitle(), "webmotors");
	}

//	@Test
//	public void aceitarCookies() {
//		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/button")).click();
//
//	}

	@Test
	public void inserirCarroaComprar() {
		driver.findElement(By.xpath("//*[@id=\"searchBar\"]")).sendKeys("Honda Xre");
		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[2]/div/div/a")).click();
	}

	@After

	public void takeScreenshot() throws IOException, InterruptedException {
		Thread.sleep(15000);
		SimpleDateFormat formatoDeData = new SimpleDateFormat("yy-MM-dd-HH-SS");
		String fileName = formatoDeData.format(new Date());
		String shotName = String.format("%s.png", fileName);
		File finalShotFile = new File("C:\\Chromedriver\\Screenshots", shotName);
		File shotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(shotFile, finalShotFile);
	}

	@AfterClass
	public static void quitDriver() throws InterruptedException {
		Thread.sleep(15000);
		driver.quit();
	}
}
