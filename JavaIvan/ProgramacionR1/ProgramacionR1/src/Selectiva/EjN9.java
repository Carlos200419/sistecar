/*
 *Elaborar un algoritmo para calcular el monto de las comisiones que recibirá un vendedor del cual se 
tiene su nombre, total unidades vendidas y precio del artículo vendido. El porcentaje de las comisiones es 
el siguiente: si el precio del artículo es de $20.000 la comisión es del 3%, si el precio del artículo es mayor 
de $20.000 pero menor de $50.000 la comisión será del 5%, si el precio del artículo es mayor o igual a 
$50.000 la comisión será del 10%.

*/
package Selectiva;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class EjN9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
    // declaro variablesa
    String nombre;
    float precioA, total; 
    int Uvendidas;
    double comicion;
    
         
        System.out.println("MONTO DE LAS COMICIONES");
        System.out.println("Digite el nomnre del vendedor");
        nombre = leer.next();
        System.out.println("Digite el presio del articulo vendida");
        precioA = leer.nextFloat();
        System.out.println("Digite las unidades vendidas");
        Uvendidas = leer.nextInt();
        
        comicion = 0;
        total = precioA * Uvendidas;
        if (precioA ==20000)
            comicion = total * 0.03;
        if (precioA >20000 && precioA< 50000)
            comicion = total * 0.05;
        if (precioA >=50000)
            comicion = total * 0.1;
        
        System.out.println("la comicion sera"+ nombre + "recibir la comicion de :$"+ comicion );
        
    }
}

