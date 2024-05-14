/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Elaborar un algoritmo que lea un número y averigüe si el número es par o impar
package Secuencial;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class Practica1 {
    public static void main (String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Digite un numero");
        int numero = leer.nextInt();
        //Determina si el numero es par o impar
        
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
            
                    
        }
    }      
}
