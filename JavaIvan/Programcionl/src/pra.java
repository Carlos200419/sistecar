/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Estructura;
import javax.swing.JOptionPane;
/**
 *
 * @author Estudiantes
 */
public class pra {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
        String bit1;
        String bit2;
        int num1 = 0;
        int num2 = 0;
        String allResponses = ""; // Variable para almacenar todas las respuestas

        while (true) {
            bit1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero");
            if (bit1.length() == 1 && Character.isDigit(bit1.charAt(0))) {
                num1 = Integer.parseInt(bit1);
                if (num1 <= 3) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "El número debe ser máximo o igual a 3", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese solo un número", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        while (true) {
            bit2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero");
            if (bit2.length() == 1 && Character.isDigit(bit2.charAt(0))) {
                num2 = Integer.parseInt(bit2);
                if (num2 <= 3) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "El número debe ser máximo o igual a 3", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese solo un número", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
         try {
            num1 = Integer.parseInt(bit1);
            num2 = Integer.parseInt(bit2);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error no es un numero","Error",JOptionPane.ERROR_MESSAGE);
        }
        try {
            num1 = Integer.parseInt(bit1);
            num2 = Integer.parseInt(bit2);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error no es un numero","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(num1 > 3 || num2 > 3) {
            JOptionPane.showMessageDialog(null, "Los numeros deben ser maximo o iguales a 3", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            
        int sum = num1 + num2;
    
        // Agregar la respuesta a la variable allResponses
        allResponses = "Los números digidados fueron: " + num1 + " y " + num2 + "\n";
        allResponses += "La suma en decimales es: " + sum + "\n";
        
        try {
            String binarySum = Integer.toBinaryString(sum);
            
            // Agregar la respuesta a la variable allResponses
            allResponses += "La suma en binarios es: " + binarySum + "\n";
            
        } catch (Exception e) {
            allResponses += "Error convirtiendo a binario\n";
        }
        
        // Mostrar todas las respuestas juntas al final
        JOptionPane.showMessageDialog(null, allResponses); 
        
        }
    }
}
