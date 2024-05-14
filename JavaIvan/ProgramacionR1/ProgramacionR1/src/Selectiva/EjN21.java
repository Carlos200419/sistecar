/*
 *Una compañía ha decidido dar a sus mejores empleados una bonificación por su desempeño. Esta 
bonificación se basa en dos criterios: 
-el número de horas extras trabajadas  
-el número de horas que el empleado ha estado ausente del trabajo.

La compañía ha determinado que se use la siguiente fórmula para determinar la bonificación: se restan dos 
tercios de las horas de ausencia a las horas extras trabajadas y se distribuye la bonificación de acuerdo 
con la siguiente tabla:
Resultado Bonificación
> 40 horas $200.000,oo
> 30 horas pero <= 40 horas $150.000,oo
> 20 horas pero <= 30 horas $100.000,oo
> 10 horas pero <= 20 horas $50.000,oo
<= 10 horas $20.000,oo
Elabore un algoritmo que permita determinar la bonificación que recibirá un empleado cualquiera de la
 compañía.
 */
package Selectiva;

import java.util.Scanner;

/**
 *
 * @author ivand
 */
public class EjN21 {
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Calcula la bonificacion del en pleado");

        System.out.println("Digite el numero de Horas Extras");
        int Hextras = leer.nextInt();

        System.out.println("Digite el numero de Hausentes");
        int Hausentes = leer.nextInt();

        double bono = calcularbonificacion(Hextras, Hausentes);
        System.out.println("La bonificacion ´para el empleado es: $" + bono);
    }
        // Calculamos la boni
    public static double calcularbonificacion(int Hextras, int Hausentes) {
        // Restar dos tercios de las horas de ausencia a las horas extras
        double res = Hextras - (2.0 / 3.0) * Hausentes;

        // Determinar la bonificación según la tabla
               if (res > 40) {return 200000.0;
        } else if (res > 30) {return 150000.0;
        } else if (res > 20) {return 100000.0;
        } else if (res > 10) {return 50.000;
        } else {
            return 20000.0;
        }
    }
}
