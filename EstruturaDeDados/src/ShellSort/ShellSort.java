/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShellSort;

import Comparacao.Resultado;

/**
 *
 * @author luana
 */
public class ShellSort {
    
    public static Resultado sort(int[] vetor){
        int trocas = 0;
        int h = 1;
        int n = vetor.length;
        while(h < n){
            h = h * 3 +1;
        }
        h = (int)Math.floor(n/3);
        
        int elemento, j;
        while(h > 0){
            for(int i = h; i < n; i++){
                elemento = vetor[i];
                j = i;
                while(j >= h && vetor[j - h] > elemento){
                    vetor[j] = vetor[j - h];
                    j = j - h;
                    trocas++;
                }
                vetor[j] = elemento;
                trocas++;
            }
            h = h/2;
        }
        return new Resultado (vetor, trocas);
    }
    
}
