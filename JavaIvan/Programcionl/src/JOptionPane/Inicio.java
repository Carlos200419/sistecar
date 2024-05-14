/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JOptionPane;

import javax.swing.JOptionPane;

/**
 *
 * @author ivand
 */
public class Inicio {
     public static void main(String[] args) {
        String cadena;
        char letra;
        int entero;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("digite cadena");
        entero = Integer.parseInt(JOptionPane.showInputDialog("digite un entero"));
        letra = JOptionPane.showInputDialog("digite un caracter").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("digite un decimal"));
        
            JOptionPane.showMessageDialog(null, "La cadena es:"+ cadena);
            JOptionPane.showMessageDialog(null, "el entero es: "+entero);
            JOptionPane.showMessageDialog(null, "el caracter es:"+letra);
            JOptionPane.showMessageDialog(null, "el decimal es:"+decimal);
            
             
    }  
}

