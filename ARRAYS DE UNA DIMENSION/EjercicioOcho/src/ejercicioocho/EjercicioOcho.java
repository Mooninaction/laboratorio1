/*
Trabajo Practico - Ejercicios: (Arreglos unidimensionales)

8- Solicite al usuario el ingreso de una cadena de números separadas por guiones medio, por
ejemplo: 45-9-8-6-45-23-21-74-96-32-45-25

Posteriormente aplique el método SPLIT de los String de Java para convertir la cadena en
un arreglo, y calcular la suma total de los elementos y el valor promedio calculado.
 */
package ejercicioocho;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioOcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma=0;
        
        System.out.println("Ingrese una cadena de números separadas por guiones medio" 
                + "\n" + " por ejemplo: 45-9-8-6-45-23-21-74-96-32-45-25");
        String cadena = sc.nextLine();
        
        String numerosArray[] = cadena.split("-");
        
        for(String num : numerosArray){
            int nuevoNum = Integer.parseInt(num);
            System.out.println(nuevoNum);
            suma = suma + nuevoNum;
        }
        
        System.out.println("La suma de los números ingresados es de: " + suma);
        System.out.println("El promedio de los números ingresados es de: " + suma/numerosArray.length);
        
    }
    
}
