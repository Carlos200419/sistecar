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
public class ejercicio12 {
    public static void main(String[] args) {
        int n, o, c;
        byte edad;
        String nombre;
        Scanner leer = new Scanner (System.in);
        System.out.println("Digite numero de personas a entrevistar:");
        n = leer.nextInt();
        
        o = 1;
        c = 0;
        while(o<=n){
            System.out.print("Digita nombre: ");
            nombre = leer.next();
            System.out.print("Digita edad: ");
            edad = leer.nextByte();
            if(edad>=18)
               c = c+1;
            
            o++;
        }
        System.out.println("Los mayores de edad son:" + c);
    }
    
}
