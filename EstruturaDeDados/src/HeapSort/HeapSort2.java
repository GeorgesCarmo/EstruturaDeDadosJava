/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HeapSort;

import Comparacao.Resultado;

/**
 *
 * @author luana
 */
public class HeapSort2 {

    static int trocas = 0;

    public static Resultado sort(int[] vetor) {
        //HEAP SORT

        int n = vetor.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            aplicarHeap(vetor, n, i);
        }
        for (int j = n - 1; j > 0; j--) {
            int aux = vetor[0];
            vetor[0] = vetor[j];
            vetor[j] = aux;
            trocas++;

            aplicarHeap(vetor, j, 0);
        }
        return new Resultado(vetor, trocas);
    }

    private static void aplicarHeap(int[] vetor, int n, int i) {
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < n && vetor[esquerda] > vetor[raiz]) {
            raiz = esquerda;
        }
        if (direita < n && vetor[direita] > vetor[raiz]) {
            raiz = direita;
        }
        if (raiz != i) {
            int aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;
            trocas++;

            aplicarHeap(vetor, n, raiz); // aplicando recursividade
        }
    }
}