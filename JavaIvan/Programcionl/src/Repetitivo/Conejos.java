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
public class Conejos {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad inicial de conejos hembras y machos:"));

        int conejosAdultos = N * 2; // Inicialmente, hay el mismo número de hembras y machos adultos
        int conejosJovenes = 0;
        int conejosBebes = 0;
        int meses = 0;

        while (conejosAdultos + conejosJovenes + conejosBebes < 500) {
            int muertes = conejosAdultos / 5; // Cada 10 conejos, mueren 2
            conejosAdultos -= muertes;

            int nuevasHembras = conejosBebes / 2; // La mitad de los bebés son hembras
            conejosAdultos += nuevasHembras;

            conejosBebes = conejosJovenes;
            conejosJovenes = nuevasHembras * 8; // Cada hembra adulta tiene 8 bebés al mes

            meses++;
        }

        JOptionPane.showMessageDialog(null, "Se necesitan " + meses + " meses para alcanzar aproximadamente 500 conejos.");
    }
}
    
