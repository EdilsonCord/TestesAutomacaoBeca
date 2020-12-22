# language: pt

	Funcionalidade: Testar site funcionalidade ajuda compradores
	
		Um cliente deseja solicitar ajuda.
		Ele deseja clicar no botão de ajuda e ir para uma nova página.
		
	@evidencia
	Cenario: Validar se o botão ajuda funciona
	Dado que eu navego até a página Home do Webmotors
	Quando eu clico no botão ajuda
	Então A pagina devera aparecer 'Compradores & Anunciantes – Webmotors'