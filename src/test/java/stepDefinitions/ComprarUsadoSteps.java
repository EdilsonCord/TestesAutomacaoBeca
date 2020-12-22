package stepDefinitions;

import io.cucumber.java.pt.*;

import pages.ComprarNovo;

public class ComprarUsadoSteps {
	
	
	ComprarNovo comprar = new ComprarNovo();
	
	@E("eu clico no botão comprar carros usados ou seminovos")
	public void clicarComprarUsados() {
		comprar.clicarComprarUsado();
	}
	
	@Então ("A pagina seguinte deverá conter os filtros BRASIL e USADOS")
	public void validaPagina() {
		comprar.verificaFiltros("Brasil", "usados");
	}

}