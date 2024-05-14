/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */
package Selectivo;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class ejercicio10 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos.
        Scanner Scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los datos del vendedor.
        System.out.print("Nombre del vendedor: ");
        String nombreVendedor = Scanner.nextLine();

        System.out.print("Tipo de automóvil (A, B o C): ");
        char tipoAutomovil = Scanner.nextLine().charAt(0);

        System.out.print("Unidades vendidas del automóvil: ");
        int unidadesVendidas = Scanner.nextInt();

        // Definir los precios de venta y porcentajes de comisión por tipo de automóvil.
        double precioVenta = 0.0;
        double porcentajeComision = 0.0;

        switch (tipoAutomovil) {
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
        double comisiones = precioVenta * porcentajeComision * unidadesVendidas;

       // Imprimir el resultado.
        System.out.println("Nombre del vendedor: " + nombreVendedor);
        System.out.println("Tipo de automóvil vendido: " + tipoAutomovil);
        System.out.println("Unidades vendidas: " + unidadesVendidas);
        System.out.println("Comisiones a pagar: $" + comisiones);
        // Cerrar el objeto Scanner.
        Scanner.close();
    }
}






 