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
public abstract class Envio {

    static int id;
    String dir;
    String codPostal;
    double peso;
    EstrategiaEnvio estrategia;

    public abstract double calcularCoste();

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }
    
    public void elegirEstrategia(){
        if(codPostal.startsWith("15")||codPostal.startsWith("36")||codPostal.startsWith("32")||codPostal.startsWith("27")
                ||codPostal.startsWith("33")||codPostal.startsWith("39")||codPostal.startsWith("48")||codPostal.startsWith("20")){
                estrategia = new EstrategiaCorreos();
        }else{
            if(codPostal.startsWith("25")||codPostal.startsWith("08")||codPostal.startsWith("17")||codPostal.startsWith("43")
                    ||codPostal.startsWith("12")||codPostal.startsWith("46")||codPostal.startsWith("03")||codPostal.startsWith("30")){
                estrategia = new EstrategiaDHL();
            }else{
                estrategia = new EstrategiaSEUR();
            }
        }
    }
}
