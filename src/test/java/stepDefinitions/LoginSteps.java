package stepDefinitions;

import io.cucumber.java.an.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.Login;

public class LoginSteps {
	
	Login campologar = new Login();
	
	@Quando("eu clico no botão logar ou cadastrar")
	public void clicarElementos() {
		campologar.clicarElemento();
	}

	@E("preencho os campos e-mail e senha corretamente")
	public void inserirdadoslogin() throws InterruptedException {
		campologar.inserirdadoslogin("edilson.cordeiro@outlook.com", "aloalo@");
	}

	@E("clico no botão entrar")
	public void clicarElemento1() throws InterruptedException {
		campologar.clicarElemento1();
	}

	@Então("A página deverá Webmotors | Compre, venda e financie carros usados, novos e motos")
	public void validaIgualdade() {
		campologar.validaIgualdade("Webmotors | Compre, venda e financie carros usados, novos e motos");
	}

}
