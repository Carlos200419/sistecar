/*
//33. Elabore un algoritmo que calcule el grado de eficiencia de un trabajador cualquiera de una fábrica de 
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
package Selectivo;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class EJ33 {
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);

        System.out.print("Digite nombre del trabajador: ");
        String nombre = leer.nextLine();

        System.out.print("Digite horas ausentes: ");
        double hAusente = leer.nextDouble();

        System.out.print("Digite cantidad de tornillos defectuosos: ");
        int tornillosDefectuosos = leer.nextInt();

        System.out.print("Digite la cantidad de tornillos producidos: ");
        int tornillosProducidos = leer.nextInt();

     /**   char  =g_Eficiencia 5;

        if (hAusente <= 3.5 && tornillosDefectuosos < 300 && tornillosProducidos > 10000) { =g_Eficiencia 20;
        } else 
        if (hAusente <= 3.5 && tornillosDefectuosos < 300) {  =g_Eficiencia 12;
        } else 
        if (hAusente <= 3.5 && tornillosProducidos > 10000) {=g_Eficiencia 13;
        } else 
        if (tornillosDefectuosos < 300 &&  > 10000) {  g_Eficiencia =g_Eficiencia 15;
        } else 
        if (hAusente <= 3.5) { g_Eficiencia = 7;
        } else 
        if (< 300) {  =g_Eficiencia 8;
        } else 
        if (tornillosProducidos > 10000) { =g_Eficiencia 9;
            
        }
*/
        System.out.println("El grado de eficiencia del trabajador " + nombre + " es: " );
    }
}

    

