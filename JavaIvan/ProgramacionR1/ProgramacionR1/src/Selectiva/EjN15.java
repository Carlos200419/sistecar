/*
 * Elaborar un algoritmo que lea el nombre y la edad de una persona. Si la persona puede votar se debe 
imprimir el nombre de la persona y el mensaje ‘Puede votar’, en caso contrario imprimir el nombre, la edad 
y el mensaje ‘No puede votar’.
 */
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class EjN15 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
           
       
            System.out.println("Datos de la persona");
            System.out.println("Digite su nombre");
            String nombre = leer.next();
            
            System.out.println("Digite su edad");
            byte edad = leer.nextByte();
            
            if (edad>=18){
                System.out.println("Si Puede votar");
                } else {
                System.out.println("No puede votar");
        }         
    }
}
