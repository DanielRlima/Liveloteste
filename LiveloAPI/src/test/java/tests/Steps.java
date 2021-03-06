package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.StringContains;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Steps {

		//Criamos um metodo chamado consulta que recebe uma rota como atributo String
	public Response consulta() {

		//Criei um objeto do tipo Reponse que recebe a URI atrav?s de restAssured 
		Response response = RestAssured.get("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1");

		return response;

	}

	@Given("que eu esteja usando o verbo get")
	public void que_eu_esteja_usando_o_verbo_get() {

		String retorno = consulta().asPrettyString();
		System.out.println("Resposta da consulta" + retorno);
	}

	@Then("recebo status code {int}")
	public void recebo_status_code(int statuscode) {
		
		int code = consulta().getStatusCode();
		assertEquals(statuscode, code);
		
	}

	@Then("valido o tempo de resposta")
	public void valido_o_tempo_de_resposta() {
		
		long time = consulta().time();
		System.out.println("*******time******" + time);
		System.out.println(time);
	}

	@SuppressWarnings("deprecation")
	@Then("valido o body response")
	public void valido_o_body_response() {
		
		String body = consulta().asString();
		System.out.println("*********retorno da api body********* " + body);
		assertThat(body, StringContains.containsString(body));
		
	}

}
