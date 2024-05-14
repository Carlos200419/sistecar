/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.estructura.reto1;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class Reto1 {
    public static void main(String[] args) {
        
        String bit1;
        String bit2;
        int number1 = 0;
        int number2 = 0;

        while ((bit1 = (JOptionPane.showInputDialog(null, "Por favor ingrese el numero 1"))).length() != 1){
            JOptionPane.showMessageDialog(null,"Por favor ingrese solo un numero","Error",JOptionPane.ERROR_MESSAGE);
        }
        while ((bit2 = (JOptionPane.showInputDialog(null, "Por favor ingrese el numero 2"))).length() != 1){
            JOptionPane.showMessageDialog(null,"Por favor ingrese solo un numero","Error",JOptionPane.ERROR_MESSAGE);
        }

        try {
            number1 = Integer.parseInt(bit1);
            number2 = Integer.parseInt(bit2);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error no es un numero","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(number1 > 3 || number2 > 3) {
            JOptionPane.showMessageDialog(null, "Los numeros deben ser maximo 3", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "La suma de los decimales es " + (number1 + number2));
            try {
                JOptionPane.showMessageDialog(null, "La suma de los binarios es " + Integer.toBinaryString( number1 + number2 ));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error convertiendo a binarios","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
