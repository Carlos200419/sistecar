/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 *Elaborar un algoritmo que lea dos números y calcule la suma e imprima su cuadrado si el número es par y su cubo 
si el número es impar.
 */
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class EjN2_5 {
    public static void main (String[]args){
        Scanner leer = new Scanner(System.in);
        
        double cubo, cuadrado;
        System.out.println("EJERCICIO N3 DE LOS PROPUESTOS");
        System.out.println("Digite el primer numero");
        int num1 = leer.nextInt();
        
        System.out.println("Digite el segundo numero");
        int num2 = leer.nextInt();
        
        System.out.println("Digite el segundo numero");
        int num3 = leer.nextInt();
        
        int suma = num1 + num2 + num3;
        System.out.println("La suma es:"+ suma);
        
        if (num1 % 2 == 0) {
            cuadrado = Math.pow(num1, 2);
            System.out.println("El cuadrado de " + num1 + " es " + cuadrado);
            System.out.println("El número es par.");
        }else{
            cubo = Math.pow(num1, 3);
            System.out.println("El cubo de"+ num1 + "es"+ cubo);
            System.out.println("El numero es impar.");
        }
        
        if (num2 %2 ==0){
            cuadrado = Math.pow(num2, 2);
            System.out.println("El cuuadrado de"+ num1+"es"+ cuadrado);
            System.out.println("El numero es par.");
        }else{
            cubo = Math.pow(num2, 3);
            System.out.println("El cubo de"+ num2 +"es"+ cubo);
            System.out.println("El numero es impar.");
        }
        if (num3 % 2 ==0){
            cuadrado = Math.pow(num3, 2);
            System.out.println("El cuadrado de"+ num3 + "es"+cuadrado);
            System.out.println("El numero es par");
        } else {
            cubo = Math.pow(num3, 3);
            System.out.println("El cubo de"+ num3+ "es"+ cubo);
            System.out.println("El numero es impar");
        
        }
    }
}
