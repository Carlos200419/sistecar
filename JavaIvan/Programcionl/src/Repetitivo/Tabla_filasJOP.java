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
public class Tabla_filasJOP {
     public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas para la tabla:"));

        int valorA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor inicial para la columna A:"));
        int valorB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor inicial para la columna B:"));
        int valorC = 0;
        int valorD = 0;

        System.out.println("A\tB\tC\tD");

        for (int i = 0; i < N; i++) {
            valorC = valorB + valorC;
            valorD = valorD + valorB;
            System.out.println(valorA + "\t" + valorB + "\t" + valorC + "\t" + valorD);

            valorA++;
            valorB += 2;
        }
    }
}
    
