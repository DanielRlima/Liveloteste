#Author: daniel.rlima@hotmail.com

@executa
Feature: Consultar Api
  eu como usuario quero acessar a API e consultar

	Background:
		Given que eu esteja usando o verbo get
				
		Scenario: status code
		Then recebo status code 200
		
		Scenario: Validar time
		Then valido o tempo de resposta
		
		Scenario: Validar response
		Then valido o body response
