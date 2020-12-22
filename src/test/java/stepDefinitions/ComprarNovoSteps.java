package stepDefinitions;

import io.cucumber.java.pt.*;

import pages.ComprarNovo;

public class ComprarNovoSteps {
	
	
	ComprarNovo comprar = new ComprarNovo();
	@Quando("eu clico no botão comprar")
	public void clicarNoBotãoComprar () {
		comprar.clicarComprar();
	}
	
	@E("eu clico no botão comprar carros novos")
	public void clicarComprarNovos() {
		comprar.clicarComprarNovo();
	}
	
	@Então ("A pagina seguinte deverá conter os filtros BRASIL e NOVOS")
	public void validaPagina() {
		comprar.verificaFiltros("Brasil", "novos");
	}

}
