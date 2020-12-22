# language: pt

	Funcionalidade: Testar funcionalidade vender
	
		Um cliente deseja vender seu veículo.
		Ele deseja clicar em vender e ir iniciar o fluxo de venda.
		
	@evidencia
	Cenario: Validar funcionalidade de vender
	Dado que eu navego até a página Home do Webmotors
	Quando eu clico no botão vender
	Então A página deverá aparecer Vender meu veículo