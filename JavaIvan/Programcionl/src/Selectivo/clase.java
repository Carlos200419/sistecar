/*
 //Elabore un algoritmo que permita determinar la bonificación que recibirá un empleado cualquiera de la
 //compañía.
 */
package Selectivo;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class clase {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el número de horas extendidas trabajadas: ");
        int horasExtendidas = leer.nextInt();

        System.out.print("Ingrese el número de horas que falladas: ");
        int horasAusentadas = leer.nextInt();

        int bonificacion = calcularBonificacion(horasExtendidas, horasAusentadas);

        System.out.println("La bonificación que recibirá el empleado es: $" + bonificacion);
    }

      public static int calcularBonificacion(int horasExtras, int horasAusencia) {
        int bonificacion;
      

        int res = horasAusencia - (2 * horasAusencia /3 );
        
      //> 40 horas $200.000,oo
      //> 30 horas pero <= 40 horas $150.000,oo
      //> 20 horas pero <= 30 horas $100.000,oo
      //> 10 horas pero <= 20 horas $50.000,oo
      //<= 10 horas $20.000,oo
        System.out.print("el resultado es+ bonificacion");
        if (res > 40) {
        
            
            System.out.print("bonificacion = 200000");
        } else if (res> 30) {
            
           System.out.print("bonificacion = 150000");
        } else if (res > 20) {
            
           System.out.print("bonificacion = 100000");
        } else if (res > 10) {
            
           System.out.print("bonificacion = 50000");
        } else {
            
           System.out.print("bonificacion = 20000");
        } 
         return 0;
   }
}
      
