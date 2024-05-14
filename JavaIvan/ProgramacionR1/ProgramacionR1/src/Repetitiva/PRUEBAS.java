/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repetitiva;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class PRUEBAS {
        public static void main(String[] args) {
        boolean primo;
        System.out.println("Son números primos del 1 al 100:\n");
        // Estructura for
        for (int num = 2; num <= 100; num++) {
            primo = true;
            for (int i = num - 1; i > 1; i--) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }//fin if
            }//fin for
            if (primo) {
                System.out.println(num + " es primo");
            }//fin if
        }//fin for
        }
}