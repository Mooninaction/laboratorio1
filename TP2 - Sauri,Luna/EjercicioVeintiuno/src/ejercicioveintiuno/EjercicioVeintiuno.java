/*
 Codifique un programa que solicite un número entero mayor a cero 
y que mediante recursión sume todos los números números naturales desde el
número ingresado hasta 1.
Ejemplo: Ingreso 10
El programa debe sumar 10 + 9 + 8 +7 +6 + 5 + 4 + 3 + 2 + 1
 */
package ejercicioveintiuno;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioVeintiuno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduce un numero entero >0 ");
            num = sc.nextInt();
        } while (num <= 0);
        System.out.println("Los numeros enteros anteriores a " + num + " son ");
        System.out.println("\n" +" Y la suma de los mismos es de: " + sumaN(num));

    }

    //método recursivo para calcular la suma desde 1 hasta N
    public static double sumaN(int n) {
        if (n == 1) {
            System.out.print(n);

            return 1;
        } else {
            System.out.print(n + " + ");
            return n + sumaN(n - 1);
        }

    }
}
