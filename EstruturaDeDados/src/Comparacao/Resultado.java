/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparacao;

/**
 *
 * @author luana
 */
public class Resultado {
    private int[] vetor;
    private int trocas;

    public Resultado(int[] vetor, int trocas) {
        this.vetor = vetor;
        this.trocas = trocas;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public int getTrocas() {
        return trocas;
    }

    public void setTrocas(int trocas) {
        this.trocas = trocas;
    }
    
    
    
}
