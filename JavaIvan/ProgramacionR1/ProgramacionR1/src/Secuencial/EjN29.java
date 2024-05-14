/*
En la ciudad de Cartagena hay N habitantes el 1 de enero. Al finalizar el año (el 31 de diciembre) la 
población ha variado por las siguientes causas:
· El 2% de la población ha emigrado a otras ciudades o municipios.
· Hubo un aumento del 1,8% por inmigraciones.
· Hubo un aumento del 1,7% por nacimientos.
· El 1,1% de la población falleció.
Elabore un algoritmo que basándose en la anterior información calcule e imprima lo siguiente.
a. Aumento promedio mensual de la población (en número de personas).
b. Disminución promedio mensual de la población (en número de personas).
c. Población total de la ciudad al finalizar el año.
 */
package Secuencial;

import java.util.Scanner;

/**
 *
 * @author ivand
 */
public class EjN29 {
    public static void main (String[] args){
        Scanner leer = new Scanner (System.in);
        float N;
        double emigrado, inmigracion, nacimiento, fallesidos;
                
        System.out.println("INFORMACION DE HABITANTES DE CARTAGENA");
        System.out.println("Digite el numero inicial de habitantes");
        N = leer.nextFloat();
        
        //CALCULAR
        emigrado = N *0.2;
        inmigracion = N *0.18;
        nacimiento = N *0.17;
        fallesidos = N *0.11;
        
        //CALCULAR EL AUMENTO Y DESMINIUCION MENSUAL
        double APM = (inmigracion + nacimiento)/ 12;
        double DPM = fallesidos / 12;
        
        //CALCULAR LA POBLACION TOTAL DE LA CIUDAD
        int PF = (int) Math.round ( N + inmigracion + nacimiento - emigrado - fallesidos);
        
        
        System.out.println("Aumento promedio mensual de la población" + APM + "persona");
        System.out.println("Disminución promedio mensual de la población" + DPM + "persona");
        System.out.println("Población total de la ciudad al finalizar el año" + PF + "persona");
        
    }
}
