/*
En la ciudad de Cartagena al comenzar el año hay un número determinado de habitantes, de los 
cuales, al comenzar el año, emigran a otras ciudades el 2%, pero llegan a la ciudad el 0.5% de la población 
del resto del departamento de Bolívar. A la mitad del año la población se ha incrementado en un 5% debido 
a los nacimientos, después de eso no hay más nacimientos. Durante los primeros 10 meses no se muere, 
4
ni matan, a nadie, pero en los dos últimos meses se desata una mortandad tremenda y una violencia de tal 
magnitud, que al llegar el 31 de diciembre, la población se ha reducido en un 8%. 
Un programador experto, como usted, llamó al DANE el 1 de enero y formuló las siguientes preguntas: 
¿Cuántos habitantes hay en Cartagena?, ¿Cuántos habitantes hay en le resto de Bolívar?. El DANE le dio 
la información que solicitó, el programador sacó una calculadora programable, oprimió algunas teclas y dijo 
sonriente: “El 31 de diciembre habrán en Cartagena tantos habitantes”. Elabore el algoritmo que utilizó el 
programador.
 */

package Secuencial;

import java.util.Scanner;

/**
 *
 * @author ivand
 */
public class EjN24 {
     public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
         
         System.out.println("CIFRAS SEGUN EL DANE");
         
         // Población inicial de Cartagena
         System.out.println("digite numero de habitantes de la pablacion");
        int poblacionC = leer.nextInt(); // Puedes establecer cualquier valor inicial aquí
        
        // Paso 1: Calcular cuántos habitantes emigran al comenzar el año
        double emigracion = poblacionC * 0.2;
        
         System.out.println("Numero de habitantes de Bolivar");
        int poblacionBolivar = leer.nextInt(); // Población del resto de Bolívar
        double inmigracion = poblacionBolivar * 0.05;
        
        // Paso 3: Calcular el incremento de población a la mitad del año debido a los nacimientos
        double incrementoPorNacimientos = poblacionC * 0.05;
        
        // Paso 4: Calcular cuántos habitantes se pierden al final del año debido a la reducción del 8%
        double reduccion = poblacionC * 0.8;
        
        // Paso 5: Calcular la población total de Cartagena al final del año
        int poblacionFinalCartagena = (int) Math.round(poblacionC + inmigracion + incrementoPorNacimientos - emigracion - reduccion);
        
        // Paso 6: Calcular la población del resto de Bolívar al final del año
        int poblacionFinalBolivar = poblacionBolivar - (int) Math.round(inmigracion);
        
        // Paso 7: Imprimir los resultados
        System.out.println("Población final de Cartagena al 31 de diciembre: " + poblacionFinalCartagena);
        System.out.println("Población final del resto de Bolívar al 31 de diciembre: " + poblacionFinalBolivar);
    }
}

