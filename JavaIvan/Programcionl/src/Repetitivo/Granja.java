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
public class Granja {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad inicial de conejos hembras y machos:"));
        int M = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de meses a simular:"));

        int conejosAdultos = N * 2; // Inicialmente, hay el mismo número de hembras y machos adultos
        int conejosJovenes = 0;
        int conejosBebes = 0;
        
        for (int mes = 1; mes <= M; mes++) {
            int muertes = conejosAdultos / 5; // Cada 10 conejos, mueren 2
            conejosAdultos -= muertes;

            int nuevasHembras = conejosBebes / 2; // La mitad de los bebés son hembras
            conejosAdultos += nuevasHembras;

            conejosBebes = conejosJovenes;
            conejosJovenes = nuevasHembras * 8; // Cada hembra adulta tiene 8 bebés al mes

            // Muestra la población en este mes
            JOptionPane.showMessageDialog(null, "Mes " + mes + ": Adultos - " + conejosAdultos +
                    ", Jóvenes - " + conejosJovenes + ", Bebés - " + conejosBebes);
        }
    }
}


