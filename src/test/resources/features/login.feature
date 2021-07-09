#language: pt


Funcionalidade: Apenas usuarios cadastrados podem se logar
    
    Cenario: Um usuário válido consegue se logar
    	Dado o usuário válido
    	Quando realiza login
    	Entao é redirecionado para a página de leilões
    	
    Cenario: Um usuario inválido não consegue se logar
    	Dado o usuario inválido
    	Quando tenta se logar
    	Entao continua na página de login
    	