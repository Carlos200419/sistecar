/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
//Elaborar un algoritmo que lea un número y calcule e imprima su cuadrado si el número es par y su cubo 
//si el número es impar.

 */
package Selectivo;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class EJ1P {
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
