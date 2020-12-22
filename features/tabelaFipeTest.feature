# language: pt

	Funcionalidade: Testar o fluxo da tabela FIPE
	
		Um cliente deseja consultar a tabela FIPE.
		Ele deseja clicar no botão de serviços e realizar o fluxo da tabela FIPE com determinado carro.
		
	@evidencia
	Cenario: Validar se o fluxo da tabela FIPE funciona
	Dado que eu navego até a página Home do Webmotors
	Quando eu clico no botão serviços -> Tabela Fipe Webmotors
	E eu clico no botão tipo carro
	E eu clico na marca FIAT
	E eu clico no modelo Cronos
	E eu clico no ano 2021
	E eu clico na versao 1.3 FIREFLY FLEX DRIVE MANUAL
	E eu clico no estado São Paulo
	Então A pagina seguinte final deverá conter todos os filtros em que cliquei
	