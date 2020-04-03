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
public class Paquete implements Envio{
    double peso;
    
    public Paquete(double peso){
        this.peso = peso;
    }

    @Override
    public double getPrecio() {
        return 0.02 * this.peso;
    }
    
    public String toString(){
        return peso + "g (Paquete)";
    }
    
}
