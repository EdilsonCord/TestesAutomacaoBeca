package stepDefinitions;
import io.cucumber.java.pt.*;
import pages.*;

public class BotaoQueroVenderSteps {
	
	BotaoHomeQueroVender botaoQueroVender = new BotaoHomeQueroVender();
	

	
	@Quando("eu clico no botão Quero Vender")
	public void botaoFinanciar() {
		botaoQueroVender.botaoHomeQueroVender();
	}
	
	@E("clico em no botão home na parte superior dessa página")
	public void clicarBotao() {
		botaoQueroVender.clicarBotaoHome();
	}
	
	@Então ("o titulo da pagina que deverá aparecer será 'Webmotors | Compre, venda e financie carros usados, novos e motos'")
	public void validaPagina() {
		
		botaoQueroVender.validaPaginaHome();
	}

}