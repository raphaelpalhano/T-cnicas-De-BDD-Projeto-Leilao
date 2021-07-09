package br.com.alura.leilao.acceptance.steps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import br.com.alura.leilao.e2e.pages.Browser;
import br.com.alura.leilao.e2e.pages.LeiloesPage;
import br.com.alura.leilao.e2e.pages.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
	
	private Browser browser;
	private LoginPage loginPage;
	private LeiloesPage leiloesPage;


	
	
	@Dado("o usuário válido")
	public void o_usuário_válido() {
		this.browser = new Browser();
		browser.seed();
		this.loginPage = browser.getLoginPage();

	}



	@Quando("realiza login")
	public void realiza_login() {
		this.leiloesPage =  this.loginPage.realizaLoginComo("fulano", "pass");
	}
	
	
	@Entao("é redirecionado para a página de leilões")
	public void é_redirecionado_para_a_página_de_leilões() {
		assertTrue(leiloesPage.estaNaPaginaDeLeiloes());
	}

	
	@Dado("o usuario inválido")
	public void o_usuario_inválido() {

	
	}


	@Quando("tenta se logar")
	public void tenta_se_logar() {

	
	}

	
	@Entao("continua na página de login")
	public void continua_na_página_de_login() {
	

	}





}
