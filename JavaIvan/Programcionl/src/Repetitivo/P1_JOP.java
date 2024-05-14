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
public class P1_JOP {
    public static void main(String[] args) {
        // Obtener el número total de infracciones en el mes
        String input = JOptionPane.showInputDialog("Ingrese el número total de infracciones en el mes:");
        int totalInfracciones = Integer.parseInt(input);

        // Calcular el número de infracciones en cada período del día
        double infraccionesMatutinas = totalInfracciones * 0.20;
        double infraccionesVespertinas = totalInfracciones * 0.35;
        double infraccionesNocturnas = totalInfracciones * 0.45;

        // Mostrar los resultados usando JOptionPane
        JOptionPane.showMessageDialog(null, "Número de infracciones matutinas: " + (int) infraccionesMatutinas);
        JOptionPane.showMessageDialog(null, "Número de infracciones vespertinas: " + (int) infraccionesVespertinas);
        JOptionPane.showMessageDialog(null, "Número de infracciones nocturnas: " + (int) infraccionesNocturnas);
    }
}
    