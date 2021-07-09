# language: pt

Funcionalidade: Propondo lances ao leilao

	Cenario: Propondo um unico lance valido
		Dado um lance valido
		Quando propoe o lance ao leilao
		Entao o lance eh aceito

	Cenario: Propondo varios lances validos no leilao
		Dado um lance de 10.0 reais do usuario "fulano"
		E um lance de 15.0 reais do usuario "beltrano"
		Quando propoe varios lances ao leilao
		Entao os lances sao aceitos


	Esquema do Cenario: Propondo um lance invalido
	Dado um lance invalido de <valor> reais e dos usuarios '<nomedoUsuario>'
	Quando propoe o lance ao leilao
	Entao o lance nao eh aceito


	Exemplos:
	 |valor| nomedoUsuario|
	 |  0   |  fulano     |
	 | -1  |   beltrano    | 
 
 
 
	Cenario: Propondo uma sequencia de lances 
		Dado dois lances sendo propostos
		|valor| nomedoUsuario|
		 |  10.0   |  beltrano |
		 | 15.0  |   beltrano  | 
		Quando propoe varios lances ao leilao
		Entao o segundo nao e aceito