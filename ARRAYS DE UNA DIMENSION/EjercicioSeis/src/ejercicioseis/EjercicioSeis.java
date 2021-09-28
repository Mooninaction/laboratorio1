/*
Trabajo Practico - Ejercicios: (Arreglos unidimensionales)

 6. Realice una búsqueda secuencial en un arreglo unidimensional de tamaño 50 generado
aleatoriamente mediante la función java random.

Realice una búsqueda secuencial de la siguiente forma:
- se lee el valor que se desea buscar,
- se compara la primera posición;
- si son iguales,
- fin de la búsqueda.
- De lo contrario, compararlo con la segunda posición, y así sucesivamente.
- Si se llega al final del arreglo y no se encontró el valor, debe indicarlo con un mensaje
apropiado.
- Si se encuentra, se debe especificar la posición que ese valor ocupa en el arreglo por
primera vez.
 */
package ejercicioseis;

import java.util.Scanner;

public class EjercicioSeis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vector = new int[50];

        //LLeno el vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (100) + 1);
        }

        //Recorro el vector
        System.out.println("\n" + "El vector queda: " +"\n" );
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [ " + vector[i] + " ] ");
        }

        System.out.println("\n" +"Ingrese el valor a buscar");
        int dato = sc.nextInt();

        //Busqueda Secuencial
        int posicion = -1;
        for (int i = 0; i < vector.length; i++) {//recorremos todo el arreglo
            if (vector[i] == dato) {//comparamos el elemento en el arreglo con el buscado
                posicion = i;//Si es verdadero guardamos la posicion
                break;//Para el ciclo
            }
        }
        
        if (posicion != -1) {
             System.out.println("Se encontro el valor '" + dato + "' en la posicion " + posicion);
            }else{
            System.out.println("No se encontro el valor" + dato);
        }
    }
}