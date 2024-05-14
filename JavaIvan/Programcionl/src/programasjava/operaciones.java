/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programasjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class operaciones {
    public static void main(String[] args){
        
        float a, b, suma, resta, multiplicacion, division;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("digite dos numeros: ");
        a = leer.nextFloat();
        b = leer.nextFloat();
        
        suma = a + b;
        resta = a - b;
        multiplicacion = a * b;
        division = a / b;
        
        System.out.println("el resultado de la suma es: " + suma);
        System.out.println("el resultado de la resta es: " + resta);
        System.out.println("el resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("el resultado de la division es: " + division);
    }
    
}
