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

public class QueroVender {
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
	public void anunciar() throws InterruptedException {
		WebElement anunciar = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[1]/h2[2]/a"));
		anunciar.click();
		
		List <String> abas = new ArrayList<>(driver.getWindowHandles());
		driver.close();
		driver.switchTo().window(abas.get(1));
		
		
		WebElement cadastroEmail = driver.findElement(By.xpath("/html/body/div/div/main/section[1]/div/div/div/div[1]/div[1]/div[1]/input"));
		cadastroEmail.sendKeys("edilson.cordeiro1998@gmail.com");
	
		WebElement comecarAnuncio = driver.findElement(By.xpath("/html/body/div[1]/div/main/section[1]/div/div/div[1]/div[1]/div[2]/button"));
		comecarAnuncio.click();
		
		WebElement aceitarTermos1 = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div[1]/div[2]/div[1]/label"));
		aceitarTermos1.click();
		
		WebElement aceitarTermos2 = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div[1]/div[2]/div[2]/label"));
		aceitarTermos2.click();
		Thread.sleep(3000);
		
		WebElement concordar = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div[1]/div[3]/button[2]"));
		concordar.click();	
		
		
		WebElement marcaCarro= driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div[1]/div[1]/div/div/select/option[4])"));
		marcaCarro.click();
		
		WebElement modeloCarro= driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div[1]/div[1]/div[2]/div/select/option[14]"));
		modeloCarro.click();
		
		WebElement anoModelo= driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div[1]/div[1]/div[3]/div[1]/select/option[2]"));
		anoModelo.click();
		
		WebElement anoFabricacao= driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div[1]/div[1]/div[3]/div[2]/select/option[2]"));
		anoFabricacao.click();
		
		WebElement versaoCarro= driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div[1]/div[1]/div[4]/div/select/option[2]"));
		versaoCarro.click();
		
		WebElement corCarro= driver.findElement(By.xpath("//html/body/div[1]/div/main/section/div[1]/div[1]/div[5]/div/select/option[18]"));
		corCarro.click();
		
				
		WebElement botaoContinuar= driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div[2]/div/button[2]"));
		botaoContinuar.click();
		
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