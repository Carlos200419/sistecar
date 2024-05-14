/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repetitivo;

import javax.swing.JOptionPane;

/**
 *
 * @author ivand
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        // Solicitamos al usuario que ingrese un número entero positivo
        String input = JOptionPane.showInputDialog("Ingresa un número entero positivo:");
        
        try {
            // Convertimos la entrada a un número entero
            int numero = Integer.parseInt(input);

            // Verificamos si el número ingresado es positivo
            if (numero > 0) {
                StringBuilder divisores = new StringBuilder();
                divisores.append("Los divisores de ").append(numero).append(" son:\n");

                // Utilizamos un bucle for para encontrar los divisores del número
                for (int i = 1; i <= numero; i++) {
                    // Si el residuo de la división es cero, entonces i es un divisor del número
                    if (numero % i == 0) {
                        divisores.append(i).append("\n");
                    }
                }

                // Mostramos los divisores usando JOptionPane
                JOptionPane.showMessageDialog(null, divisores.toString());
            } else {
                JOptionPane.showMessageDialog(null, "El número ingresado no es válido. Debe ser un entero positivo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un número entero válido.");
        }
    }
}

    
    

