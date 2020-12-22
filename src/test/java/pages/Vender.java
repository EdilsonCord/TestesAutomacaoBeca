//CT 05
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class Vender extends CommonsBasePage {

	WebDriverWait wait;
	Actions builder;

	WebElement clicarVender;
	WebElement venderVeiculo;
	String btnVender = "/html/body/div[1]/header/nav/div/ul/li[2]";
	String venderTexto = "Vender meu veículo";

	public Vender() {
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}

	public void navegaSite() {
		navegarAteSite("https://www.webmotors.com.br");

	}

	public void clicarElemento() {
		clicarVender = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btnVender)));
		wait.until(ExpectedConditions.elementToBeClickable(clicarVender)).click();

		venderVeiculo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(venderTexto)));
		wait.until(ExpectedConditions.elementToBeClickable(venderVeiculo)).click();
		trocarAba();
	}
	
	
	
	public void validaPaginaVender(String texto) {
		validaIgualdade(texto);
	}
}

