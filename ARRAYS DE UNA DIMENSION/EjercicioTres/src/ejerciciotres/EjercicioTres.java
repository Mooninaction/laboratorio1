/*
  Trabajo Practico - Ejercicios: (Arreglos unidimensionales)
3. Crea un array o arreglo unidimensional donde tú le indiques el tamaño por teclado y crear
una función que rellene el array o arreglo con los múltiplos de un numero pedido por
teclado. Por ejemplo, si defino un array de tamaño 5 y elijo un 3 en la función, el array
contendrá 3, 6, 9, 12, 15. Muéstralos por pantalla usando otra función distinta.
 */
package ejerciciotres;

import java.util.Scanner;

public class EjercicioTres {

    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int dim = sc.nextInt();
        
        int[] vector = new int[dim];
        
        System.out.println("Ingrese un numero para rellenar el vector con los múltiplos del mismo");
        int num = sc.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = num * (i+1)  ; 
        }
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print( " [ " + vector[i] + " ] ");
        }
    }
    
}
