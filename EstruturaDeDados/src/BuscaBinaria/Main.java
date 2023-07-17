/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuscaBinaria;

import java.util.Scanner;

/**
 *
 * @author luana
 */
public class Main { // O(log n) melhor complexidade

    public static void main(String[] args) {
        int[] vetor = new int[100000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
            System.out.println(vetor[i]);
        }
        
        System.out.println("Qual numero deseja busca: ");
        Scanner scan = new Scanner(System.in);
        int buscado = scan.nextInt();
        
        int contador = 0;
        
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length-1;
        int meio;
        while (inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);
            contador++; // conta quantos testes a busca fez
            if(vetor[meio] == buscado){
                achou = true;
                break;
            }else if(vetor[meio]<buscado){
                inicio = meio +1;
            }else{
                fim = meio-1;
            }
        }
        System.out.println("Quantidade de testes: "+contador);
        if(achou == true){
            System.out.println("Achoooooou!!");
        }else{
            System.out.println("Nao achou!!");
        }
    }
}
