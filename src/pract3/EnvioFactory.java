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
public class EnvioFactory {
    public static Envio getEnvio(double peso){
        if(peso <= 0){ throw new IllegalArgumentException("El peso no puede ser <= 0"); }
        else if(peso > 0 && peso <= 100){
            return new Carta(peso);
        }else if(peso > 100 && peso <= 2000){
            return new Paquete(peso);
        }else{
            return new GranVolumen(peso);
        }
    }
}
