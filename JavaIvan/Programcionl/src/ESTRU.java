/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.HeadlessException;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
/**
 *
 * @author Estudiantes
 */
public class ESTRU {
     public static void main(String[] args) {

       String N = "", number2;
       String solucion = ""; 
       int opcion;

       opcion = parseInt(JOptionPane.showInputDialog("Escoja la opcion que desee realizar \n 1.Decimal a binario \n 2.Binario a decimal \n 3. Hex a Decimal \n 4.Suma decimal a binarios"));
       if (opcion != 4){
           N = JOptionPane.showInputDialog("Por favor ingrese numero");
       }
       switch(opcion){
           case 1 -> {
               try{
                   solucion = Integer.toBinaryString(parseInt(N));
               }catch(NumberFormatException e){
                   JOptionPane.showMessageDialog(null, "El numero no es un decimal", "Error", opcion);
                   System.exit(0);
               }
            }
           case 2 -> {
               try{
                   solucion = String.valueOf(Integer.parseInt(N, 2));                   
               }catch(NumberFormatException e){
                   JOptionPane.showMessageDialog(null, "El numero no es un binario", "Error", opcion);
                   System.exit(0);
               }
            }
           case 3 -> {
              try{
                  solucion = String.valueOf(Integer.parseInt(N,16));
               }catch (NumberFormatException e){
                   JOptionPane.showMessageDialog(null, "El numero no es un hexadecimal", "Error", opcion);
                   System.exit(0); 
               }
            }
           case 4 -> {
                try{

                    N = JOptionPane.showInputDialog("Digite primer numero a sumar");
                    number2 = JOptionPane.showInputDialog("Digite segundo numero a sumar");
                    JOptionPane.showMessageDialog(null, "La suma en decimal es " + (Integer.parseInt(N) + Integer.parseInt(number2)));
                    solucion = (Integer.parseInt(N) + Integer.parseInt(N)) + ""; 
                    solucion = Integer.toBinaryString(parseInt(solucion));
                    JOptionPane.showMessageDialog(null, "La suma en binario es " + solucion);
                }catch(HeadlessException | NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "El numero no es un decimal", "Error", 1);
                    System.exit(0);
                }
           }
           
           default -> {
            }
       }
       if (opcion != 4){
           JOptionPane.showMessageDialog(null, solucion);
       }
    }
}

