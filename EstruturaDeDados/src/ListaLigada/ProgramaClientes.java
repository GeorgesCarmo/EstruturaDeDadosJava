/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaLigada;

/**
 *
 * @author luana
 */
public class ProgramaClientes {
    
    public static void main(String[] args) {
        
        ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();
        
        clientes.adicionar(new Cliente("Georges","123654789"));
        clientes.adicionar(new Cliente("Maria","6547896321"));
        clientes.adicionar(new Cliente("Luana","822369741"));
        
        
        System.out.println("Tamanho: " + clientes.getTamanho());
        for (int i = 0; i < clientes.getTamanho(); i++) {
            System.out.println(clientes.get(i).getValor());
        }
    }
    
}
