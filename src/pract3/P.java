/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract3;

/**
 *
 * @author Marcos
 */
public class P extends Envio{
    
    //private final double precioPorGramo = 0.02;

    public P(double peso) {
        this.peso = peso;
    }

    @Override
    public double calcularCoste() {
        //return peso * precioPorGramo;
        return peso * estrategia.calcularCoste('p');
    }
    
}
