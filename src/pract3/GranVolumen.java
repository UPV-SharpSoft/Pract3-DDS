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
public class GranVolumen implements Envio{
    double peso;
    
    public GranVolumen(double peso){
        this.peso = peso;
    }

    @Override
    public double getPrecio() {
        return 0.025 * peso;
    }
    
    public String toString(){
        return peso + "g (Gran Volumen)";
    }
}
