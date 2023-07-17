/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InsertionSort;

import Comparacao.Resultado;

/**
 *
 * @author luana
 */
public class InsertionSort {
    
    public static void main(String[] args) {
        
        int[] vetor = new int[10];
        
        for(int i = 0; i < vetor.length; i++){ // preenchendo o vetor com valores aleatorios
            vetor[i] = (int)(Math.random()*vetor.length);
        }
        System.out.println("Desordenado: ");
        for(int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }
        int aux,j;
        for (int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            j=i-1;
            while(j >= 0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
        System.out.println("\nOrdenado: ");
        for(int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }
    }
    public static Resultado sort(int[] vetor){
        int trocas = 0;
        int aux,j;
        for(int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            j = i-1;
            while(j >= 0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j--;
                trocas++;
            }
            vetor[j+1] = aux;
            trocas ++;
        }
        return new Resultado(vetor, trocas);
    }
}
