/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

import javax.swing.JOptionPane;

public class SumaNumerosPositivos {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos del vector:"));
        int[] A = new int[N];
        int sumaPositivos = 0;

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + ":"));
            if (A[i] > 0) {
                sumaPositivos += A[i];
            }
        }

        JOptionPane.showMessageDialog(null, "La suma de los números positivos es: " + sumaPositivos);
    }
}

