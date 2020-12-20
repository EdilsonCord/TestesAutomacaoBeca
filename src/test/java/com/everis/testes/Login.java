package com.everis.testes;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

public class Login {

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
	}

//		@Test
//		public void aceitarCookies() {
//			driver.findElement(By.className("sc-htoDjs gtMZoW")).click();
//
//		}

	@Test
	public void efetuarLogin() throws InterruptedException {
		WebElement entrar = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[5]/div[1]/p"));
		entrar.click();
		Thread.sleep(3000);
		WebElement logarCadastro = driver.findElement(By.linkText("Logar ou Cadastrar"));
		logarCadastro.click();
		
		WebElement inserirdadoslogin = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		inserirdadoslogin.sendKeys("edilson.cordeiro@outlook.com");
		
		
		WebElement inserirdadoslogin2 = driver.findElement(By.xpath("//*[@id=\"senha\"]"));
		inserirdadoslogin2.sendKeys("aloalo@");
		
		Thread.sleep(3000);
		WebElement inserirdadoslogin3 = driver.findElement(By.xpath("//*[@id=\"btnEntrar\"]"));
		inserirdadoslogin3.click();
		
		assertEquals(driver.getTitle(), "Webmotors | Compre, venda e financie carros usados, novos e motos");
		
		Thread.sleep(5000);
		
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
		Thread.sleep(3000);
		driver.quit();
	}
}
