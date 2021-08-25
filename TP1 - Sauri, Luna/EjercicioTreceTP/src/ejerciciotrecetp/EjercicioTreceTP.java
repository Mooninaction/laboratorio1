/*
Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel
solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible
entre 5, sin embargo, 17 si es primo. Un buen truco para calcular la raíz cuadrada del numero e
ir comprobando que si es divisible desde ese número hasta 1.
NOTA: Si se introduce un número menor o igual que 1, directamente es no primo.

 */
package ejerciciotrecetp;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioTreceTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el numero:");
        int numero = sc.nextInt();
        
        boolean resp = resultado(numero);
        
        if (resp == true) {
            System.out.println("Es Primo");
        } else {
            System.out.println("No es Primo");
        }
    }
    private static boolean resultado(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        return (contador == 2);
    }

}
