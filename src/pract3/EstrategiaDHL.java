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
public class EstrategiaDHL implements EstrategiaEnvio{
    @Override
    public double calcularCoste(char tipo){
        switch(tipo){
            case 'c': 
                return 0.01;
            case 'p':
                return 0.02;
            case 'g': 
                return 0.025;
                
            default:
                return 0.0;
        }
    }
}
