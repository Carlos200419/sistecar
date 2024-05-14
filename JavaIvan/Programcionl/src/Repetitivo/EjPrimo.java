/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repetitivo;
import javax.swing.JOptionPane;

/**
 * validar un numero digitado es primo
 * @author Estudiantes
 */
public class EjPrimo {
    public static void main(String[] args) {
        
        int number;
        int i;
        byte div;
        
        div = 0;
        //validar que el numero so sea negativo, ni cero
        do{
                number = Integer.parseInt(JOptionpane.showImputDialog(null, "Digite un numero: "));
        }while(number<=0);
     
       //contar los divisores del numero
       for (i =1; i< number; i++){
       //   if(number%i ==0)
       // div +=1
       
       
      // */  = 1;
       while(i<= number){
           div +=1;
           System.out.println("divisor: + i");
       }
        i++;
   // }*/
    
    // por fuer del ciclo valido que div sea 2
    
    if(div==2)
        JOptionpane.showMessageDialog(null, number + "es primo");
       
    else
     JOptionpane.showMessageDialog(null,number + "no es primo");
       }
    }
}
