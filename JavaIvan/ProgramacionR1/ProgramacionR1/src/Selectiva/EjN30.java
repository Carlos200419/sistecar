/*
 * El gerente de la empresa de transportes “El tacaño” desea saber el valor a pagar por concepto del 
arreglo de uno cualquiera de sus vehículos. El taller “Destroyer” envía a la empresa la factura por cada 
vehículo arreglado, en la cual se encuentra la siguiente información: La placa del vehículo reparado, el tipo 
de daño y el costo del mismo. El gerente ha establecido las siguientes reglas de pago teniendo en cuenta 
el tipo de daño:
Tipo 1. El gerente paga solamente hasta $100.000.
Tipo 2. El gerente paga solamente hasta $300.000.
Tipo 3. El gerente paga solamente hasta $500.000.
Elabore un algoritmo que muestre la placa del vehículo arreglado, el tipo del daño y el valor a pagar.
 */
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class EjN30 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Digite la placa del vehículo: ");
        String placa = leer.next();

        System.out.print("Digite el tipo de daño (1, 2 o 3): ");
        byte TD = leer.nextByte();
        
        System.out.println("Ingrese el costo de la factura");
        int CF = leer.nextInt();
        
        int costo = 0;   
                
  
                           
        if (TD==1)
        costo = CF- 100000;
        else
        if (TD==2)
        costo = CF- 300000;
        else
        if (TD==3)
        costo = CF- 500000;
        
        System.out.println("Placa del vehículo: " + placa);
        System.out.println("Tipo de daño: " + TD);
        System.out.println("Valor a pagar: $" + costo);
    }
}


        


         
         
