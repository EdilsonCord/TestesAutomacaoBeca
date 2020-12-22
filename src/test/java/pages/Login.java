package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class Login extends CommonsBasePage {

	WebDriverWait wait;
	Actions builder;

	WebElement inserirdadoslogin;	
	WebElement inserirdadoslogin2;
	WebElement inserirdadoslogin3;
	
	WebElement editarPerfil;
	
	String Entrar = "/html/body/div[1]/header/nav/div/ul/li[5]/div[1]/p";
	String Entrar2 = "Logar ou Cadastrar";
	String campoEmail = "//*[@id=\"email\"]";
	String campoSenha = "//*[@id=\"senha\"]";
	String btnEntrar = "//*[@id=\"btnEntrar\"]";
	String clicaNoNome = "/html/body/div[1]/header/nav/div/ul/li[5]";
	String campoEditaPerfil = "/html/body/div[1]/header/nav/div/ul/li[5]/div[2]/ul/li[3]/a";
	String campoDataNasc = "/html/body/div[1]/div/main/div[2]/div/div[1]/div[5]/div/input";
	String campoCep = "/html/body/div[1]/div/main/div[2]/div/div[2]/div[1]/div/input";
	String campoTelefone = "/html/body/div[1]/div/main/div[2]/div/div[2]/div[3]/div/input";
	String campoSalvar = "/html/body/div[1]/div/main/div[2]/div/div[2]/div[7]/div/button";
	
	WebElement login1;
	WebElement login2;
	WebElement btnClick;
	
	
	public Login() {
		
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}

	public void navegarAteSite() {
		navegarAteSite("https://www.webmotors.com.br");
	}

	public void clicarElemento() {
		login1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Entrar)));
		wait.until(ExpectedConditions.elementToBeClickable(login1)).click();
	
		login2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(Entrar2)));
		wait.until(ExpectedConditions.elementToBeClickable(login2)).click();
	}
	public void inserirdadoslogin(String Email, String Senha) throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoEmail))).sendKeys(Email);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoSenha))).sendKeys(Senha);
		
		Thread.sleep(5000);
		}
	
	public void clicarElemento1() throws InterruptedException {
		btnClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btnEntrar)));
		wait.until(ExpectedConditions.elementToBeClickable(btnClick)).click();
		
		Thread.sleep(5000);
	}

	public void validaIgualdade(String texto) {
		assertEquals(driver.getTitle(), texto);
	}
	
	public void clicarEditarPerfil() {
		login1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clicaNoNome)));
		wait.until(ExpectedConditions.elementToBeClickable(login1)).click();
		
		editarPerfil = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoEditaPerfil)));
		wait.until(ExpectedConditions.elementToBeClickable(editarPerfil)).click();
		
		trocarAba();
	}
	
	public void insereDataNasc(String data) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoDataNasc))).sendKeys(data);
	}
	
	public void insereCep(String cep) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoCep))).sendKeys(cep);
	}
	
	public void insereTelefone(String telefone) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoTelefone))).sendKeys(telefone);
	}
	
	public void insereSalvar(String salvar) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoSalvar))).sendKeys(salvar);
	}
	
	public void verificaFiltros(String f1, String f2, String f3) {
		
		String [] filtros = {f1, f2, f3};
		for (String filtrosBarra : filtros) {
			validaCondicaoVerdadeira("Filtro " + filtrosBarra + " não aparece", _Driver().getPageSource().contains(filtrosBarra));
		}
	}
}
	


//
//	static WebDriver driver;
//
//	@BeforeClass
//	public static void createDriver() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
//		driver = new ChromeDriver();
//	}
//
//	@Test
//	public void testHello() {
//		driver.manage().window().maximize();
//		driver.get("https://www.webmotors.com.br/");
//		Cookie clica = new Cookie();
//		clica.clickCookie(driver);
//	}
//
////		@Test
////		public void aceitarCookies() {
////			driver.findElement(By.className("sc-htoDjs gtMZoW")).click();
////
////		}
//
//	@Test
//	public void efetuarLogin() throws InterruptedException {
//		WebElement entrar = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[5]/div[1]/p"));
//		entrar.click();
//		Thread.sleep(3000);
//		WebElement logarCadastro = driver.findElement(By.linkText("Logar ou Cadastrar"));
//		logarCadastro.click();'
//		
//		WebElement inserirdadoslogin = driver.findElement(By.xpath("//*[@id=\"email\"]"));
//		inserirdadoslogin.sendKeys("edilson.cordeiro@outlook.com");
//		
//		
//		WebElement inserirdadoslogin2 = driver.findElement(By.xpath("//*[@id=\"senha\"]"));
//		inserirdadoslogin2.sendKeys("aloalo@");
//		
//		Thread.sleep(3000);
//		WebElement inserirdadoslogin3 = driver.findElement(By.xpath("//*[@id=\"btnEntrar\"]"));
//		inserirdadoslogin3.click();
//		
//		assertEquals(driver.getTitle(), "Webmotors | Compre, venda e financie carros usados, novos e motos");
//		
//		Thread.sleep(5000);
//		
//	}
//
//	@After
//
//	public void takeScreenshot() throws IOException, InterruptedException {
//		SimpleDateFormat formatoDeData = new SimpleDateFormat("yy-MM-dd-HH-SS");
//		String fileName = formatoDeData.format(new Date());
//		String shotName = String.format("%s.png", fileName);
//		File finalShotFile = new File("C:\\Users\\CASA\\Documents\\Selenium\\TestesAutomacaoBeca\\screenshots", shotName);
//		File shotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(shotFile, finalShotFile);
//	}
//
//	@AfterClass
//	public static void quitDriver() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.quit();
//	}
//}
