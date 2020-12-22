package stepDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.FluxoTabelaFIPE;

public class TabelaFipeSteps {
	
	FluxoTabelaFIPE fluxo = new FluxoTabelaFIPE();
	
	@Quando("eu clico no botão serviços -> Tabela Fipe Webmotors")
	public void clicarNoBotãoServiços () {
		fluxo.clicarServiçosTabelaFipe();
	}
	
	@E("eu clico no botão tipo carro")
	public void clicarTipoCarros() {
		fluxo.clicarTipoCarro();
	}
	
	@E("eu clico na marca FIAT")
	public void clicarMarca() {
		fluxo.clicarMarcaCarro();
	}
	
	@E("eu clico no modelo Cronos")
	public void clicarModelo() {
		fluxo.clicarModeloCarro();
	}
	
	@E("eu clico no ano 2021")
	public void clicarAno() {
		fluxo.clicarAnoCarro();
	}
	
	@E("eu clico na versao 1.3 FIREFLY FLEX DRIVE MANUAL")
	public void clicarVersao() {
		fluxo.clicarVersaoCarro();
	}
	@E("eu clico no estado São Paulo")
	public void clicarEstado() {
		fluxo.clicarEstadoCarro();
	}
	
	@Então ("A pagina seguinte final deverá conter todos os filtros em que cliquei")
	public void validaPagina() {
		fluxo.verificaFiltros("FIAT", "CRONOS", "2021", "1.3 FIREFLY FLEX DRIVE MANUAL", "São Paulo");
	}

}

