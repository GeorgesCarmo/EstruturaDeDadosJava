/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaLigadaGenerica;

/**
 *
 * @author luana
 */
public class ProgramaInteiros {

    public static void main(String[] args) {
        ListaLigadaGenerica<Integer> numeros = new ListaLigadaGenerica<Integer>();
        numeros.adicionar(3);
        numeros.adicionar(4);
        numeros.adicionar(5);
        numeros.adicionar(6);

        System.out.println("Tamanho: " + numeros.getTamanho());
        for (int i = 0; i < numeros.getTamanho(); i++) {
            System.out.println(numeros.get(i).getValor());
        }
    }
}
