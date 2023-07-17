/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BubbleSort;

import Comparacao.Resultado;

/**
 *
 * @author luana
 */
public class BubbleSort2 {
    public static Resultado sort(int[] vetor){
        int trocas = 0;
        //BUBBLE SORT O(N^2)
        int aux;
        for(int i = 0; i < vetor.length; i++){
            for( int j= i+1; j < vetor.length; j++){
                if(vetor[i]>vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                    trocas++;
                }
            }
        }
        return new Resultado(vetor, trocas);
    }
}
