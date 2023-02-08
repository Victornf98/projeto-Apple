@Go
Feature: Acessando o site da Apple para validar a compra de um produto
  Eu como usuario
  Quero acessar o site da apple
  Para comprar um Mackbook
  
  Background:
  Given que eu esteja no site da Apple

  @Go
  Scenario: Comprando Macbook Apple
    And clicar no campo Mac
    And depois clicar no modelo Mackbook Pro
    When selecionar a opcao comprar
    And posteriormente selecionar o produto mais caro
    Then valido as informações 
   
 
