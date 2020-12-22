package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.CampoDeBuscaMotos;

public class BuscaMotosSteps {
	
	CampoDeBuscaMotos buscarMotos = new CampoDeBuscaMotos();
	
	@Dado("que eu navegue até a barra de pequisa da página home e clique no botão Comprar Motos")
	public void navegarAteSite(){
		buscarMotos.navegaSite();
		buscarMotos.botaoComprarMotos();
	}
	
	@Quando("eu pesquiso HONDA XRE 190 SE")
	public void pesquisarMoto() {
		buscarMotos.inserirPesquisa("HONDA XRE 190 SE");
	}
	
	@E ("clicando no botão Ver Ofertas")
	public void clicarVerOfertas() {
		buscarMotos.clicarBotaoVerOfertas();
	}
	
	@Então ("A pagina devera que abrir deverá conter o filtro HONDA XRE 190 SE")
	public void validaPagina() {
		buscarMotos.verificaFiltros("HONDA XRE 190 SE");
	}
}
