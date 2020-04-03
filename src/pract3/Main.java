/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract3;

import java.util.Scanner;

/**
 *
 * @author niko
 */
public class Main {
    

    public static void main(String[] args) {
        String nombreCliente, dirCliente, codPostalCliente;
        int telefonoCliente;
        String dirEnvio, codPostalEnvio;
        Double pesoEnvio;
        Cliente cliente;
        Envio envio;
        EnvioFactory factory;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir datos del cliente.");

        System.out.println("Introduce tu nombre:");
        nombreCliente = sc.nextLine();

        System.out.println("Introduce tu dirección:");
        dirCliente = sc.nextLine();

        System.out.println("Introduce tu código postal:");
        codPostalCliente = sc.nextLine();

        System.out.println("Introduce tu teléfono:");
        telefonoCliente = sc.nextInt();
        
        sc.nextLine();

        System.out.println("Introducir datos del envío.");

        System.out.println("Introduce la dirección de destino: ");
        dirEnvio = sc.nextLine();

        System.out.println("Introduce el código postal destino: ");
        codPostalEnvio = sc.nextLine();

        System.out.println("Introduce el peso del envío en gramos: ");
        pesoEnvio = sc.nextDouble();
        
        cliente = new Cliente(nombreCliente, dirCliente, codPostalCliente, telefonoCliente);
        factory = new EnvioFactory();
        envio = factory.crearEnvio(pesoEnvio);
        envio.setCodPostal(codPostalEnvio);
        envio.setDir(dirEnvio);
        cliente.setEnvio(envio);
        System.out.println(envio.calcularCoste());
        Envio envio2 = new Fragil(envio);
        System.out.println(envio2.calcularCoste());

    }
}
