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
public class ejercicio13 {
    public static void main(String[] args) {
        byte edad;
        int estatura, peso, sumaedad;
        int n, i, ccumple, cnocumple;
        Scanner leer = new Scanner (System.in);
        System.out.print("Digite numero de personas: ");
        n = leer.nextByte();
        
        i=1;
        ccumple = 0;
        cnocumple = 0; 
        sumaedad = 0;
        while(i<=n){
            System.out.println("Digite la edad: ");
            edad = leer.nextByte();
            System.out.println("Digite el peso: ");
            peso = leer.nextInt();
            System.out.println("Digite la estatura: ");
            estatura = leer.nextInt();
            if(edad<18 && estatura>=180 && peso<=80){
                sumaedad = sumaedad + edad; // acumulador
                ccumple++; // contador
            }else cnocumple++;
            
            i++;
        }
        
        System.out.println("# de personas que cumplen: " +ccumple);
        System.out.println("# de personas que no cumplen: " +cnocumple);
        System.out.println("El promedio de edades de los cumple: " +(float)(sumaedad/ccumple));
        
    }
    
}
