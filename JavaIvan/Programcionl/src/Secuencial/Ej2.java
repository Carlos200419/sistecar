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
public class Ej2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //declaracion de variables       
        double emigra,inmigra,nacim,fallecim;
        //entrada       
        System.out.print("Ingrese la población inicial en Cartagena: ");
        double poblacionIni = leer.nextDouble();      
            // proceso
        emigra = poblacionIni * 0.02;
        inmigra = poblacionIni * 0.018;
        nacim = poblacionIni * 0.017;
        fallecim = poblacionIni * 0.011;
        
        double poblacionFin = poblacionIni + inmigra + nacim - emigra - fallecim;         
        double aumentoPromedioMen = (inmigra + nacim) / 12;
        double disminucionPromedioMen = (emigra + fallecim) / 12;
        
           // salida
        System.out.println("Aumento promedio mensual de la población: " + aumentoPromedioMen);
        System.out.println("Disminución promedio mensual de la población: " + disminucionPromedioMen);
        System.out.println("Población total de la ciudad al finalizar el año: " + poblacionFin);
                 
        
    }
}

