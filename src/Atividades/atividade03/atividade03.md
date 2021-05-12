<h1 align="center" >Atividade 03</h1>

## 1. Descreva o funcionamento de uma lista encadeada simples e diferencie do funcionamento de um vetor.

Em uma lista encadeada simples os objetos são armazenados na forma nodos ou células, onde cada célula aponta
para a seguinte. Diferente dos arrays, os elementos das listas encadeadas não podem ser acessados atráves de 
um índice tornando assim obrigatório percorrer elemento por elemento até encontrar o desejado. A lista encadeada
possui esse comportamento pois, por se tratar de uma estrutura de dados sem tamanho específico,
as células serão armazenadas de forma 'aleatória' na memória RAM.

<br />

## 2. Pesquise sobre Collections e relate suas principais características e sua composição.

No java, Collections é um Framework composto por diversas classes e interfaces utilitárias que auxiliam na munipulação
de dados.

<br />

## 3. Pesquise e relate o funciomendo do List e Arraylist do Java.

No java, List é uma interface que proporciona métodos de manipulação de dados como adicionar, remover e atualizar,
portanto não pode ser instânciada. Diferente do List, o ArrayList é uma classe que pode ser instânciada, porém possui
comportamento semelhante ao List.

<br />

## 4. Pesquise sobre Vector e LinkedList em Java e relate se há e quais são suas diferenças.

O Vector e o ArrayList são muito semelhantes no forma como funcionam, diferindo apenas na alocação dinâmica de
seu tamanho. Já o LinkedList é uma implementação de uma lista encadeada, portanto não fornece facilidade no acesso 
randômico, e os seus métodos get e set são mais lentos do que o ArrayList. Em compensação, add e remove são mais rápidos.

<br />

## Atividade 5 
[clique aqui](https://github.com/NahtanN/aula-estrutura-de-dados/blob/master/src/aula/DAO/GerenciarClienteArraylistDAO.java)

<br />

## Atividade 6
[clique aqui](https://github.com/NahtanN/aula-estrutura-de-dados/blob/master/src/aula/DAO/GerenciarClienteVectorDAO.java)

<br />

## Testes com as classes
[clique aqui](https://github.com/NahtanN/aula-estrutura-de-dados/blob/master/src/aula/teste.java)