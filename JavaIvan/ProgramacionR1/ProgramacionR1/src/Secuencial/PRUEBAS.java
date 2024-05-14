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
public class PRUEBAS {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
         System.out.println("EFICIENCIA DEL TRABAJADOR");
        // Solicitar los datos del trabajador
        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese las horas de ausencia: ");
        double horasAusencia = leer.nextDouble();
        System.out.print("Ingrese la cantidad de tornillos defectuosos: ");
        int tornillosDefectuosos = leer.nextInt();
        System.out.print("Ingrese la cantidad de tornillos producidos: ");
        int tornillosProducidos = leer.nextInt();
        
        // Calcular el grado de eficiencia
        int gradoEficiencia = calcularGradoEficiencia(horasAusencia, tornillosDefectuosos, tornillosProducidos);
        
        // Imprimir el resultado
        System.out.println("El grado de eficiencia de " + nombre + " es: " + gradoEficiencia);
        
        leer.close();
    }
    
    // Método para calcular el grado de eficiencia
    public static int calcularGradoEficiencia(double horasAusencia, int tornillosDefectuosos, int tornillosProducidos) {
        // Comprobar las condiciones y asignar el grado de eficiencia correspondiente
        
        if (horasAusencia <= 3.5 && tornillosDefectuosos < 300 && tornillosProducidos > 10000) {
            return 20; // Si cumple las tres condiciones
            
        } else if (horasAusencia <= 3.5 && tornillosDefectuosos < 300) {
            return 12; // Si cumple la primera y segunda condiciones
            
        } else if (horasAusencia <= 3.5 && tornillosProducidos > 10000) {
            return 13; // Si cumple la primera y tercera condiciones
            
        } else if (tornillosDefectuosos < 300 && tornillosProducidos > 10000) {
            return 15; // Si cumple la segunda y tercera condiciones
            
        } else if (horasAusencia <= 3.5) {
            return 7; // Si solo cumple la primera condición
            
        } else if (tornillosDefectuosos < 300) {
            return 8; // Si solo cumple la segunda condición
            
        } else if (tornillosProducidos > 10000) {
            return 9; // Si solo cumple la tercera condición
            
        } else {
            return 5; // Si no cumple ninguna condición
        }
    }
}

