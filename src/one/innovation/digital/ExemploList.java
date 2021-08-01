package one.innovation.digital;

import java.util.*;

/********************************************************************************
 *
 * Objetivo:  1) Criar uma lista.
 *            2) Adicionar 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
 *            3) Navegue na lista exibindo cada nome no console.
 *            4) Substitua o nome Carlos por Roberto.
 *            5) Retorne o nome da posição 1.
 *            6) Remova o nome da posição 4.
 *            7) Remova o nome João.
 *            8) Retorne a quantidade de itens na lista.
 *            9) Verifique se o nome Juliano existe na lista.
 *           10) Crie uma nova lista com os nomes: Ismael e Rodrigo.
 *           11) Adicione todos os nomes da lista nova na primeira lista criada.
 *           12) Ordene os itens da lista por ordem alfabtica.
 *           13) Verifique se a lista está vazia.
 * Autor   : Fernando Aguiar
 * Data    : 01.08.2021
 *
 ********************************************************************************/
public class ExemploList {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(); // (1) - Criar lista.

        lista.add("Juliana"); // (2) - Índice 0 da lista.
        lista.add("Pedro"); // (2) - Índice 1 da lista.
        lista.add("Carlos"); // (2) - Índice 2 da lista.
        lista.add("Larissa"); // (2) - Índice 3 da lista.
        lista.add("João"); // (2) - Índice 4 da lista.

        // (3) - Navegue na lista exibindo no console cada item da lista.
        for (String itemLista: lista) {
            System.out.println("Índice: " + lista.indexOf(itemLista) + " contem: " + itemLista);
        }

        lista.set(2,  "Roberto");  // (4) - No índice que tiver o conteúdo Carlos,
                                   //       substituir por Roberto.

        System.out.println("Indice 1: " + lista.get(1));  // (5) - Exibir o conteúdo do índice 1.

        lista.remove(4); // (6) - Remover o conteúdo do índice 4.

        lista.remove("João"); // (7) - Remover o item que contenha "João".

        System.out.println("Quantidade de itens da lista: " + lista.size()); // (8) - Exibir a quantidade de
                                                                             //       itens da lista.

        // (9) - Verivicar se há item com o conteúdo "Juliano".
        boolean temJuliano = lista.contains("Juliano");

        if (temJuliano) {
            System.out.println("O nome Juliano está na lista!");
        } else {
            System.out.println("O nome Juliano não está na lista!");
        }

        List<String> novaLista = new ArrayList<>(); // (10) - Criar nova lista.

        novaLista.add("Ismael");  // (10) - índice 0 da nova lista.
        novaLista.add("Rodrigo"); // (10) - índice 1 da nova lista.

        lista.addAll(novaLista); // (11) - Adicionar os itens da nova lista na lista.

        Collections.sort(lista); // (12) - Classificar a lista por ordem alfabética.

        // (13) - Verificar se a lista está vazia.
        if (lista.isEmpty()) {
            System.out.println("A lista está vazia!");
        } else {
            System.out.println("A lista tem conteúdo!");
        }
    }
}