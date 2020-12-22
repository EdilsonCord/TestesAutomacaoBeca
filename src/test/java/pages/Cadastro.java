package pages;



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

import com.everis.beca.CommonsBasePage;

public class Cadastro extends CommonsBasePage {
	
	
	
}
//static WebDriver driver; 
//	
//	
//	
//	@BeforeClass
//	public static void createDriver() {
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
//		driver = new ChromeDriver(); 
//		
//	}
//	
//	@Test
//	public void testHello() {
//		driver.manage().window().maximize();
//		driver.get("https://www.webmotors.com.br/");
//		
//		Cookie clica = new Cookie();
//		clica.clickCookie(driver);
//	}
//	
//	
//	@Test
//	public void cadastroDeEmail() throws InterruptedException {
//		
//		WebElement entrar = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[5]/div[1]/p"));
//		entrar.click();
//		WebElement logarCadastro = driver.findElement(By.linkText("Logar ou Cadastrar"));
//		logarCadastro.click();
//		
//		Thread.sleep(3000);
//		WebElement criarConta1= driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/form[1]/div[4]/button/strong"));
//		criarConta1.click();
//		
//		WebElement nome= driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/form[1]/div[1]/div/input"));
//		nome.sendKeys("Edilson de Araujo Cordeiro");
//		
//		WebElement email= driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/form[1]/div[2]/div/input"));
//		email.sendKeys("edilson.cordeiro@outlook.com");
//		
//		WebElement senha= driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/form[1]/div[3]/div/input"));
//		senha.sendKeys("aloalo@");
//		
//		WebElement criarConta2= driver.findElement(By.xpath("/html/body/div[1]/div/main/section/div/div/form[1]/div[7]/button[1]"));
//		criarConta2.click();
//		
//		WebElement aceitarTermos1 = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/label[1]/div/span"));
//		aceitarTermos1.click();
//		
//		WebElement aceitarTermos2 = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/label[2]/div/span"));
//		aceitarTermos2.click();
//		Thread.sleep(5000);
//		
//		WebElement concordar = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[3]/button[2]"));
//		concordar.click();	
//		
////		String emailCadastrado = driver.findElement(By.xpath("//*[@id=\"boxEmail\"]/div/span[2]")).getText();
////		assertEquals("E-mail já cadastrado para outro usuário.", emailCadastrado);
//		
//		driver.getPageSource().contains("E-mail já cadastrado para outro usuário.");
//		
//	}
//	
//	
//	@After
//	public void takeScreenShot() throws IOException { 
//		SimpleDateFormat formatoDeData = new SimpleDateFormat("yyyyMMdd-HHmmss-SSSS");
//		String fileName = formatoDeData.format(new Date());
//		String shotName = String.format("%s.png", fileName);
//		File finalShotFile = new File("C:\\Users\\CASA\\Documents\\Selenium\\TestesAutomacaoBeca\\screenshots", shotName);
//		File shotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(shotFile, finalShotFile);
//	}
//	
//
//	@AfterClass 
//	public static void closeDriver() throws InterruptedException {
//		Thread.sleep(5000);
//		driver.quit();
//		
//	}
//}
