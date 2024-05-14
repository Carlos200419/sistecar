/*
//El gerente de la empresa de transportes “El tacaño” desea saber el valor a pagar por concepto del 
arreglo de uno cualquiera de sus vehículos. El taller “Destroyer” envía a la empresa la factura por cada 
vehículo arreglado, en la cual se encuentra la siguiente información: La placa del vehículo reparado, el tipo 
de daño y el costo del mismo. El gerente ha establecido las siguientes reglas de pago teniendo en cuenta 
el tipo de daño:
Tipo 1. El gerente paga solamente hasta $100.000.
Tipo 2. El gerente paga solamente hasta $300.000.
Tipo 3. El gerente paga solamente hasta $500.000.
Elabore un algoritmo que muestre la placa del vehículo arreglado, el tipo del daño y el valor a pagar.

 */
package Repetitivo;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite la placa del vehículo: ");
            String placa = leer.next();
            System.out.println("Placa del vehículo: " + placa);

            System.out.print("Digite el tipo de daño 1, 2 o 3: ");
            byte tipoDanio = leer.nextByte();
            System.out.println("Tipo de daño: " + tipoDanio);

            double costoReparacion;
            switch (tipoDanio) {
                case 1:
                    costoReparacion = 100000;
                    break;
                case 2:
                    costoReparacion = 300000;
                    break;
                case 3:
                    costoReparacion = 500000;
                    break;
                default:
                    costoReparacion = 0;
                    System.out.println("Tipode daño invalido. No hay costo");
            }
            System.out.println("Total a pagar:$" + costoReparacion);
            System.out.println("¿Quiere ingresar otro vehiculo?(S/N)");
            
            String responder = leer.next().toUpperCase();
            if (!responder.equals("S")){
                continuar = false;
            }
        }
    }
}
      


    

