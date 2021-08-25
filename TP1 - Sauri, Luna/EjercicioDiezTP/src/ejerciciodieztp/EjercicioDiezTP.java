/*
 Lee un número por teclado y 
comprueba que este número es mayor o igual que cero,
si no lo es lo volverá a pedir (do while),
después muestra ese número por consola.
 */
package ejerciciodieztp;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioDiezTP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5;
        
        do{
        System.out.println("Ingrese un número");
        num = sc.nextInt();
        }while(num<=0);
        
        System.out.println("El número es: " + num);
    }
    
}
