package stepDefinitions;


import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.CampoDeBuscaCarros;

public class BuscaCarrosSteps {
	
	CampoDeBuscaCarros buscarCarros = new CampoDeBuscaCarros();
	
	
	@Quando("eu pesquiso HYUNDAI SONATA")
	public void pesquisarCarro() {
		buscarCarros.inserirPesquisa("HYUNDAI SONATA");
	}
	
	@E ("clico no botão Ver Ofertas")
	public void clicarVerOfertas() {
		buscarCarros.clicarBotaoVerOfertas();
	}
	
	@Então ("A pagina devera que abrir deverá conter o filtro HYUNDAI SONATA")
	public void validaPagina() {
		buscarCarros.verificaFiltros("HYUNDAI SONATA");
	}
}
