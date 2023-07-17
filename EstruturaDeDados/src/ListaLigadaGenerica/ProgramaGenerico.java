/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaLigadaGenerica;

import ListaLigada.ListaLigada;

/**
 *
 * @author luana
 */
public class ProgramaGenerico {
    
public static void main(String[] args) {

        ListaLigadaGenerica<String> lista = new ListaLigadaGenerica<String>();
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo: " + lista.getUltimo().getValor());

        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }
        System.out.println("---------------------------");
        // adicionar estado 
        lista.adicionar("SP");
        System.out.println("Adicionou estado SP");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo: " + lista.getUltimo().getValor());

        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }
        System.out.println("---------------------------");
        // remover estado
        lista.remover("CE");
        lista.remover("AC");
        lista.remover("SP");
        System.out.println("Remover estados AC, CE e SP");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo: " + lista.getUltimo().getValor());

        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }
    }
}

