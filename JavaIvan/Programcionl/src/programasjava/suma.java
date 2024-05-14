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
public class suma {
    public static void main(String[] args) {
       
        float numero1, numero2, suma;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("digite el primer numero a sumar: ");
        numero1 = leer.nextFloat();
        
        System.out.println("digite el segundo numero a sumar: ");
        numero2 = leer.nextFloat();
        
        suma = numero1 + numero2;
        
        System.out.println("el resultado de la suma: " + suma);
        
    
}
}
