/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class XCom {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        // Ingrese el primer número
        while (true) {
            System.out.println("Digite el primer número");
            if (leer.hasNextInt()) {
                num1 = leer.nextInt();
                break; // Sale del bucle si se proporciona un número entero válido
            } else {
                System.out.println("Error: Debes ingresar un número entero válido para el primer número.");
                leer.next(); // Limpia el buffer del scanner
            }
        }

        // Ingrese el segundo número
        while (true) {
            System.out.println("Digite el segundo número");
            if (leer.hasNextInt()) {
                num2 = leer.nextInt();
                break; // Sale del bucle si se proporciona un número entero válido
            } else {
                System.out.println("Error: Debes ingresar un número entero válido para el segundo número.");
                leer.next(); // Limpia el buffer del scanner
            }
        }

        // Realiza la suma de los dos números
        int sumaDecimal = num1 + num2;

        // Convierte el resultado de la suma a binario
        String resultadoBinario = decimalABinario(sumaDecimal);
        System.out.println("ingrese los numeros digitados"+ num1+ "y" + num2);
        // Muestra el resultado en decimal y binario
        System.out.println("El resultado de la suma en decimal es: " + sumaDecimal);
        System.out.println("El resultado de la suma en binario es: " + resultadoBinario);
    }

    public static String decimalABinario(int numero) {
        // Convierte un número decimal a su representación binaria manualmente
        StringBuilder binario = new StringBuilder();
        while (numero >= 3) {
            int residuo = numero % 2;
            binario.insert(0, residuo);
            numero = numero / 2;
        }
        return binario.toString();
    }
}
