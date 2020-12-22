package stepDefinitions;
import io.cucumber.java.pt.*;
import pages.*;

public class AjudaSteps {
	
	Ajuda campoAjuda = new Ajuda();
	
	
	@Quando("eu clico no botão ajuda")
	public void ajudaCompradoress () {
		campoAjuda.ajudaCompradores();
	}
	
	@Então ("A pagina devera aparecer 'Compradores & Anunciantes – Webmotors'")
	public void validaPagina() {
		String texto = "Compradores & Anunciantes – Webmotors";
		campoAjuda.validaIgualdade(texto);
	}

}