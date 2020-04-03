/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract3;

import java.util.Scanner;

/**
 *
 * @author ngnic
 */
public class Main {
    static Scanner sc;
    
    public static void main(String[] args){
        sc = new Scanner(System.in);
        
        Envio envio;
        
        double peso = getDouble("Peso del envio(gramos)");
        envio = EnvioFactory.getEnvio(peso);
        
        if(getBool("Es urgente")){
            envio = new Urgente(envio);
        }
        if(getBool("Tiene acuese de recibo")){
            envio = new AcuseRecibo(envio);
        }
        if(getBool("Es fragil")){
            envio = new Fragil(envio);
        }
        
        double precio = envio.getPrecio();
        System.out.println(envio.toString());
        System.out.println("Precio: " + precio);
    }
    
    private static double getDouble(String mensaje){
        double res;
        System.out.println(mensaje + ":");
        String aux = sc.nextLine();
        try{
            res = Double.valueOf(aux);
        }catch(NumberFormatException e){
            System.out.println("Inválido");
            return getDouble(mensaje);
        }
        return res;
    }
    
    private static boolean getBool(String mensaje){
        System.out.println(mensaje + "?(si/no):");
        String aux = sc.nextLine();
        if(aux.equalsIgnoreCase("si")){
            return true;
        }else if(aux.equalsIgnoreCase("no")){
            return false;
        }else{
            System.out.println("Inválido");
            return getBool(mensaje);
        }
    }
}
