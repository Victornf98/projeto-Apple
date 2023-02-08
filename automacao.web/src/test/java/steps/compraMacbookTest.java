package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class compraMacbookTest {
	Metodos me = new Metodos();
	Elementos el = new Elementos();

	@Given("que eu esteja no site da Apple")
	public void queEuEstejaNoSiteDaApple() {
	    Executa.abrirNavegador();
	}
	@Given("clicar no campo Mac")
	public void clicarNoCampoMac() {
	    me.clicar(el.campoMac);
	}
	@Given("depois clicar no modelo Mackbook Pro")
	public void depoisClicarNoModeloMackbookPro() {
	    me.clicar(el.mackBookPro);
	}
	@When("selecionar a opcao comprar")
	public void selecionarAOpcaoComprar() {
	    me.clicar(el.comprar);
	}
	@When("posteriormente selecionar o produto mais caro")
	public void posteriormenteSelecionarOProdutoMaisCaro() {
		me.clicar(el.modelo);
	    me.scroll();
	   // me.pausa(2000);
	    me.clicar(el.btnSelecionar);
	}
	@Then("valido as informações")
	public void validoAsInformações() {
	    me.validarTexto(el.validaTexto, "Personalize seu MacBook Pro de 16 polegadas – Cinza-espacial");
	}
	
}