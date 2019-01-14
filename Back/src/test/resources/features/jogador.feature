@JogadorServiceTest
Feature: Testar operações do Jogador
  O sistema irá simular o uso da API Rest

  Scenario Outline: solicita usuário cadastrado no banco de dados
    Given o usuário fez uma requisição ao servidor com o ID de um jogador
    Then um jogador com o mesmo ID for localizado e retorna ao usuário o Jogador localizado
	
	Examples: 
      | id  | nome  | qtdPartidas | qtdVitorias  |
      | 1   | José  |     3 			| 			2			 |
