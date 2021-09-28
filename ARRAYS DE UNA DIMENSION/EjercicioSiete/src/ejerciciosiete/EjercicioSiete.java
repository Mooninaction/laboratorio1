/*
Trabajo Practico - Ejercicios: (Arreglos unidimensionales)

 7. Escriba una aplicación que solicite y cargue en un arreglo 10 dígitos enteros, 
luego cree dos nuevos arreglos y 
asigne al primero los números ingresados por el usuario de forma ascendente y 
en el segundo de forma descendente. 
Muestre los 2 arreglos por pantalla.
 */
package ejerciciosiete;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EjercicioSiete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer[] vector = new Integer[10];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un numero para la posición " + i);
            vector[i] = sc.nextInt();
        }

        System.out.println("\n" + "El primer vector queda: " + "\n");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [ " + vector[i] + " ] ");
        }
        
        System.out.println("\n" + "El vector ASCENDENTE queda: " + "\n");
        Arrays.sort(vector);
        for (int n : vector) {
            System.out.println(n);
        }

        System.out.println("\n" + "El vector DESCENDENTE queda: " + "\n");
        Arrays.sort(vector, Collections.reverseOrder());
        for (int n : vector) {
            System.out.println(n);
        }
    }

}
