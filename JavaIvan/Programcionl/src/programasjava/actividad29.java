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
public class actividad29 {
    public static void main (String[]args) {
        
        //datos a utilizar
        int n, inmigraciones, emigraciones, nacen, mueren, apm, dpm, pt;
        Scanner leer = new Scanner (System.in);
        
        //pedir dato base
        System.out.print("Digite el numero de habitantes el 1 de enero en Cartagena: ");
        n = leer.nextInt();
        
        
        //calculo de valores
        emigraciones = (int) (n*0.02);
        inmigraciones = (int) (n*0.018);
        nacen = (int) (n*0.017);
        mueren = (int) (n*0.011);
        System.out.println("emigraciones = " + emigraciones);
        System.out.println("inmigraciones = " + inmigraciones);
        System.out.println("nacen = " + nacen);
        System.out.println("mueren = " + mueren);
        
//muestra de resultados: aumento, disminucion y poblacion total
        apm = (int) (inmigraciones + nacen)/12;
        dpm = (int) (emigraciones + mueren)/12;
        pt = (int) (n - emigraciones + inmigraciones + nacen - mueren);
        
        System.out.println("El aumento promedio mensual de la poblacion fue de " + apm + " personas");
        System.out.println("La disminucion promedio mensual de la poblacion fue de " + dpm + " personas");
        System.out.println("La poblacion total al final el año fue de " + pt + " personas");
        
        
        
        
        
        
    }
    
}
