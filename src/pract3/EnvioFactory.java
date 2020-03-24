/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract3;

/**
 *
 * @author Marcos
 */
public class EnvioFactory {
    public Envio crearEnvio(double peso){
        if(peso > 0 && peso <= 100){
            return new Carta(peso);
        }else{
            if(peso > 100 && peso <= 2000){
                return new P(peso);
            }else{
                if(peso > 2000){
                    return new GV(peso);
                }
            }
        }
        return null;
    }
}
