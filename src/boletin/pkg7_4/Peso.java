/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg7_4;

import javax.swing.JOptionPane;
/**
 *
 * @author slagogonzalez
 */
public class Peso {
    public String pedirNombre1(){
        String nombre1 = JOptionPane.showInputDialog("Teclear nombre primera persona");
        return nombre1;
    }
    public String pedirNombre2(){
        String nombre2 = JOptionPane.showInputDialog("Teclear nombre segunda persona ");
        return nombre2;
    }
    public float setPeso1(){
    float peso1;
    return(Float.parseFloat(JOptionPane.showInputDialog("Teclear peso de la primera persona")));
    }
    public float setPeso2(){
    float peso2;
    return(Float.parseFloat(JOptionPane.showInputDialog("Teclear peso de la segunda persona")));
    }
    public void diferencia(String nombre1,String nombre2,float peso1,float peso2){
        if(peso1>peso2){
            JOptionPane.showMessageDialog(null,"Pesa mas "+nombre1+" la diferencia de peso es de " + (peso1-peso2));
        }
        
    }
}


