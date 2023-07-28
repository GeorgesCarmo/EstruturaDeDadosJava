/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArvoreBinaria;

/**
 *
 * @author luana
 */
public class ArvoreBinariaMain {
    
    public static void main(String[] args) {
        
        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.adicionar(10);
        arvore.adicionar(8);
        arvore.adicionar(5);
        arvore.adicionar(9);
        arvore.adicionar(7);
        arvore.adicionar(18);
        arvore.adicionar(13);
        arvore.adicionar(20);
        
        System.out.println("\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());
        
        //System.out.println("\nPre-ordem");
        //arvore.preOrdem(arvore.getRaiz());
        
        //System.out.println("\nPos-ordem");
        //arvore.posOrdem(arvore.getRaiz());
        
        arvore.remover(20);
        
        System.out.println("\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());
        
        arvore.remover(5);
        
        System.out.println("\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());
        
        arvore.remover(8);
        
        System.out.println("\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());
        
        arvore.remover(9);
        
        System.out.println("\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());
        
        arvore.remover(13);
        
        System.out.println("\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());
        
        arvore.remover(7);
        arvore.remover(18);
        
        System.out.println("\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());
        
        arvore.remover(10);
        
        System.out.println("\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());
        
        
    }
    
}
