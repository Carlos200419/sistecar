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
public class EJ18_JOP {
     public static void main(String[] args) {
        // Variables para el cálculo del inventario
        int precioTotalInventario = 0;

        // Bucle para ingresar información de cada libro hasta que el usuario decida terminar
        boolean continuar = true;
        while (continuar) {
            // Obtener información del libro: código, tipo y número de páginas
            String codigoLibro = JOptionPane.showInputDialog("Ingrese el código del libro:");
            int tipoLibro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de libro (1, 2, 3, u otro):"));
            int numeroPaginas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de páginas del libro:"));

            // Calcular el precio del libro según el tipo
            int precioLibro = 0;
            switch (tipoLibro) {
                case 1:
                    precioLibro = 10000 + (50 * numeroPaginas);
                    break;
                case 2:
                    precioLibro = 15000 + (70 * numeroPaginas);
                    break;
                case 3:
                    precioLibro = 20000 + (90 * numeroPaginas);
                    break;
                default:
                    precioLibro = 25000 + (120 * numeroPaginas);
                    break;
            }

            // Mostrar el precio del libro
            JOptionPane.showMessageDialog(null, "El precio del libro con código " + codigoLibro + " es: $" + precioLibro);

            // Sumar al precio total del inventario
            precioTotalInventario += precioLibro;

            // Preguntar al usuario si desea ingresar otro libro
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro libro?", "Continuar", JOptionPane.YES_NO_OPTION);
            continuar = opcion == JOptionPane.YES_OPTION;
        }

        // Mostrar el valor total del inventario
        JOptionPane.showMessageDialog(null, "El valor total del inventario es: $" + precioTotalInventario);
    }
}
    
