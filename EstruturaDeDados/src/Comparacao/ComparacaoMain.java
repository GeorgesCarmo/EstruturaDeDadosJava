/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparacao;

import BubbleSort.BubbleSort;
import BubbleSort.BubbleSort2;
import HeapSort.HeapSort2;
import InsertionSort.InsertionSort;
import QuickSort.QuickSort2;
import SelectionSort.SelectionSort;
import ShellSort.ShellSort;

/**
 *
 * @author luana
 */
public class ComparacaoMain {
    public static void main(String[] args) {
        
        int[] vetor = new int[10];
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int)Math.floor(Math.random()*vetor.length);
        }
        long inicio,fim;
        Resultado resultado;
        
        System.out.println("\nBubble Sort");
        inicio = System.currentTimeMillis();
        resultado = BubbleSort.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: "+(fim - inicio)+"ms");
        System.out.println("Trocas: "+resultado.getTrocas());
        
        System.out.println("\nInsertion Sort");
        inicio = System.currentTimeMillis();
        resultado = InsertionSort.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: "+(fim - inicio)+"ms");
        System.out.println("Trocas: "+resultado.getTrocas());
        
        System.out.println("\nSelection Sort");
        inicio = System.currentTimeMillis();
        resultado = SelectionSort.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: "+(fim - inicio)+"ms");
        System.out.println("Trocas: "+resultado.getTrocas());
        
        System.out.println("\nShell Sort");
        inicio = System.currentTimeMillis();
        resultado = ShellSort.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: "+(fim - inicio)+"ms");
        System.out.println("Trocas: "+resultado.getTrocas());
        
        System.out.println("\nHeap Sort");
        inicio = System.currentTimeMillis();
        resultado = HeapSort2.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: "+(fim - inicio)+"ms");
        System.out.println("Trocas: "+resultado.getTrocas());
        
        System.out.println("\nQuick Sort");
        inicio = System.currentTimeMillis();
        resultado = QuickSort2.sort(vetor.clone(),0,vetor.length);
        fim = System.currentTimeMillis();
        System.out.println("Tempo: "+(fim - inicio)+"ms");
        System.out.println("Trocas: "+resultado.getTrocas());
    }
}
