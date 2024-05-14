/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
//Elaborar un algoritmo que lea un número y calcule e imprima su cuadrado si el número es negativo y su 
//cubo si el número es positivo
 */
package Selectivo;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class EJ3P {
    public static void main(String[] args){
   
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Digite el primer numero");
        int numero1 = leer.nextInt();
        
        System.out.println("Digite el segundo numero");
        int numero2 = leer.nextInt();
        
        if (numero1 %2 >=0){
            double cubo = Math.pow(numero1, 3);
            System.out.println("El cubo de"+ numero1 + "es"+ cubo);
            
             } else {
            // El número es negativo, calcular y mostrar su cuadrado
            double cuadrado = Math.pow(numero2, 2);
            System.out.println("El cuadrado de " + numero2 + " es: " + cuadrado);
            

            
        }
    }
    
}
