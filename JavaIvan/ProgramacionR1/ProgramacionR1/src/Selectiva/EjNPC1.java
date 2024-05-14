/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Desarrollar un algoritmo que al digitar un número imprima si este es positivo o negativo.
 */
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class EjNPC1 {
    public static void main (String[] args ){
      Scanner leer = new Scanner (System.in);
      
        System.out.println("Desarrollar un algoritmo que al digitar un número imprima si este es positivo o negativo");
        System.out.println("Digite el numero");
        int num = leer.nextInt();
        
        if (num>0){
            System.out.println("El numero es positivo");  
        }else if (num<0){
            System.out.println("El numero es negativo");
        } else{ 

        }  
    } 
}

