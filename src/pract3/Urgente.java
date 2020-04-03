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
public class Urgente extends ServiciosAdicionalesDecorator {

    public Urgente(Envio envio) {
        super(envio);
    }

    public double getPrecio() {
        return 2 + super.getPrecio();
    }
    
    public String toString(){
        return super.toString() + " Urgente";
    }
}
