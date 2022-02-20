# Desafio de Programação da Academia Técnica Capgemini 2022!

_Terceira etapa do processo de seleção para a Academia Capgemini 2022. O objetivo dessa etapa é testar os seus conhecimentos em lógica de programação. Para isso, preparamos três questões com diferentes níveis de dificuldade. A implementação das questões pode ser feita em qualquer linguagem, porém a utilização de Java será um diferencial._


## ✨ Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias e ferramentas:

- Java openJDK 17.0.2
- JUnit5 5.8.1
- IntelliJ IDEA Community Edition 2021.3.2

## 🚀 Como executar

- Clone o repositório
- No seu editor de código ou IDE, abra o projeto
- Entre na class Main e procure a opção de executar do seu IDE

***Class Main***    `src/com/capgemini/Main`

Dentro da class Main no método inicial main estão as instancias das implementações dos desafios, onde você pode substituir a entrada desses métodos e visualizar os resultados na saída do console do IDE ao executar.

Todos o métodos das implementações dos desafios possuem retorno, por isso são chamados dentro de `System.out.println()`, para que seja exibido o resultado no console.

Comentaríos em linhas no código foram feitos para separar e descrever as 3 questões.

## 🧩 Implemetações

***Class Stair***   `src/com/capgemini/challenges/Stair`

```java
public String buildStair(int stairSteps)
// Recebe um número inteiro maior do que zero como parâmetro 'stairSteps' e retorna uma string em formato de escada.
```

    QUESTÃO 01 Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
    A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

***Class Password***  `src/com/capgemini/challenges/Password`

```java
public int checkPasswordLength(String password)
// Recebe uma string como parâmetro 'password' e retorna um número inteiro entre 0 e 6 
//representando o número caracteres que devem ser adicionados para satisfazer o tamanho mínimo da senha de 6 caracteres.
```

    QUESTÃO 02 Construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados
    para uma string qualquer ser considerada segura.


***Class Anagram***  `src/com/capgemini/challenges/Anagram`

```java
public int findNumberAnagrams(String word)
// Recebe uma string como parâmetro 'word' e retorna um número inteiro representando a quantidade de pares de substrings dessa string que são anagramas.
```

    QUESTÃO 03 Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

## 🚧 Testes

Os Testes foram implementados utilizando o framework JUnit5 5.8.1 em `src/test/java.com.capgemini/`.

***Class StairTest***

***Class PasswordTest***

***Class AnagramTest***

Para executar basta entrar na classe de teste e procurar a opção de executar do seu IDE.
