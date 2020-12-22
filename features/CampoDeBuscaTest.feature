# language: pt

	Funcionalidade: Testar funcionalidade de pesquisa
	
		Um cliente deseja pesquisar um carro ou moto e verificar as ofertas clicando no botão "Ver Ofertas".

		
	@evidencia
	Cenario: Validar pesquisa por carro clicando em Ver Ofertas
	Dado que eu navego até a página Home do Webmotors
	Quando eu pesquiso HYUNDAI SONATA
	E clico no botão Ver Ofertas
	Então A pagina devera que abrir deverá conter o filtro HYUNDAI SONATA

	
	@evidencia
	Cenario: Validar pesquisa por moto clicando em Ver Ofertas
	Dado que eu navegue até a barra de pequisa da página home e clique no botão Comprar Motos
	Quando eu pesquiso HONDA XRE 190 SE
	E clicando no botão Ver Ofertas
	Então A pagina devera que abrir deverá conter o filtro HONDA XRE 190 SE
	
	