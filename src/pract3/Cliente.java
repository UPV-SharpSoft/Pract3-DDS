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
public class Cliente {
    private String nombre;
    private String direccion;
    private String codPostal;
    private int telefono;
    private Envio envio;

    public Cliente(String nombre, String direccion, String codPostal, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.codPostal = codPostal;
        this.telefono = telefono;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    public Envio getEnvio() {
        return envio;
    }

    public String enviar(){
        return "Cliente: " + nombre + ". Direccion: " + direccion + ". "
                + "Código postal: " + codPostal + ". Telefono: " + telefono + ".\n"
                + "Peso paquete: " + envio.peso + ". Dirección de envio: " + envio.dir + ". "
                + "Código postal: " + envio.codPostal + ".\n Coste del envio: " + envio.calcularCoste() + "."
                + " Debe enviarlo en la oficina de " + envio.estrategia.toString() + ".";
    }
}
