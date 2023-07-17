package BubbleSort;

import Comparacao.Resultado;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luana
 */
public class BubbleSort { // algoritmo de complexidade quadratica
    
    public static void main(String[] args) {
        
        int[] vetor = new int[10000];
        
        for(int i=0;i<vetor.length;i++){
            vetor[i] = (int)(Math.random()*vetor.length);
           // System.out.println(vetor[i]);
        }
        long inicio = System.currentTimeMillis();
        long fim;
        //BUBBLE SORT - complexidade O(n2) n ao quadrado
        int aux;
        for(int i=0;i<vetor.length;i++){ //complexidade O(n)
            for(int j=i+1;j<vetor.length;j++){// complexidade O(n)
                if(vetor[i]>vetor[j]){
                    aux = vetor[j];
                    vetor[j]=vetor[i];
                    vetor[i] = aux;
                }
            }
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo: "+(fim-inicio));
       /* System.out.println("Vetor ordenado: ");
        for(int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }*/
    }
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
    

