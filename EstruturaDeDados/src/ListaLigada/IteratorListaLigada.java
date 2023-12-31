/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaLigada;

/**
 *
 * @author luana
 */
public class IteratorListaLigada<TIPO> {

    private Elemento<TIPO> elemento;
    
    public IteratorListaLigada(Elemento<TIPO> atual){
        this.elemento = atual;
    }
            

    public boolean temProximo() {
        if (elemento.getProximo() == null) {
            return false;
        } else {
            return true;
        }
    }
    public Elemento<TIPO> getProximo(){
        elemento = elemento.getProximo();
        return elemento;
    }
}
