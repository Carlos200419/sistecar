/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repetitivo;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class sumadebit {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese los números de dos bits
        String inputNum1 = JOptionPane.showInputDialog(null, "Ingrese el primer número de dos bits:");
        String inputNum2 = JOptionPane.showInputDialog(null, "Ingrese el segundo número de dos bits:");

        // Convertir los números ingresados a enteros
        int num1 = Integer.parseInt(inputNum1);
        int num2 = Integer.parseInt(inputNum2);

        // Verificar que los números ingresados estén en el rango de 0 a 3 (números de dos bits)
        if (!validarNumeroDosBits(num1) || !validarNumeroDosBits(num2)) {
            JOptionPane.showMessageDialog(null, "Los números deben ser de dos bits (0-3).");
            return;
        }

        // Realizar la suma de los números utilizando tablas de verdad
        int suma = sumarDosBits(num1, num2);

        // Mostrar los números de entrada y su suma
        JOptionPane.showMessageDialog(null, "Número 1: " + num1 + "\nNúmero 2: " + num2 + "\n\nLa suma es: " + suma);

        // Mostrar la suma en binario y decimal
        JOptionPane.showMessageDialog(null, "La suma en binario es: " + decimalToBinary(suma) +
                                            "\nLa suma en decimal es: " + suma);
    }

    // Método para validar si un número está en el rango de dos bits (0-3)
    public static boolean validarNumeroDosBits(int num) {
        return num >= 0 && num <= 3;
    }

    // Método para sumar dos números de dos bits utilizando tablas de verdad
    public static int sumarDosBits(int num1, int num2) {
        // Calcular la suma utilizando tablas de verdad
        int xorResult = num1 ^ num2; // Suma sin llevar
        int andResult = num1 & num2; // Acarreo
        
        // Calcular la suma con acarreo
        int carry = andResult << 1;
        int suma = xorResult ^ carry;

        return suma;
    }

    // Método para convertir un número decimal a binario
    public static String decimalToBinary(int num) {
        StringBuilder binary = new StringBuilder();

        // Realizar la conversión a binario manualmente
        for (int i = 1 << 1; i > 0; i = i >> 1) {
            binary.append((num & i) == 0 ? "0" : "1");
        }

        return binary.toString();
    }
}
    