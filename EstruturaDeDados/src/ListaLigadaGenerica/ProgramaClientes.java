/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaLigadaGenerica;

/**
 *
 * @author luana
 */
public class ProgramaClientes {

    public static void main(String[] args) {
        ListaLigadaGenerica<Cliente> clientes = new ListaLigadaGenerica<Cliente>();
        clientes.adicionar(new Cliente("123", "Jao"));
        clientes.adicionar(new Cliente("1234", "Juca"));
        clientes.adicionar(new Cliente("12345", "Ze"));

        System.out.println("Tamanho: " + clientes.getTamanho());
        for (int i = 0; i < clientes.getTamanho(); i++) {
            System.out.println(clientes.get(i).getValor());
        }
    }
}
