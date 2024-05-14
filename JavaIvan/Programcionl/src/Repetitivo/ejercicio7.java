/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repetitiva;

import java.util.Scanner;

/**
 *
 * @author Ing. Yeneris Blanco
 */
public class ejercicio7 {
    public static void main(String[] args) {
        int n, i, suma;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Digite el valor de N: ");
        n = leer.nextInt();
        
        i = 1;
        suma = 0; // Acumulador
        while(i<=n){
            suma = suma + i;
            i=i+1;
        }
        System.out.println("La suma es: " + suma);
    }
    
    
}
