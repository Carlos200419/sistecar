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
public class pr {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
        String bit1;
        String bit2;
        int num1 = 0;
        int num2 = 0;
        String allResponses = ""; 
        int suma;
        
        while ((bit1 = (JOptionPane.showInputDialog(null, "Ingrese el primer numero"))).length() != 1){
            JOptionPane.showMessageDialog(null,"Ingrese solo un numero","Error",JOptionPane.ERROR_MESSAGE);
        }
        while ((bit2 = (JOptionPane.showInputDialog(null, "Ingrese el segundo numero"))).length() != 1){
            JOptionPane.showMessageDialog(null,"Por favor ingrese solo un numero","Error",JOptionPane.ERROR_MESSAGE);
        }

        try {
            num1 = Integer.parseInt(bit1);
            num2 = Integer.parseInt(bit2);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error no es un numero","Error",JOptionPane.ERROR_MESSAGE);
        }
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