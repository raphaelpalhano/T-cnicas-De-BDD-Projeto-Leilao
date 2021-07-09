#language: pt


Funcionalidade: Cadastrando um leilao
    
    Contexto: 
     Dado um usuario logado
    
    @leilao
    Cenario: Um usuário logado pode cadastrar o leilao
    	Quando acessa a pagina de novo leilao
    	E preencher o formulario com dados válidos
    	Entao volta para a página de leiloes
    	E o novo leilao aparece na tabela 
    	
   