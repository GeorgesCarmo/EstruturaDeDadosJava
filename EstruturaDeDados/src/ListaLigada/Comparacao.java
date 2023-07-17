/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaLigada;

import java.util.ArrayList;

/**
 *
 * @author luana
 */
public class Comparacao {
    public static void main(String[] args) {
        
        ListaLigada<Integer> lista = new ListaLigada<Integer>();
        
        ArrayList<Integer> vetor = new ArrayList<>();
        
        int limite = 10000;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;
        for(int i=0; i<limite; i++){
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou "+limite+" elementos no vetor.");
        System.out.println("Demorou: "+(tempoFinal - tempoInicial)+" millisegundos.");
        
        System.out.println("----------------------------------------");
        
        tempoInicial = System.currentTimeMillis();
        for(int i=0; i<limite; i++){
            lista.adicionar(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou "+limite+" elementos na lista.");
        System.out.println("Demorou: "+(tempoFinal - tempoInicial)+" millisegundos.");
        
        // ler valores
        tempoInicial = System.currentTimeMillis();
        for(int i = 0; i<vetor.size();i++){
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura do vetor: ");
        System.out.println("Demorou: "+(tempoFinal - tempoInicial)+" millisegundos.");
        
        System.out.println("----------------------------------------");
        
        tempoInicial = System.currentTimeMillis();
        IteratorListaLigada<Integer> iterator = lista.getIterator();
        while(iterator.temProximo()){
            iterator.getProximo();
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de leitura da lista: ");
        System.out.println("Demorou: "+(tempoFinal - tempoInicial)+" millisegundos.");
    }
}




