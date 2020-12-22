package stepDefinitions;
import io.cucumber.java.pt.*;
import pages.*;

public class BotaoHomeFinanciarSteps {
	
	BotaoHome botaoFinanciar = new BotaoHome();
	

	@Quando("eu clico no botão Quero Financiar")
	public void botaoFinanciar() {
		botaoFinanciar.botaoHomeFinanciar();
	}
	
	@E("clico em no botão home dessa página")
	public void clicarBotao() {
		botaoFinanciar.clicarBotaoHome();
	}
	
	@Então ("o titulo da pagina deverá ser 'Webmotors | Compre, venda e financie carros usados, novos e motos'")
	public void validaPagina() {
		
		botaoFinanciar.validaPaginaHome();
	}

}