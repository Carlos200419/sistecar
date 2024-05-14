
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ivancastro
 */
public class convercion {

    public class ConversionNumerica {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Elija la conversión que desea realizar:");
            System.out.println("1. Decimal a Binario");
            System.out.println("2. Binario a Hexadecimal");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el número decimal a convertir a binario:");
                    int numeroDecimal = sc.nextInt();
                    String binario = Integer.toBinaryString(numeroDecimal);
                    System.out.println("El número binario es: " + binario);
                    break;
                case 2:
                    System.out.println("Ingrese el número binario a convertir a hexadecimal:");
                    String numeroBinario = sc.next();
                    int decimal = Integer.parseInt(numeroBinario, 2);
                    String hexadecimal = Integer.toHexString(decimal);
                    System.out.println("El número hexadecimal es: " + hexadecimal);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
