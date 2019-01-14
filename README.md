# André Guaraldo Caires

#Games Ranking, um grupo de amigos costuma praticar diversas modalidades de jogos. 
Em suas conversas o assunto comum é: quem é o melhor e quem ganhou mais partidas. Foi aí que um deles teve a ideia de preparar um sistema que gravasse um ranking dos jogos. Esse ranking mostraria o jogador, as vitórias e as partidas que esse jogador participou. 

Exemplo: 
```

+-------------------------------+ 
| Jogador | Vitórias | Partidas | 
|---------|----------|----------| 
| José    | 30       | 30       | 
| Carlos  | 20       | 25       | 
| Camila  | 15       | 35       | 
+-------------------------------+
```

##Funcionalidades
 - Adicionar jogador: Permitir informar nome, quantidadeVitorias e quantidadePartidas; 
 - Adicionar vitória: incrementar quantidadeVitorias e quantidadePartidas do jogador;
 - Adicionar partida: incrementar quantidadeVitorias e quantidadePartidas do jogador; 
 - Visualizar Ranking (Listar jogadores ordenado pelo número de vitórias, com as opç?s de incluir vitória e incluir partida) 

##Requisitos técnicos e informações adicionais
- API REST - Criar uma API em Java 8 com os serviços referentes às funcionalidades solicitadas utilizando BDD e TDD. Utilizar: Spring Boot, Cucumber e Mockito.
- Front-End - Utilizar qualquer versão do Angular. Não é necessário criar autenticação para os serviços da API e Front-End. A implementação do do Front-End não é obrigatória.
- Fica a seu critério o banco de dados a ser utilizado. 
- Não é obrigatório implementar todas as funcionalidades

##Avaliação 
##Serão avaliados os seguintes pontos:
- Qualidade e legibilidade do código
- Tratamento de exceções
- Qualidade dos testes
- Funcionalidades desenvolvidas
- Tempo de entrega do desafio