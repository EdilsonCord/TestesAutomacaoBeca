package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class VerificarElementos extends CommonsBasePage {

	WebElement verif;

	String topoPage = "/html/body/div[1]/header";

	public void navegaSite() {
		navegarAteSite("https://www.webmotors.com.br");
	}

	public void verificarElementos() {
		verif = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(topoPage)));
		wait.until(ExpectedConditions.elementToBeClickable(verif)).click();
	}
	
	public void verificaFiltros(String f1, String f2, String f3, String f4) {
	String [] filtros = {f1, f2, f3, f4};
		 for (String filtrosBarra : filtros) {
			 validaCondicaoVerdadeira("filtro " + filtrosBarra + " não aparece", _Driver().getPageSource().contains(filtrosBarra));
		 }

	}
}
