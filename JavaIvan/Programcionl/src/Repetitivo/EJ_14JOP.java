/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repetitivo;
import javax.swing.JOptionPane;
/**
 *
 * @author ivand
 */
public class EJ_14JOP {

        public static void main(String[] args) {
            // Solicitar el número de ventas realizadas por el vendedor
            String inputVentas = JOptionPane.showInputDialog("Ingrese el número de ventas realizadas por el vendedor:");
            int numeroVentas = Integer.parseInt(inputVentas);

            double comisionTotal = 0;

            // Calcular la comisión para cada venta
            for (int i = 0; i < numeroVentas; i++) {
                // Obtener el precio del artículo vendido
                String inputPrecio = JOptionPane.showInputDialog("Ingrese el precio del artículo " + (i + 1) + ":");
                double precioArticulo = Double.parseDouble(inputPrecio);

                // Calcular la comisión según el precio del artículo
                double comision = 0;
                if (precioArticulo < 10000) {
                    comision = precioArticulo * 0.05; // 5% de comisión para artículos < $10,000
                } else {
                    comision = precioArticulo * 0.075; // 7.5% de comisión para artículos >= $10,000
                }

                // Agregar la comisión de esta venta a la comisión total
                comisionTotal += comision;
            }

            // Mostrar la comisión total al vendedor
            JOptionPane.showMessageDialog(null, "La comisión total del vendedor es: $" + comisionTotal);
        }
}

