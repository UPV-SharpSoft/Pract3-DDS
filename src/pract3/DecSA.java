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
public abstract class DecSA extends Envio{
    private Envio envio;
    
    public DecSA(Envio envio){
        this.envio = envio;
    }
    
    @Override
    public double calcularCoste(){
        return envio.calcularCoste();
    }
}

