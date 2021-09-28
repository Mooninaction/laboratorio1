/*
Trabajo Practico - Ejercicios: (Arreglos unidimensionales)

Dado 2 array de enteros, el primero de tamaño 5 y el segundo de tamaño 10, 
pedir los valores numéricos enteros para cargar cada uno de los arreglos, 
cree un tercer arreglo de tamaño 5 
    que contenga en cada posición la suma de la multiplicación
         de cada elemento del array uno, por cada elemento del array 2

ARRAY3= (posición 0 del arreglo 1 * posición 0 del arreglo 2) 
+ (posición 0 del arreglo 1 * posición 1 del arreglo 2) 
+ (posición 0 del arreglo 1 * posición 2 del arreglo 2) 
+ .............
+ (posición 4 del arreglo 1 * posición 9 del arreglo 2)

Use 2 estructuras iterativas anidadas para realizar el cálculo y asignación de los valores en el 3 array.

*/
package ejerciciodiez;

import java.util.Scanner;

public class EjercicioDiez {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] vector1 = new int[5];
        int[] vector2 = new int[10];
        int[] vector3 = new int[5];
        
        //lleno vectores
        System.out.println("* LLENO VECTOR 1 *");
         for (int i = 0; i < vector1.length; i++) {
             System.out.print(" [ " + i + " ] = ");
            vector1[i] = sc.nextInt(); 
        }
         System.out.println("* LLENO VECTOR 2 *");
         for (int i = 0; i < vector2.length; i++) {
             System.out.print(" [ " + i + " ] = ");
            vector2[i] = sc.nextInt(); 
        }
          for (int i = 0; i < vector3.length; i++) {
            vector3[i] = vector1[i]*vector2[i]; 
        }
        //muestro vectores
        System.out.println("\n* VECTOR 1 *\n");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print( " [ " + vector1[i] + " ] ");
        }
        System.out.println("\n* VECTOR 2 *\n");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print( " [ " + vector2[i] + " ] ");
        }
        System.out.println("\n* VECTOR 3 *\n");
        for (int i = 0; i < vector3.length; i++) {
            System.out.print( " [ " + vector3[i] + " ] ");
        }
    }
    
}
