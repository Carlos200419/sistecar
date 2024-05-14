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
public class EJ30Repetitivo {
    public static void main(String[] args) {
        
        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de empleados:"));

        double SP = 0;   //salarioPromedio 
        int THE = 0;     //totalHorasExtras 
        double TN = 0;   // totalNomina
        double THEP = 0; //totalHorasExtrasPagadas 
        double TRF = 0;  //totalRetencionFuente

        for (int i = 0; i < N; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
            double salarioBasico = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario básico por hora:"));
            int horasNormales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas normales trabajadas:"));
            int HE = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras trabajadas:"));

            double SN = salarioBasico * horasNormales + (salarioBasico * 1.4 * HE);
            double retencionFuente = 0;

            // Calcula la retención en la fuente si las horas extras superan $100.000
            double VHE = salarioBasico * 1.4 * HE;
            if (VHE > 100000) {
                retencionFuente = VHE * 0.1;
                TRF += retencionFuente;
            }

            // Calcula los totales
            SP += SN;   //salarioNeto
            THE += HE; // horasExtras
            TN += SN;
            THEP += VHE; //valorHorasExtras

            // Muestra los resultados para cada empleado
            JOptionPane.showMessageDialog(null, "Nombre: " + nombre
                    + "\nSalario neto a pagar: " + SN
                    + "\nValor de retención en la fuente: " + retencionFuente);
        }

        SP /= N;

        JOptionPane.showMessageDialog(null, "Salario promedio de los trabajadores: " + SP
                + "\nTotal horas extras laboradas en la empresa: " + THE
                + "\nValor total de la nómina: " + TN
                + "\nTotal a pagar por concepto de horas extras: " + THEP
                + "\nTotal recaudado por retención en la fuente: " + TRF);
    }
}

/*public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de empleados:"));

        for (int i = 0; i < N; i++) {
            String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
            double salarioPorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario básico por hora:"));
            int horasOrdinarias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas ordinarias trabajadas:"));
            int horasExtras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras trabajadas:"));

            // Aquí puedes trabajar con los datos ingresados para cada empleado
            // Puedes realizar cálculos o almacenar la información como lo necesites
            // Por ejemplo, podrías calcular el salario total de cada empleado y mostrarlo
            double salarioTotal = calcularSalarioTotal(salarioPorHora, horasOrdinarias, horasExtras);

            JOptionPane.showMessageDialog(null, "Empleado: " + nombreEmpleado +
                    "\nSalario total: " + salarioTotal);
        }
    }

    // Método para calcular el salario total de un empleado
    public static double calcularSalarioTotal(double salarioPorHora, int horasOrdinarias, int horasExtras) {
        double salarioTotal = salarioPorHora * horasOrdinarias + salarioPorHora * 1.4 * horasExtras;
        return salarioTotal;
    }
}*/
