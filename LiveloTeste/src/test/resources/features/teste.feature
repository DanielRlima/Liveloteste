#Author: daniel.rlima@hotmail.com

Feature: Entrar no site da Livelo
  Eu como usuário quero acessar o site da livelo para realizar a compra de produtos
  
 	Background: Acessar o site
    Given que eu esteja no site "https://www.livelo.com.br"

@executa
 	Scenario: Adicionar produtos no carrinho
    When clicar no produto
    Then adicionar no carrinho
 
	Scenario: Adicionar panela eletrica no carrinho
    When clicar na panela eletrica
    Then adicionar panela no carrinho

  Scenario: Adicionar Brinquedo no carrinho
    When clicar no brinquedo
    Then adicionar brinquedo no carrinho
    
    