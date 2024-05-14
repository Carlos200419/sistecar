/*
//Para un empleado se tienen los siguientes datos:
· Nombre del empleado.
· Salario básico por hora.
· Horas ordinarias trabajadas.
· Horas extras diurnas trabajadas.
· Horas extras nocturnas trabajadas.
· Horas extras dominicales trabajadas.
elabore un algoritmo que calcule e imprima:
Þ Nombre del empleado.
Þ Salario neto a pagar.
Þ Valor de la retención en la fuente.
Teniendo en cuenta que las horas extras tienen los siguientes recargos:
· Horas extras diurnas: 25%.
· Horas extras nocturnas: 50%.
· Horas extras dominicales: 75%.
y que el 10% de retención en la fuente se aplica a las horas extras trabajadas
 */
package Secuencial;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class EjN20 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        double salaribasico, salarioDiurno, salarioNoc, salarioDom, salext, retencion,salneto;
  
        //Datos Pedidos
        System.out.println("INFORMACION ACERCA DEL SALARIO DEL EMPLEADO");
        
        System.out.println("Digite nombre del empleado");
        String nameseller = leer.nextLine();
        
        System.out.println("Digite salario basico por horas");
        float horasT = leer.nextFloat();
        
        System.out.println("Digite salario por horas ordinarias");
        float horasO = leer.nextFloat();
        
        System.out.println("Digite Horas extras diurnas trabajadas");
        float horasED = leer.nextFloat();
        
        System.out.println("Digite Horas extras nocturnas trabajadas");
        float horasEN = leer.nextFloat();
        
        System.out.println("Digite Horas extras dominicales trabajadas");
        float horasEDOM = leer.nextFloat();
        
        //PROCESO
         salaribasico = horasT * horasO;
         salarioDiurno = horasED * horasO * 0.25;
         salarioNoc = horasEN * horasO * 0.50;
         salarioDom = horasEDOM * horasO * 0.75;
        
         salext = salarioDiurno+salarioNoc+salarioDom;
         retencion = (float) salext*0.1;
         salneto = salaribasico + salext - retencion;


//solucion al problema 
System.out.println("Empleado: "+nameseller);
System.out.println("Su salario neto es de "+salneto+"$");
System.out.println("La retencion es de "+retencion+"$");

                
    }
}
