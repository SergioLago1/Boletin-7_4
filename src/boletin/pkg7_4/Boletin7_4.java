/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg7_4;

/**
 *
 * @author slagogonzalez
 */
public class Boletin7_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float peso1,peso2;
        String nombre1,nombre2;
        Peso n = new Peso();
        nombre1=n.pedirNombre1();
        nombre2=n.pedirNombre2();
        peso1=n.setPeso1();
        peso2=n.setPeso2();
        n.diferencia(nombre1,nombre2,peso1, peso2);
    }
    
}