/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Secuencial;

import java.util.Scanner;

/**
 *
 * @author ivand
 */
public class Ej1 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //declaracion de variables      
        String nombre;
        double horasOrd, horasExt, salPorHora, retencion, salPorHoraExt;
        
        
        //Proceso
       
        System.out.print("Digite salario por hora: ");
        salPorHora = leer.nextFloat();
        System.out.print("Digite horas ordinarias: ");
        horasOrd = leer.nextFloat();
        System.out.print("Digite horas extras diurnas");
        horasExt = leer.nextFloat();        
        salPorHoraExt = (double) (salPorHora + salPorHora*0.4);
        //Salario ordinario resulta de la multiplicacion de salPorHora y horasOrd
        double salOrd = salPorHora * horasOrd;
             
        double salExt = salPorHoraExt;        
              
        retencion = (double) (salExt*0.25);
        
        //Neto
        double salNeto = salOrd + salExt - retencion;
        
         //salida       
         System.out.println("El salario neto a pagar es: " + salNeto);
         System.out.println("Valor de la retencion en el fuente es: " + retencion);                                                                    
       
    }
}


