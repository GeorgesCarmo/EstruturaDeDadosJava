/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuscaLinear;

import java.util.Scanner;

/**
 *
 * @author luana
 */
public class Main {
    
    public static void main(String[] args) {
        int[] vetor = new int[8];
        
        for(int i=0; i <vetor.length;i++){
            vetor[i] = (int)(Math.random() * 100);
            System.out.println(vetor[i]);
        }
        
        System.out.println("Qual numero deseja buscar: ");
        Scanner scan = new Scanner(System.in);
        
        int buscado = scan.nextInt();
        
        boolean achou = false;
        
        for(int i = 0; i<vetor.length;i++){
            if(vetor[i]==buscado){
                achou = true;
                break;
            }
        }
        
        if(achou==true){
            System.out.println("Achooooou");
        }else{
            System.out.println("Nao achou");
        }
            
    }
    
}
