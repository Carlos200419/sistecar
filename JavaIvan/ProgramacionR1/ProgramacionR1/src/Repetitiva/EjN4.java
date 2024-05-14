/*
 * Elaborar un algoritmo que lea un número entero positivo y obtenga los 
   múltiplos de 3 comprendidos entre 3 y el número leído
 */
package Repetitiva;

import java.util.Scanner;

/**
 *
 * @author ivand
 */
public class EjN4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite el numero entero: ");
        int num = leer.nextInt();
        
        if (num <=0){
            System.out.println("Digite el numero entero positivo");
        }else{
            System.out.println("Digite los multiplos de 3 en 3 y "+ num + ":");
            int i = 3;
            while (i<= num){
                if (i % 3==0){
                    System.out.println(i);
                    
                }
                i++;
            }          
        }
    }
    
}
