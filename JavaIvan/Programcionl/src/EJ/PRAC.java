/*
 //Pedir una vocal e imprima un nombre que empiece por una vocal
 */
package EJ;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class PRAC {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
       System.out.print("Ingrese una vocal: ");
        char vocal = leer.next().charAt(0);

        String nombre = "";

        switch (vocal) {
            case 'a':
                nombre = "Ana";
                break;
            case 'e':
                nombre = "Elena";
                break;
            case 'i':
                nombre = "Isabel";
                break;
            case 'o':
                nombre = "Olivia";
                break;
            case 'u':
                nombre = "Ursula";
                break;
            default:
                System.out.println("La vocal ingresada no es válida.");
        }

        if (!nombre.isEmpty()) {
            System.out.println("El nombre que empieza con la vocal " + vocal + " es: " + nombre);
        }
     }
}



