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
public class ServiciosAdicionalesDecorator implements Envio{
    private Envio envio;
    
    public ServiciosAdicionalesDecorator(Envio envio){
        this.envio = envio;
    }

    @Override
    public double getPrecio() {
        return this.envio.getPrecio();
    }
    
    public String toString(){
        return this.envio.toString();
    }
}
