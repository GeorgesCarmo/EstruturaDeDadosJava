/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fila;

/**
 *
 * @author luana
 */
public class FilaMain {
    
    public static void main(String[] args) {
        Fila fila = new Fila();
        
        fila.adicionar("Jao");
        fila.adicionar("Ze");
        fila.adicionar("Juca");
        fila.adicionar("Maria");
        fila.adicionar("Ana");
        
        
        System.out.println("Primeiro da fila: "+fila.get());
        fila.remover();
        System.out.println("Novo primeiro da fila: "+fila.get());
        fila.remover();
        System.out.println("Novo primeiro da fila: "+fila.get());
    }
    
}
