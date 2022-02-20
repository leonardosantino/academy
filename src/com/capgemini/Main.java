package com.capgemini;

import com.capgemini.challenges.Anagram;
import com.capgemini.challenges.Password;
import com.capgemini.challenges.Stair;

public class Main {

    public static void main(String[] args) {

        // # QUESTÃO 01 Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
        // A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
        System.out.println("# QUESTÃO 01");
        Stair stair = new Stair();

        System.out.println(stair.buildStair(6));

        // # QUESTÃO 02 Construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.
        System.out.println("\n# QUESTÃO 02");
        Password password = new Password();

        System.out.println(password.checkPasswordLength("Ya3"));

        // # QUESTÃO 03 Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.
        System.out.println("\n# QUESTÃO 03");
        Anagram anagram = new Anagram();

        System.out.println(anagram.findNumberAnagrams("ovo"));
    }
}
