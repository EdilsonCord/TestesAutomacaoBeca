# language: pt

	Funcionalidade: Verificar elementos da tela inicial
	
		O cliente Acessa a págona inicial da Webmotors.
		Ele deseja clicar nos botões: comprar, vender, ajuda e serviços.
		
	@evidencia	
	Cenario: Verificar elementos da tela inicial
	Dado que eu navego até a página Home do Webmotors
	Quando eu verificar a barra superior
	Então a página deverá aparecer os seguintes elementos: Comprar, Vender, Serviços, Ajuda etcs
	
