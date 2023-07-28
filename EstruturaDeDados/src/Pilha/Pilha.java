/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilha;
/**
 *
 * @author luana
 */
public class Pilha { // não é uma estrutura de dados igual a fila, não precisa de uma nova forma de organizar os dados. É um tipo abstrato de dados.
    
    private ListaLigada lista;
    
    public Pilha(){
        this.lista = new ListaLigada();
            }
    public void adicionar (String novoValor){
        this.lista.adicionarComeco(novoValor);
    }
    
    public void remover(){
        this.lista.remover(this.get());
    }
    
    public String get(){
        return (String) this.lista.getPrimeiro().getValor();
    }
}
