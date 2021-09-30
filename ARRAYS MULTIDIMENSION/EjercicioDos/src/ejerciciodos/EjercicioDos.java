/*
 Arreglos Multidimensionales.

Crea un programa que pida por pantalla 2 valores numéricos enteros X e Y. Cree un
primer array de tamaño [X,Y] de tipo entero y almacene en cada posición un valor
entero que deberá ser ingresado por el usuario. 

A continuación cree un segundo array de tamaño [Y,X] y almacene en cada posición un valor entero que deberá ser
ingresado por el usuario. 

Finalmente cree un tercer array de tamaño [X,Y] que será
el resultante de multiplicar cada una de las posiciones de las filas del array uno por
cada una de las posiciones de las columnas del array 2.

Muestre por pantalla cada uno de los arrays con sus valores.

 */
package ejerciciodos;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del array [x] seguido de [y]");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[][] array = new int[x][y];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Ingrese el valor para la posicion i=" + i + "j=" + j);
                array[i][j] = sc.nextInt();
            }
        }

        int[][] array2 = new int[y][x];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.println("Ingrese el valor para la posicion i=" + i + "j=" + j);
                array2[i][j] = sc.nextInt();
            }
        }

        int[][] array3 = new int[x][y];

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                array3[i][j] = array[i][j] * array2[i][j];
            }
        }

        System.out.println(" * ARRAY 1 * ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j]);
            }
        }

        System.out.println(" * ARRAY 2 * ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.println(array2[i][j]);
            }
        }

        System.out.println(" * ARRAY 3 * ");
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                System.out.println(array3[i][j]);
            }
        }

    }

}
