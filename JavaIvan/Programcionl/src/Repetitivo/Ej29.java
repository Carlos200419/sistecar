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
public class Ej29 {
    public static void main(String[] args) {
        int numeroPersonas = Integer.parseInt(JOptionPane.showInputDialog("Digite número de personas a registrar:"));

        int HS = 0; // hombres soltero
        int MC = 0; // mujeres casadas
        int TMS = 0; // total mujeres solteras
        int EMS= 0; // edad mujeres solteras
        int HV = 0; // hombres viudos
        int HDM30 = 0; // hombresDivorciadosMenores30
        int MSE20y28 = 0; // mujeresSolterasEntre20y28

        for (int i = 0; i < numeroPersonas; i++) {
            String nombre = JOptionPane.showInputDialog(" nombre:");
            int edad = Integer.parseInt(JOptionPane.showInputDialog(" edad:"));
            int sexo = Integer.parseInt(JOptionPane.showInputDialog(" sexo (1. Masculino, 2. Femenino):"));
            int estadoCivil = Integer.parseInt(JOptionPane.showInputDialog("Digite estado civil (1. Soltero, 2. Casado, 3. Divorciado, 4. Viudo, 5. Otros):"));

            if (sexo == 1) { // Hombre
                if (estadoCivil == 1) { // Soltero
                    HS++;
                } else if (estadoCivil == 4) { // Viudo
                    HV++;
                } else if (estadoCivil == 3 && edad < 30) { // Divorciado y menor de 30 años
                    HDM30++;
                }
            } else if (sexo == 2) { // Mujer
                if (estadoCivil == 2) { // Casada
                    MC++;
                } else if (estadoCivil == 1) { // Soltera
                    TMS++;
                    EMS += edad;
                    if (edad >= 20 && edad <= 28) { // Edades entre 20 y 28 años
                        MSE20y28++;
                    }
                }
            }
        }

        double promedioEdadMujeresSolteras = TMS > 0 ? (double)  EMS / TMS : 0;
        double porcentajeHombresViudos = (double) HV / numeroPersonas * 100;

        JOptionPane.showMessageDialog(null, "Número de hombres solteros: " + HS +
                "\nNúmero de mujeres casadas: " + MC +
                "\nPromedio de edad de las mujeres solteras: " + promedioEdadMujeresSolteras +
                "\nPorcentaje de hombres viudos: " + porcentajeHombresViudos + "%" +
                "\nNúmero de hombres divorciados menores de 30 años: " + HDM30 +
                "\nNúmero de mujeres solteras entre 20 y 28 años: " + MSE20y28);
    }
}
    
