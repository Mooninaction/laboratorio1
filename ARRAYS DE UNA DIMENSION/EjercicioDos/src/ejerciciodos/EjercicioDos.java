/*
 Trabajo Practico - Ejercicios: (Arreglos unidimensionales)
2. Crea un array o arreglo unidimensional con un tamaño de 5, asignale los valores
numéricos manualmente (los que tú quieras) y muestralos por pantalla. Solicite los
números mediante un bucle.
 */
package ejerciciodos;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vector = new int[5];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor que desee en la posicion " + i);
            vector[i] = sc.nextInt();
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [ " + vector[i] + " ] ");
        }
    }

}
