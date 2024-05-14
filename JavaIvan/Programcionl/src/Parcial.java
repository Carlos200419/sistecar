import javax.swing.JOptionPane;

// Author: Santiago Posada Paternina

/*
 * Resolver el siguiente problema: 
 *  En curso desea obtener algunas estadísticas de sus M estudiantes. Por cada estudiante se tiene la siguiente información:

    Código 
    Edad 
    Sexo (1. Masculino, 2. Femenino).

 Almacenar los valores en vectores, es decir, un vector de códigos, un vector de edades y finalmente calcule e imprima:

    Promedio de edad de los estudiantes 
    Cantidad de hombres
    Cantidad de mujeres
 */


public class Parcial{

    public static void main(String args[]) {
        int n;
        int h = 0;
        int m = 0;
        int prom = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes: "));
        int codigo[] = new int[n];
        int edades[] = new int[n];
        int sexo[] = new int[n];


        for(int i = 0; i < codigo.length; i++ ){
            codigo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del estudiante: "));
            edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante: "));
            sexo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sexo del estudiante 1 para Masculino, 2 para femenino: "));
            if(sexo[i] == 1){
                h++;
            } else {
                if(sexo[i] == 2){
                    m++;
                }
            } 
        }

        prom=0;
        for(int j = 0; j < edades.length; j++){
        prom = prom + edades[j];
        }

        prom = prom / n;
        
        

        JOptionPane.showMessageDialog(null, "El promedio de edad fue de: " + prom + ", hay: "+ h + " hombres y hay: " + m + " mujeres");

     

        
    }

}