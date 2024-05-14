/*
 * Para un empleado se tienen los siguientes datos:
· Nombre del empleado.
· Salario básico por hora.
· Horas ordinarias trabajadas.
· Horas extras trabajadas.
elabore un algoritmo que calcule e imprima:
Þ Nombre del empleado.
Þ Salario neto a pagar.
Þ Valor de la retención en la fuente.
Teniendo en cuenta que las horas extras tienen un recargo del 40% y la retención en la fuente (10%) se 
aplica a las horas extras trabajadas, si el total obtenido por este concepto es superior a $100.000.
 */
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class EjN6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double Salariobasico;
        float HOrdinarias, Hextra;
        
        System.out.println("DATOS DEL EMPLEADO");
        System.out.println("Digite su nombre");
        String nombre = leer.next();
        
        System.out.println("Digite su salaio basico*hora");
        Salariobasico = leer.nextDouble();
        
        System.out.println("Digite sus horas ordinarioas");
        HOrdinarias = leer.nextFloat();
        
        System.out.println("Digite sus horas extras");
        Hextra = leer.nextFloat();
        
        double salarioOrdinario = Salariobasico * HOrdinarias;
        double salarioExtra = Salariobasico * 1.4 * Hextra; // Se aplica el recargo del 40% a las horas extras
        double salarioTotal = salarioOrdinario + salarioExtra;

        double retencionFuente = 0;
        if (salarioExtra > 100000) {
            retencionFuente = salarioExtra * 0.1; // Retención del 10% si el total de horas extras supera $100.000
        }

        double salarioNeto = salarioTotal - retencionFuente;

        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Salario neto a pagar: $" + salarioNeto);
        System.out.println("Valor de la retención en la fuente: $" + retencionFuente);

        
        
    }
    
}
