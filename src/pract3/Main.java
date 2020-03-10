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
public class Main {
    public static void main(String[] args){        
        Envio carta = new Urgente(new Carta(2.5));
        System.out.println(carta.getPrecio());
        
        
        
    }
}
