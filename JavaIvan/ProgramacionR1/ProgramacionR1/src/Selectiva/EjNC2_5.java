/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Selectiva;

import java.util.Scanner;

/**
 *
 * @author ivand
 */
public class EjNC2_5 {
     public static void main (String[] args ){
      Scanner leer = new Scanner (System.in);
      
        System.out.println("Desarrollar un algoritmo que al digitar dos números imprima la suma si este es positivo o negativo");
        System.out.println("Digite el primer numero");
        int num1 = leer.nextInt();
        
        System.out.println("Digite el segundo numero");
        int num2 = leer.nextInt();
        
        int suma = (num1 + num2);
             System.out.println("el resultado es:"+ suma); 
             
        if (num1>0){
            System.out.println("El numero es positivo");  
        }else if (num1<0){
            System.out.println("El numero es negativo");
        } else{           
         if (num2>0){            
        }else if (num2<0){    
        
            
           }   
        }
    }
}        

