/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract3;

/**
 *
 * @author ngnic
 */
public class Carta implements Envio {
    private double peso;

    public Carta(double peso) {
        this.peso = peso;
    }

    @Override
    public double getPrecio() {
        return peso * 0.01;
    }
    
    public String toString(){
        return peso + "g (Carta)";
    }

}
