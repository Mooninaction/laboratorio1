/*
 Arreglos Multidimensionales.

Codifique un programa que solicite un valor entero X mayor o igual a 3 y menor o igual a 10. 
Cree un arreglo de tamaño [X,X] de tipo int.
Posteriormente solicite los valores necesarios para cargar cada una de las celdas de la matriz. 
Muestre por pantalla la matriz resultante.

Al finalizar la carga sume cada una de las columnas del array y asigne los resultados
en una nueva matriz de una dimensión, finalmente sume los valores de esta última
matriz y muestre el resultado por pantalla.


Ejemplo: X=5
3 5 8 88 7
45 34 67 87 54
34 43 23 44 55
6 0 45 4 66
56 44 32 12 54
144 126 175 235 236
Total: 916
 */
package ejerciciotres;

import java.util.Scanner;

public class EjercicioTres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un valor entero X mayor o igual a 3 y menor o igual a 10");
        int x = sc.nextInt();

        int[][] array = new int[x][x];
        int[] vector = new int[x];
        int sum=0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print("Ingrese el valor para la posicion i=" + i + " j=" + j + " : ");
                array[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                vector[i] = vector[i] + array[i][j];
            }
        }
        
        for (int i = 0; i < vector.length; i++) {
            sum = sum + vector[i];
        }

        //muestro array, vector y suma
        System.out.println(" * ARRAY * ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" [" + array[i][j] + "] ");
            }
            System.out.println("\n");
        }
        System.out.println("\n * VECTOR * ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [" +vector[i] + "] ");
        }
        System.out.println("\n Total: " + sum);
    }

}
