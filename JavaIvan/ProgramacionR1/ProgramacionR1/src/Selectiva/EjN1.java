/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Elaborar un algoritmo que lea un número y averigüe si el número es par o impar.
 */
package Selectiva;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class EjN1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        //para leer un numero
        System.out.println("Digite el numero");
        int numero = leer.nextInt();
    
        //para calcular y emprimir su cuadrado
        if (numero%2==0)
            
        // para saber si es par o impar             
        System.out.println("par");
     else
        System.out.println("impar");
        
    }  
}
    
