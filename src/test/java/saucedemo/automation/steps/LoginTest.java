package saucedemo.automation.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	@Given("que nao esteja logado")
	public void queNaoEstejaLogado() {
		//iniciar teste

	}

	@When("preencho o campo nome")
	public void preenchoOCampoNome() {
		//preencher campo

	}

	@When("preencho a senha")
	public void preenchoASenha() {
		// preencher campo

	}

	@When("clicar no botao login")
	public void clicarNoBotaoLogin() {
		//clicar 

	}

	@Then("usuario logado")
	public void usuarioLogado() {
		//validar texto

	}

	@When("preencho a senha errada")
	public void preenchoASenhaErrada() {
		//validar texto

	}

	@Then("sistema exibe mensagem de erro")
	public void sistemaExibeMensagemDeErro() {
		//

	}

}
