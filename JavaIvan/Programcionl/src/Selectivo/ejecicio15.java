/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Elaborar un algoritmo que lea el nombre y la edad de una persona. Si la persona puede votar se debe
//imprimir el nombre de la persona y el mensaje ‘Puede votar’, en caso contrario imprimir el nombre, la edad
//y el mensaje ‘No puede votar’.
package Selectivo;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class ejecicio15 {
     public static void main(String[] args) {
         
        Scanner leer = new Scanner (System.in);
        
         System.out.println("Digite su nombre");
         String String = leer.next();
         
         System.out.println("Digite la edad");
         int edad = leer.nextInt();
         
         if (edad>=18){ 
             System.out.println("Puede votar");
         } else {
             System.out.println("No puede");
         }
     }
}
