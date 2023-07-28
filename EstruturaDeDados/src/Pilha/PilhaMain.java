/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilha;

/**
 *
 * @author luana
 */
public class PilhaMain {
    
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        
        pilha.adicionar("E");
        pilha.adicionar("B");
        pilha.adicionar("Z");
        pilha.adicionar("D");
        pilha.adicionar("C");
        
        System.out.println("Topo: "+pilha.get());
        pilha.remover();
        System.out.println("Novo topo: "+pilha.get());
        pilha.remover();
        System.out.println("Novo topo: "+pilha.get());
    }
    
}
