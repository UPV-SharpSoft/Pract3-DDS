/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract3;

/**
 *
 * @author markettes
 */
public class Urgente extends DecSA{
    
    public Urgente(Envio envio) {
        super(envio);
    }
    
    @Override
    public double calcularCoste(){
        return 2.0 + super.calcularCoste();
    }
    
}
