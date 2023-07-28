/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fila;
import ListaLigadaGenerica.ListaLigadaGenerica;

/**
 *
 * @author luana
 */
public class Fila { // A fila não é uma estrutura de dados, ela é um tipo abstrato de dados. Não precisa de nenhuma forma nova de armazenar os dados.
    private ListaLigadaGenerica lista;
    
    public Fila(){
        this.lista = new ListaLigadaGenerica();
    }
    
    public void adicionar(String novoValor){
        this.lista.adicionar(novoValor);
    }
    
    public void remover(){
        this.lista.remover(this.get());
    }
    
    public String get(){
        return (String) this.lista.getPrimeiro().getValor();
    }
}
