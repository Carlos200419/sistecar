//Elabore un algoritmo que lea dos números e imprima la diferencia entre el primero y 
//el segundo si por lo menos uno es positivo. De lo contrario, imprima su cociente.

package Selectivo;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class ejercicio17 {
  
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner Scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número: ");
        double numero1 = Scanner.nextDouble();

        // Solicitar al usuario que ingrese el segundo número
         System.out.print("Ingrese el segundo número: ");
         double numero2 = Scanner.nextDouble();

        // Verificar si ambos números son diferentes
        if (numero1 > 0 || numero2 > 0) {
            
         double diferencia = numero1 - numero2;
            
         System.out.println("La diferencia entre los números es: "+ diferencia);
        } else {
            if (numero2 != 0){
                double cociente = numero1 / numero2;
                System.out.println("El cociente de los numero es:"+ cociente);
        } else {
         System.out.println("No se puede calcular el cociente porque el segundo número es cero.");
         
            }
        }
   }
}       
           
