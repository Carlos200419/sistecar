/*
 //Elabore un algoritmo que muestre la placa del vehículo arreglado, el tipo del daño y el valor a pagar
 * 
 */
package Ej30;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class clase {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Digite la placa del vehículo: ");
        String placa = leer.next();
        
        System.out.print("Digite el tipo de daño (1, 2 o 3): ");
        int tipoDanio = leer.nextByte();
        
        int costoDeuda = 0;
        
        switch (tipoDanio) {
            case 1:
                costoDeuda = 100000;
                break;
            case 2:
                costoDeuda = 300000;
                break;
            case 3:
                costoDeuda = 500000;
                break;
            default:
                System.out.println("Tipo de daño inválido.");
                return;
        }
        
        System.out.println("Placa del vehículo: " + placa);
        System.out.println("Tipo de daño: " + tipoDanio);
        System.out.println("Valor a pagar: $" + costoDeuda);
    }
}

  