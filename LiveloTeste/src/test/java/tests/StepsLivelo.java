package tests;

import elementos.ElementosLivelo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MetodosLivelo;

public class StepsLivelo {

	MetodosLivelo metodos = new MetodosLivelo();
	ElementosLivelo el = new ElementosLivelo();

	// CT01
	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String url) throws InterruptedException {
		metodos.abrirNavegador(url);
		metodos.pausa(3000);

	}

	// CT01
	@When("clicar no produto")
	public void clicar_no_produto() throws InterruptedException {
		metodos.esperaImplicita();
		metodos.preencher(el.digprod, "Celular");
		metodos.pausa(3000);
		metodos.clicar(el.pesquisar);
		metodos.clicar(el.cookies);
		metodos.pausa(3000);
		metodos.clicar(el.prodcelular);
		metodos.pausa(3000);

	}

	// CT01
	@Then("adicionar no carrinho")
	public void adicionar_no_carrinho() throws InterruptedException {
		metodos.preencher(el.cep, "06408015");
		metodos.clicar(el.buscarCep);
		metodos.clicar(el.adicionarcarrinho);
		metodos.esperaImplicita();
		metodos.validarTexto(el.valPontocel, "308.600 Pontos");
		metodos.pausa(3000);
		metodos.clicar(el.removercarrinhcel);
		metodos.fecharNavegador();

	}

	// CT02
	@When("clicar na panela eletrica")
	public void clicar_na_panela_eletrica() throws InterruptedException {
		metodos.esperaImplicita();
		metodos.clicar(el.cookies);
		metodos.preencher(el.digprod, "Panela Eletrica");
		metodos.pausa(3000);
		metodos.clicar(el.pesquisar);
		metodos.pausa(3000);
		metodos.clicar(el.prodpanela);
		metodos.pausa(3000);

	}

	// CT02
	@Then("adicionar panela no carrinho")
	public void adicionar_panela_no_carrinho() throws InterruptedException {
		metodos.clicar(el.voltagem);
		metodos.preencher(el.cep, "06408015");
		metodos.clicar(el.buscarCep);
		metodos.clicar(el.adicionarcarrinho);
		metodos.esperaImplicita();
		metodos.pausa(3000);
		metodos.clicar(el.removercarrinhpan);
		//metodos.validarTexto(el.valPontopan, "");
		metodos.fecharNavegador();
	}

	// CT03
	@When("clicar no brinquedo")
	public void clicar_no_brinquedo() throws InterruptedException {
		metodos.esperaImplicita();
		metodos.clicar(el.cookies);
		metodos.preencher(el.digprod, "Brinquedo");
		metodos.pausa(3000);
		metodos.clicar(el.pesquisar);
		metodos.esperaImplicita();
		metodos.clicar(el.prodbrinquedo);
		metodos.pausa(3000);
	}

	// CT03
	@Then("adicionar brinquedo no carrinho")
	public void adicionar_brinquedo_no_carrinho() throws InterruptedException {
		metodos.preencher(el.cep, "06408015");
		metodos.clicar(el.buscarCep);
		metodos.clicar(el.adicionarcarrinho);
		metodos.esperaImplicita();
		metodos.pausa(3000);
		metodos.clicar(el.removercarrinhobrin);
		//metodos.validarTexto(el.valPontobrin, "");
		metodos.fecharNavegador();

	}

}
