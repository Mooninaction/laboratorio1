/*
    Lee un número por teclado e indica si es divisible entre 2 (resto = 0)
    Si no lo es, también debemos indicarlo.
 */
package ejerciciocincotp;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioCincoTP {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número a determinar si es par o no ");
        int num = leer.nextInt();
                   
        if (num%2==0 && num!=0) {
            System.out.println("El número es par");
        }else{
            System.out.println("El número no es par");
        }
    }
    
}
