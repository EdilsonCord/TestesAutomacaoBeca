package com.everis.testes;

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

public class LoginEditar {
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
	public void cadastroDeEmail() throws InterruptedException {
		
		WebElement entrar = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[5]/div[1]/p"));
		entrar.click();
		Thread.sleep(3000);
		WebElement logarCadastro = driver.findElement(By.linkText("Logar ou Cadastrar"));
		logarCadastro.click();
		
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/form[1]/div[2]/div/input"));
		login.sendKeys("edilson.cordeiro@outlook.com");
		WebElement senha = driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/form[1]/div[3]/div/input"));
		senha.sendKeys("aloalo@");
		
		Thread.sleep(3000);
		WebElement entrar1 = driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/form[1]/div[4]/input"));
		entrar1.click();
		Thread.sleep(3000);
		WebElement clicandoNoNome = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[5]"));
		clicandoNoNome.click();
		Thread.sleep(3000);
		WebElement editarPerfil = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[5]/div[2]/ul/li[3]/a"));
		editarPerfil.click();
		
		
		List <String> abas = new ArrayList<>(driver.getWindowHandles());
		driver.close();
		driver.switchTo().window(abas.get(1));
		
		
		
		WebElement dataNasc = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div[1]/div[5]/div/input"));
		dataNasc.clear();
		dataNasc.sendKeys("03091998");
		
		
		
		WebElement cep = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div[2]/div[1]/div/input"));
		cep.clear();
		cep.sendKeys("11440180");
		
		WebElement telefone = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div[2]/div[3]/div/input"));
		telefone.clear();
		telefone.sendKeys("13996240761");
		
		WebElement salvar = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div[2]/div[7]/div/button"));
		salvar.click();
		
		String[] elementosAtualizados = {"03/09/1998","11440-180","(13)99624-0764"};
		
		for (String elementos : elementosAtualizados) {
			driver.getPageSource().contains(elementos);
		
		}
		
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
