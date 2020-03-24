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
public class Fragil extends DecSA{
    
    public Fragil(Envio envio) {
        super(envio);
    }
    
    @Override
    public double calcularCoste(){
        return 3.0 + super.calcularCoste();
    }
}
