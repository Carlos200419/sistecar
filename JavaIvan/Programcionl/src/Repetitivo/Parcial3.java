/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repetitivo;
import java.util.Scanner;


/**
 *
 * @author ivand
 */
public class Parcial3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Inicializar contadores de votos para cada candidato
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;

        // Pedir el número de habitantes que van a votar
        System.out.print("Digite el numero de habitantes que van a votar:  ");
        int numHabitantes = leer.nextInt();

        // Validar que el número de habitantes sea positivo
        if (numHabitantes <= 0) {
            System.out.println("El numero de habitantes debe ser positivo.");
            
        }

        // Capturar los votos de los habitantes
        for (int i = 1; i <= numHabitantes; i++) {
            System.out.println("Habitante #" + i + ":");
            System.out.print("Digite el numero del candidato por el que desea votar (1-4):  ");
            int voto = leer.nextInt();

            // Validar que el voto esté en el rango permitido (1-4)
            if (voto < 1 || voto > 4) {
                System.out.println("Voto invalido. Debe ser un numero entre 1 y 4.");
                i--; // Restar 1 a i para repetir la iteracion y permitir que el habitante vote de nuevo
                
            }

            // Incrementar el contador de votos del candidato correspondiente
            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                case 4:
                    votosCandidato4++;
                    break;
            }
        }

        // Calcular el total de votos
        int totalVotos = votosCandidato1 + votosCandidato2 + votosCandidato3 + votosCandidato4;

        // Calcular el porcentaje de votos para cada candidato
        double porcentajeCandidato1 = (double) votosCandidato1 / totalVotos * 100;
        double porcentajeCandidato2 = (double) votosCandidato2 / totalVotos * 100;
        double porcentajeCandidato3 = (double) votosCandidato3 / totalVotos * 100;
        double porcentajeCandidato4 = (double) votosCandidato4 / totalVotos * 100;

        // Encontrar al candidato ganador
        int maxVotos = Math.max(Math.max(votosCandidato1, votosCandidato2), Math.max(votosCandidato3, votosCandidato4));
        String candidatoGanador = "";
        if (maxVotos == votosCandidato1) {
            candidatoGanador = "Candidato 1";
        } else if (maxVotos == votosCandidato2) {
            candidatoGanador = "Candidato 2";
        } else if (maxVotos == votosCandidato3) {
            candidatoGanador = "Candidato 3";
        } else {
            candidatoGanador = "Candidato 4";
        }

        // Mostrar los resultados
        System.out.println("\nResultados de las elecciones:");
        System.out.println("Votos del Candidato 1: " + votosCandidato1 + " (" + porcentajeCandidato1 + "%)");
        System.out.println("Votos del Candidato 2: " + votosCandidato2 + " (" + porcentajeCandidato2 + "%)");
        System.out.println("Votos del Candidato 3: " + votosCandidato3 + " (" + porcentajeCandidato3 + "%)");
        System.out.println("Votos del Candidato 4: " + votosCandidato4 + " (" + porcentajeCandidato4 + "%)");
        System.out.println("El candidato ganador es: " + candidatoGanador + " con " + maxVotos + " votos.");
    }  
}
