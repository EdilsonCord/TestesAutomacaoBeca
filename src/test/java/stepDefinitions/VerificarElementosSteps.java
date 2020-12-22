package stepDefinitions;

import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import pages.VerificarElementos;

public class VerificarElementosSteps {

	VerificarElementos campoVerif = new VerificarElementos();

	
	@Quando("eu verificar a barra superior")
	public void verificarBarraSuperior() {
		campoVerif.verificarElementos();
	}

	@Então("a página deverá aparecer os seguintes elementos: Comprar, Vender, Serviços, Ajuda etcs")
	public void verificaFiltros( ) {
		campoVerif.verificaFiltros("Comprar", "Vender", "Serviços", "Ajuda");

	}
}