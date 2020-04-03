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
public class Fragil extends ServiciosAdicionalesDecorator{
    
    public Fragil(Envio envio) {
        super(envio);
    }
    
    public double getPrecio(){
        return 3 + super.getPrecio();
    }
    
    public String toString(){
        return super.toString() + " Frágil";
    }
}
