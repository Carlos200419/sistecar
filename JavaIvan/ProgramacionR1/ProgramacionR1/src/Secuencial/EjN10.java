/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//10. La compañía “La Veloz” vende tres tipos de automóviles (A, B y C), cada uno de los cuales tiene un
//precio de venta y un porcentaje de comisión por venta diferentes. Elaborar un algoritmo que calcule el valor
//de las comisiones que se deben pagar a un determinado vendedor, del cual se tienen los siguientes datos:
//Þ Nombre del vendedor.
//Þ Unidades vendidas del auto A.
//Þ Unidades vendidas del auto B.
//Þ Unidades vendidas del auto C.
package Secuencial;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class EjN10 {
    public static void main(String[] args) {
        
       Scanner leer = new Scanner (System.in);
        
       System.out.print("Nombre del vendedor: ");
        String nombreVendedor = leer.nextLine();
        
        System.out.println("Tipo de automovil (A, B o C):");
        char TAuto = leer.nextLine().charAt(0);

        System.out.print("Unidades vendidas del automóvil: ");
        int UVendidas = leer.nextInt();
        
         // Definir los precios de venta y porcentajes de comisión por tipo de automóvil.
        double precioVenta = 0.0;
        double porcentajeComision = 0.0;

        switch (TAuto) {
            case 'A':
                precioVenta = 20000.0;
                porcentajeComision = 0.10; // 10%
                break;
            case 'B':
                precioVenta = 25000.0;
                porcentajeComision = 0.12; // 12%
                break;
            case 'C':
                precioVenta = 30000.0;
                porcentajeComision = 0.15; // 15%
                break;
            default:
                System.out.println("Tipo de automóvil no válido.");
                return; // Salir del programa si el tipo de automóvil no es válido.
        }

        // Calcular el valor de las comisiones.
        double comisiones = precioVenta * porcentajeComision * UVendidas;

       // Imprimir el resultado.
        System.out.println("Nombre del vendedor: " + nombreVendedor);
        System.out.println("Tipo de automóvil vendido: " + TAuto);
        System.out.println("Unidades vendidas: " + UVendidas);
        System.out.println("Comisiones a pagar: $" + comisiones);
        
        
    }
}
