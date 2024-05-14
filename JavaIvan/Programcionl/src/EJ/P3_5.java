/*
 *En el pueblo de tangamandapio desea realizar para este año 2024 las vootaciones 
para elegir su alcalde, para cual tiene (4) candidatos, enumerados del 1 al 4. Desarrolla un programa que permite 
cacturar la votacion de N habitantes del pueblo y calcule y muestre:
Numero de votos para el candidato 1
Numero de votos para el candidato 2
Numero de votos para el candidato 3
Imprimir el candidato ganador y el porcentaje de votos obtenidos.
Ademas, implementar:
validacion de candidatos, es decir que solamente se acepten numero del 1 al 3.
JOptionPane.4
 */
package EJ;
import javax.swing.JOptionPane;

/**
 *
 * @author ivand
 */
public class P3_5 {
    public static void main(String[] args) {
        int totalVotos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número total de votantes:"));
        int[] votos = new int[4];

        for (int i = 0; i < totalVotos; i++) {
            int voto = obtenerVoto();
            while (voto == -1) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido de candidato (1 al 4).");
                voto = obtenerVoto();
            }
            votos[voto - 1]++;
        }

        int maxVotos = 0;
        int ganador = 0;
        for (int i = 0; i < votos.length; i++) {
            if (votos[i] > maxVotos) {
                maxVotos = votos[i];
                ganador = i + 1;
            }
        }

        double porcentajeGanador = ((double) maxVotos / totalVotos) * 100;

        JOptionPane.showMessageDialog(null,
                "Resultados de las elecciones:\n"
                + "Candidato 1: " + votos[0] + " votos\n"
                + "Candidato 2: " + votos[1] + " votos\n"
                + "Candidato 3: " + votos[2] + " votos\n"
                + "Candidato 4: " + votos[3] + " votos\n"
                + "El ganador es el Candidato " + ganador + " con un " + porcentajeGanador + "% de los votos.");
    }

    public static int obtenerVoto() {
        int voto;
        try {
            voto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de candidato (1 al 4):"));
            if (voto < 1 || voto > 4) {
                return -1; // Voto inválido
            }
        } catch (NumberFormatException e) {
            return -1; // Voto inválido
        }
        return voto;
    }
}

