/*
 * En el pueblo de tangamandapio desea realizar para este año 2024 las vootaciones 
para elegir su alcalde, para cual tiene (4) candidatos, enumerados del 1 al 4. Desarrolla un programa que permite 
cacturar la votacion de N habitantes del pueblo y calcule y muestre:
Numero de votos para el candidato 1
Numero de votos para el candidato 2
Numero de votos para el candidato 3
Imprimir el candidato ganador y el porcentaje de votos obtenidos.
Ademas, implementar:
validacion de candidatos, es decir que solamente se acepten numero del 1 al 3.
JOptionPane.

 */
package EJ;
import java.util.Scanner;
/**
 *
 * @author ivand
 */
public class P3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Inicializar contadores de votos para cada candidato
        int[] votos = new int[4];

        // Obtener el número de votantes
        System.out.print("Ingrese el número de votantes: ");
        int numVotantes = leer.nextInt();

        // Capturar votos y validar candidatos
        for (int i = 0; i < numVotantes; i++) {
            int voto;
            do {
                System.out.print("Votante " + (i + 1) + ": ");
                voto = leer.nextInt();
                if (voto < 1 || voto > 4) {
                    System.out.println("Número de candidato inválido. Por favor, ingrese un número entre 1 y 4.");
                }
            } while (voto < 1 || voto > 4);
            votos[voto - 1]++;
        }

        // Calcular el total de votos
        int totalVotos = 0;
        for (int v : votos) {
            totalVotos += v;
        }

        // Calcular porcentaje de votos para cada candidato
        double[] porcentajes = new double[4];
        for (int i = 0; i < 4; i++) {
            porcentajes[i] = (double) votos[i] / totalVotos * 100;
        }

        // Encontrar al ganador
        int ganador = 0;
        for (int i = 1; i < 4; i++) {
            if (votos[i] > votos[ganador]) {
                ganador = i;
            }
        }

        // Imprimir resultados
        System.out.println("Votos para el candidato 1: " + votos[0]);
        System.out.println("Votos para el candidato 2: " + votos[1]);
        System.out.println("Votos para el candidato 3: " + votos[2]);
        System.out.println("Votos para el candidato 4: " + votos[3]);
        System.out.println("Ganador: Candidato " + (ganador + 1) + " con " + porcentajes[ganador] + "% de los votos.");
    }
}
    
