# language: pt

	Funcionalidade: Testar funcionalidade login
	
		Um cliente deseja fazer login no site.
		Ele deseja clicar em logar ou cadastrar e iniciar o fluxo de login.
		
	@evidencia
	Cenario: Validar funcionalidade de login	
	Dado que eu navego até a página Home do Webmotors
	Quando eu clico no botão logar ou cadastrar
	E preencho os campos e-mail e senha corretamente
	E clico no botão entrar
	Então A página deverá Webmotors | Compre, venda e financie carros usados, novos e motos
	
#	@evidencia
#	Cenario: Editar perfil de login
#	Dado que eu navego até a página Home do Webmotors
#	Quando eu clico no botão logar ou cadastrar
#	E preencho os campos e-mail e senha corretamente
#	E eu clico no botão Nome -> editar Perfil
#	E eu insiro a data de nascimento, o cep e o telefone
#	Então A pagina seguinte final deverá conter os elementos atualizados
