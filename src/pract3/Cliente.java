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

    public Cliente(String nombre, String direccion, String codPostal, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.codPostal = codPostal;
        this.telefono = telefono;
    }

    public String enviar(){
        return "Cliente: " + nombre + ". Direccion: " + direccion + ". "
                + "Código postal: " + codPostal + ". Telefono: " + telefono + ".\n";
    }
}
