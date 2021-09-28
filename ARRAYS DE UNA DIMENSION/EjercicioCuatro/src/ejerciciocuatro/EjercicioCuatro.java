/*
 Trabajo Practico - Ejercicios: (Arreglos unidimensionales)
4. Escriba una aplicación que:

a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un
arreglo unidimensional.

b) determine y muestre el mayor de los números en el arreglo

c) determine y muestre el menor de los números del arreglo calcule y muestre el rango
(diferencia entre el mayor y el menor) de los elementos en el arreglo
 */
package ejerciciocuatro;

import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vector = new int[20];
        double num = 0;
        double mayor =0;
        double menor =0;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor que desee en la posicion " + i);
            vector[i] = (int) sc.nextDouble();
            
            
            if (num < vector[i] ) {
                mayor = vector[i];
                menor = num;
                num = vector[i];
            }
            if (num > vector[i]){
                mayor = num;
                menor = vector[i];
                
            }
            
            
        }
        System.out.println("\n" + "El vector queda: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [ " + vector[i] + " ] ");
        }
        System.out.println("\n" + " - El mayor de los número es: " + mayor);

        System.out.println("\n" + " - El menor de los número es: " + menor);

        System.out.println("\n" + " - La diferencia entre el mayor y el menor es es: " + (mayor - menor));

    }

}
