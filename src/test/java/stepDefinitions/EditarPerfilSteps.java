//package stepDefinitions;
//
//import io.cucumber.java.pt.E;
//import io.cucumber.java.pt.Então;
//import io.cucumber.java.pt.Quando;
//import pages.Login;
//
//public class EditarPerfilSteps {
//	
//	Login editarPerfil = new Login();
//	
//	@E("eu clico no botão Nome -> Editar Perfil")
//	public void clicarNoEditarPerfil () {
//		editarPerfil.clicarEditarPerfil();
//	}
//	
//	@E("eu insiro a data de nascimento, o cep e o telefone")
//	public void insereNasc() {
//		editarPerfil.insereDataNasc("03091998", "11440180", "13996240761");
//	}
//	
//	@Então ("A pagina seguinte final deverá conter os elementos atualizados")
//	public void validaPagina() {
//		editarPerfil.verificaFiltros("03091998", "11440180", "13996240761");
//	}
//
//}	
