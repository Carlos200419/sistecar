/*
Elabore un algoritmo que calcule el grado de eficiencia de un trabajador cualquiera de una fábrica de 
tornillos, del cual se tienen los siguientes datos:
· Nombre del trabajador.
· Horas ausencia.
· Tornillos defectuosos.
· Tornillos producidos.
Para el cálculo del grado de eficiencia se tendrán en cuenta las siguientes condiciones: 
1. Ausencia al trabajo <= 3,5 horas
2. Tornillos defectuosos < 300
3. Tornillos producidos > 10.000
Los grados de eficiencia se asignan de la siguiente manera:
· Si no cumple ninguna condición: Grado = 5.
· Si solo cumple la primera condición: Grado = 7.
· Si solo cumple la segunda condición: Grado = 8.
· Si solo cumple la tercera condición: Grado = 9.
· Si cumple la primera y segunda condiciones: Grado = 12.
· Si cumple la primera y tercera condiciones: Grado = 13.
· Si cumple la segunda y tercera condiciones: Grado = 15.
· Si cumple las tres condiciones: Grado = 20.
 */
package Secuencial;

import java.util.Scanner;

/**
 *
 * @author ivand
 */
public class EjN33 {
    public static void main (String[] args){
        Scanner leer = new Scanner (System.in);
        
        System.out.println("GRADO DE EFICIENCIA DEL TRABAJADOR");
        
        System.out.println("Digite Nombre del trabajador");
        String nombre = leer.nextLine();
        
        System.out.println("Digite Horas ausentes");
        double Hausente = leer.nextDouble();
        
        System.out.println("Digite Tornillos defectuosos");
        int Tdefectuosos = leer.nextInt();
        
        System.out.println("Tornillos producidos");
        int Tproducidos = leer.nextInt();
        
        
        //cálculo del grado de eficiencia
        int GradoEf = calcularGradoEf (Hausente, Tdefectuosos, Tproducidos);
        
        //imprimimos resultado
        System.out.println("El grado de eficiencia de" + nombre + "es" + GradoEf);
        
     leer.close();
    }
    
    // Método para calcular el grado de eficiencia
    public static int calcularGradoEf (double Hausente, int Tdefectuosos, int Tproducidos) {
    // Comprobar las condiciones y asignar el grado de eficiencia correspondiente
        
        if (Hausente <= 3.5 && Tdefectuosos < 300 && Tproducidos > 10000) {
            return 20; // Si cumple las tres condiciones
            
        } else if (Hausente <= 3.5 && Tdefectuosos < 300) {
            return 12; // Si cumple la primera y segunda condiciones
            
        } else if (Hausente <= 3.5 && Tproducidos > 10000) {
            return 13; // Si cumple la primera y tercera condiciones
            
        } else if (Tdefectuosos < 300 && Tproducidos > 10000) {
            return 15; // Si cumple la segunda y tercera condiciones
            
        } else if (Hausente <= 3.5) {
            return 7; // Si solo cumple la primera condición
            
        } else if (Tdefectuosos < 300) {
            return 8; // Si solo cumple la segunda condición
            
        } else if (Tproducidos > 10000) {
            return 9; // Si solo cumple la tercera condición
            
        } else {
            return 5; // Si no cumple ninguna condición
        }
    }
}

   
      
   
    
