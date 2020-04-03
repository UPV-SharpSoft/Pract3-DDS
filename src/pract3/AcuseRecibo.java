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
public class AcuseRecibo extends ServiciosAdicionalesDecorator{
    
    public AcuseRecibo(Envio envio) {
        super(envio);
    }
    
    public double getPrecio(){
        return 2.5 + super.getPrecio();
    }
    
    public String toString(){
        return super.toString() + " con acuse de recibo";
    }
    
}
