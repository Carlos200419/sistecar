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
public class ejerciciolibre {
    
    public static void main (String[]args) {
        
        //declaracion de variables
        byte n;
        Scanner leer = new Scanner (System.in);
        
        
        //pedir variables
        System.out.print("Digite el numero de patas de un animal y se le dara un ejemplo predefinido para tomarlo como referencia, cabe resaltar que las opciones son 2, 4 u 8 patas: ");
        
       n = leer.nextByte();
       
       
       //condicional dependiendo la respuesta del usuario
       if (n == 2) {
           System.out.print("un ejemplo posible puede ser un pato");
       } else if (n == 4) {
           System.out.print("un ejemplo posible puede ser un perro");
       } else if (n == 8) {
           System.out.print("un ejemplo posible puede ser una araña");
       } else {
           System.out.print("animal invalido");
       }
       
       
       
       
        
        
    }
    
}
