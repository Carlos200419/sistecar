/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//12. Elabore un algoritmo que calcule e imprima la suma, el producto, el cociente y el resto (módulo) entre
//dos números enteros A y B.
package Secuencial;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class EjN12 {
    public static void main(String[] args) {
        
       Scanner leer = new Scanner (System.in);
        
        System.out.println("Digite primer numero");
        int num1 = leer.nextInt();
        
        System.out.println("Digite primer numero");
        int num2 = leer.nextInt();
        
        System.out.println("la suma de los numero es:"+ (num1 + num2));
        System.out.println("la resta de los numero es:"+ (num1 - num2));
        System.out.println("la multiplicacion de los numero es:"+ (num1 * num2));
        System.out.println("la divicion de los numero es:"+ (num1 / num2));
        
               
    }
}
