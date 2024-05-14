/*
//El gerente de la empresa de transportes “El tacaño” desea saber el valor a pagar por concepto del 
arreglo de uno cualquiera de sus vehículos. El taller “Destroyer” envía a la empresa la factura por cada 
vehículo arreglado, en la cual se encuentra la siguiente información: La placa del vehículo reparado, el tipo 
de daño y el costo del mismo. El gerente ha establecido las siguientes reglas de pago teniendo en cuenta 
el tipo de daño:
Tipo 1. El gerente paga solamente hasta $100.000.
Tipo 2. El gerente paga solamente hasta $300.000.
Tipo 3. El gerente paga solamente hasta $500.000.
Elabore un algoritmo que muestre la placa del vehículo arreglado, el tipo del daño y el valor a pagar.
 */
package Repetitivo;

import javax.swing.JOptionPane;

/**
 *
 * @author ivand
 */
public class Calculopago {

    public static void main(String[] args) {
        // Obtiene la información del vehículo y el daño desde JOptionPane
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        int tipoDanio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de daño (1, 2 o 3):"));
        double costoDanio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del daño:"));

        // Calcula el valor a pagar según el tipo de daño
        double valorAPagar = 0;
        switch (tipoDanio) {
            case 1:
                valorAPagar = Math.min(costoDanio, 100000);
                break;
            case 2:
                valorAPagar = Math.min(costoDanio, 300000);
                break;
            case 3:
                valorAPagar = Math.min(costoDanio, 500000);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de daño no válido");
                System.exit(0); // Sale del programa si el tipo de daño no es válido
        }

        // Muestra la placa del vehículo, el tipo de daño y el valor a pagar
        JOptionPane.showMessageDialog(null, "Placa del vehículo: " + placa
                + "\nTipo de daño: " + tipoDanio
                + "\nValor a pagar: " + valorAPagar);
    }
}
