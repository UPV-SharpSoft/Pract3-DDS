/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract3;

/**
 *
 * @author niko
 */
public class Carta extends Envio {

    //private final double precioPorGramo = 0.01;
    
    public Carta(double peso) {
        this.peso = peso;
    }

    @Override
    public double calcularCoste() {
        //return peso * precioPorGramo;
        return peso * estrategia.calcularCoste('c');
    }
}
