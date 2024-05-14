/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Elaborar un algoritmo que lea un número y calcule e imprima su cuadrado si el número es par y su cubo 
si el número es impar.
 */
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class EjN2 {
    public static void main (String[]args){
        Scanner leer = new Scanner(System.in);
        
        double cubo, cuadrado;
        System.out.println("EJERCICIO N3 DE LOS PROPUESTOS");
        System.out.println("Digite el numero");
        int num = leer.nextInt();
   
      
        if (num % 2 == 0) {
            cuadrado = Math.pow(num, 2);
            System.out.println("El cuadrado de"+ num + "es"+ cuadrado);
            System.out.println("par");
            
        }else{
            cubo = Math.pow(num, 3);
            System.out.println("El cubo de "+ num + "es"+ cubo); 
            System.out.println("impar");
     
        }
    }
}


