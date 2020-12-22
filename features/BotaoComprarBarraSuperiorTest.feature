# language: pt

	Funcionalidade: Testar botao comprar da barra superior
	
		Um cliente deseja comprar carro a partir da barra superior da home.

		
	@evidencia
	Cenario: Validar se o botao comprar -> carros novos funciona
	Dado que eu navego até a página Home do Webmotors
	Quando eu clico no botão comprar
	E eu clico no botão comprar carros novos
	Então A pagina seguinte deverá conter os filtros BRASIL e NOVOS
	
	@evidencia
	Cenario: Validar se o botao comprar -> carros usados ou seminovos funciona
	Dado que eu navego até a página Home do Webmotors
	Quando eu clico no botão comprar
	E eu clico no botão comprar carros usados ou seminovos
	Então A pagina seguinte deverá conter os filtros BRASIL e USADOS
	
