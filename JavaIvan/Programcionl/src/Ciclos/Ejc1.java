/*
 * Leer un numero y mostrar su cuadrado, repetir el proceso 
   hasta que se introduzca un numero negativo
 */
package Ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author ivand
 */
public class Ejc1 {
    public static void main(String[] args) {
        int num, cuadrado;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        
        while (num>=0){
            cuadrado = (int) Math.pow(num, 2);
            
            JOptionPane.showInputDialog(null, "el numero es: " + num + " valor elevado al cuadrado es: " + cuadrado);
            //repetir el proceso hasta que se introduzca un numero negativo 
            num = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero: "));
        }
    }
}
