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
public class Ejercicio6 {
    public static void main(String[] args) {
        // Solicitamos al usuario que ingrese la cantidad de números primos que desea encontrar
        String input = JOptionPane.showInputDialog("Ingrese la cantidad de números primos que desea encontrar:");
        
        try {
            int n = Integer.parseInt(input);
            StringBuilder primos = new StringBuilder();

            int count = 0; // Contador para llevar la cuenta de cuántos números primos se han encontrado
            int num = 2; // Comenzamos con el primer número primo, que es 2

            // Iteramos hasta encontrar los primeros N números primos
            while (count < n) {
                if (esPrimo(num)) { // Verificamos si el número actual es primo
                    primos.append(num).append(" ");
                    count++;
                }
                num++; // Pasamos al siguiente número
            }

            // Mostramos los números primos encontrados usando JOptionPane
            JOptionPane.showMessageDialog(null, "Los primeros " + n + " números primos son:\n" + primos.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero válido.");
        }
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // 1 y números negativos no son primos
        }
        // Iteramos desde 2 hasta la raíz cuadrada del número para verificar si tiene divisores
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si el número es divisible por algún otro número, no es primo
            }
        }
        return true; // Si no se encontraron divisores, el número es primo
    }
}
  
