package br.com.alura.leilao.acceptance.steps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import br.com.alura.leilao.e2e.pages.Browser;
import br.com.alura.leilao.e2e.pages.LeiloesPage;
import br.com.alura.leilao.e2e.pages.LoginPage;
import br.com.alura.leilao.e2e.pages.NovoLeilaoPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LeilaoSteps {
	
	
	private LoginPage loginPage;
	private LeiloesPage leiloesPage;
	private NovoLeilaoPage novoleilaoPage;
	private Browser browser;

	@Dado("um usuario logado")
	public void o_usuario_logado() {
		 this.browser = new Browser();
		browser.seed();
		this.loginPage = browser.getLoginPage();
		this.leiloesPage = this.loginPage.realizaLoginComoFulano();
		
	
	}



	@Quando("acessa a pagina de novo leilao")
	public void acessa_a_pagina_de_novo_leilao() {
		this.novoleilaoPage = this.leiloesPage.visitaPaginaParaCriarUmNovoLeilao();
	
	}
	
	@E("preencher o formulario com dados válidos")
	public void preencher_o_formulario_com_dados_válidos() {
		this.leiloesPage = this.novoleilaoPage.preencheForm("Iphone 5", "1600", "09/07/2021");
	}

	@Entao("volta para a página de leiloes")
	public void volta_para_a_página_de_leiloes() {
		assertTrue(this.leiloesPage.estaNaPaginaDeLeiloes());

	}
	
	@E("o novo leilao aparece na tabela")
	public void o_novo_leilao_aparece_na_tabela() {
		this.leiloesPage.existe("Iphone 5", "1600", "09/07/2021", "fulano");
		this.browser.clean();
	}

}
