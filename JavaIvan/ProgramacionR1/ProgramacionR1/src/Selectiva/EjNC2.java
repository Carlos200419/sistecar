/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 *En un supermercado se realiza descuento dependiendo del color de un papelito que saque 
el cliente a la hora de pagar el total de la compra, así:
 Si el papelito es de color verde, el descuento del 10% sobre el total de la compra.
Desarrollar un algoritmo que con base a lo anterior calcule el valor del descuento y el total a 
pagar.
 */
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class EjNC2 {
    public static void main (String[] args){
        Scanner leer = new Scanner (System.in);
        float desc, total;
        System.out.println("INFORMACION DE LA COMPRA");
        System.out.println("Digite el valor de la compra");
        float comp = leer.nextFloat();
        
        System.out.println("Digite el color del papelito");
        String color = leer.next();
        
        desc = 0;
        
        if (color.equalsIgnoreCase("verde")){
            desc = (float) (comp *0.1);
            
        }
        total = comp - desc;
        System.out.println("El valor de la compra es:" + comp);
        System.out.println("El valor del descueto es:" + desc);
        System.out.println("El valor total a pagar es:" + total);
        
    }
}
