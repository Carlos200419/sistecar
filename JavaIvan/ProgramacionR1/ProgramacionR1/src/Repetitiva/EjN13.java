/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repetitiva;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class EjN13 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int i =1; int cumple = 0; int suma = 0; int nocumple = 0; 
       int estAlt = 0; int pesoAlt = 0; int edadAlt = 0;
       
         System.out.println("Digite el numero de personas: ");
         int n = leer.nextInt();
         
         while (i<=n){
             System.out.println("Digite su edad: ");
            byte edad = leer.nextByte();
            
             System.out.println("Digite su estatura: ");
            int est = leer.nextInt();
            
             System.out.println("Digite su peso: ");
            int peso = leer.nextInt();                                                                                                                                         
            
            
            if (edad<18 && est >=180 && peso<=80){
                cumple ++;   
                suma  = suma + est; 
            }else 
                nocumple ++;
            if (est >estAlt){
             
             estAlt  = est;
             pesoAlt = peso;
             edadAlt = edad;
             
             }  
            i ++;
         }
         if (cumple>0)
             System.out.println("El promedio de estatura que cumplen: " + (suma/cumple));
            else
             System.out.println("No hay promedio");
        System.out.println("Numero de aspirantes que cumple: "+ cumple);
        System.out.println("Numero de aspirantes que no cumple:" + nocumple);
        System.out.println("La estatura mas alta es: "+estAlt+ "el peso de esta persona mas alto: "+ pesoAlt+ "la edad mas alta es: "+ edadAlt);
         
    }
 }


