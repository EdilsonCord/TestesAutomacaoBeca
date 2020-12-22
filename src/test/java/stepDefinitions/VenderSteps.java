package stepDefinitions;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.Vender;

public class VenderSteps {

	Vender campoVender = new Vender();

	@Quando("eu clico no botão vender")
	public void clicarElementos() {
		campoVender.clicarElemento();
	}

	@Então("A página deverá aparecer Vender meu veículo")
	public void validaPaginaVender() {
		campoVender.validaIgualdade("Venda seu carro usado ou seminovo na Webmotors");
	}

}