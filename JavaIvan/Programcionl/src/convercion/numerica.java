/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convercion;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author IvanCastro
 */
public class numerica {
    public static void main(String[] args) {
       String num;
       String solucion = "";
       
       int opcion;
       
       opcion = parseInt(JOptionPane.showInputDialog("Escoja la opcion \n 1.Decimal a Binario \n 2.Binario a Decimal \n 3.Hexadecimal a Decimal"));
       num = JOptionPane.showInputDialog("ingrese el numero");

       switch(opcion){
           case 1 -> {
               try{
                   solucion = Integer.toBinaryString(parseInt(num));
               }catch(NumberFormatException e){
                   JOptionPane.showMessageDialog(null, "El numero no es decimal", "Errado", opcion);
                   System.exit(0);
               }
            }

           case 2 -> {
               try{
                   solucion = String.valueOf(Integer.parseInt(num, 2));                   
               }catch(NumberFormatException e){
                   JOptionPane.showMessageDialog(null, "El numero no es binario", "Errado", opcion);
                   System.exit(0);
               }
            }

           case 3 -> {
               try{
                   solucion = String.valueOf(Integer.parseInt(num,16));
               }catch (NumberFormatException e){
                   JOptionPane.showMessageDialog(null, "El numero no es hexadecimal", "Errado", opcion);
                   System.exit(0); 
               }
            }
          
           default -> {
            }
       }
       JOptionPane.showMessageDialog(null, solucion);
       
    }
}
    

