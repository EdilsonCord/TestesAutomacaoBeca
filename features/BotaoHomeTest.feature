# language: pt

	Funcionalidade: Testar botao home 
	
		Um cliente deseja acessar a página home a partir de outras páginas.

		
	@evidencia
	Cenario: Validar se o botao home funciona a partir da pagina Financiar
	Dado que eu navego até a página Home do Webmotors
	Quando eu clico no botão Quero Financiar
	E clico em no botão home dessa página
	Então o titulo da pagina deverá ser 'Webmotors | Compre, venda e financie carros usados, novos e motos'
	
	@evidencia
	Cenario: Validar se o botao home funciona a partir da página Quero Vender
	Dado que eu navego até a página Home do Webmotors
	Quando eu clico no botão Quero Vender
	E clico em no botão home na parte superior dessa página
	Então o titulo da pagina que deverá aparecer será 'Webmotors | Compre, venda e financie carros usados, novos e motos'
	