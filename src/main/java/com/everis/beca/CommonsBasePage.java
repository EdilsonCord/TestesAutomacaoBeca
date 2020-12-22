package com.everis.beca;
import static com.everis.beca.DriverFactory.driver;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonsBasePage extends DriverFactory {

	protected WebDriverWait wait = new WebDriverWait(_Driver(), 15);

    public WebElement validarElementoEmTela(By by){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void clicarElemento(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }
    
    public void preencherTextoElemento(By by, String texto){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(texto);
    }

    public void navegarAteSite(String site){
        _Driver().get(site);
        _Driver().manage().window().maximize();
    }

    public void rolarAteElemento(WebElement elemento){
        ((JavascriptExecutor)_Driver()).executeScript("arguments[0].scrollIntoView(true);", elemento);
    }

    public void validaCondicaoVerdadeira(String mensagemFalha, Boolean condicao){
        assertTrue(mensagemFalha, condicao);
    }
    
    public void validaIgualdade (String texto) {
    	assertEquals(_Driver().getTitle(), texto);
    	
    }
    

    
    public void trocarAba() {	
	    List<String> abas = new ArrayList<>(_Driver().getWindowHandles());
		_Driver().close();
		_Driver().switchTo().window(abas.get(1));
    
    }
}
