/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * En una empresa el aumento de los sueldos para el siguiente año de sus trabajadores, se 
calcula con base al sueldo actual y al tiempo que tienen laborando. 
El porcentaje de aumento se describen en la siguiente tabla:
-Tiempo 
Menos de un 3 año 
-Aumento
5% del sueldo actual
Pedir los datos necesarios para hacer el cálculo del nuevo sueldo. El tiempo se debe pedir 
en mes. Finalmente mostrar el sueldo actual, el nuevo sueldo y el incremento.

 */
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class EjNC3 {
    public static void main (String[]args){
        Scanner leer = new Scanner (System.in);
        float nuevo_sueldo;
        
        System.out.println("Digite el sueldo actual");
        float sueldo = leer.nextFloat();
        
        System.out.println("Digite el tiempo (meses)");
        int meses = leer.nextInt();
        
        float aumento = 0;
        meses = meses/12;
        
        if (meses<3)
            aumento = (float) (sueldo *0.5);
        
        nuevo_sueldo = sueldo + aumento;
        System.out.println("Sueldo actual:"+ sueldo);
        System.out.println("Aumento: "+ aumento);
        System.out.println("Nuevo sueldo: "+ nuevo_sueldo);
    }
}
    
