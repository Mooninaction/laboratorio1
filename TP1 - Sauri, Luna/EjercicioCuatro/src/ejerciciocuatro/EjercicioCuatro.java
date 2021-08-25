/*
 Declara 2 variables numéricas (con el valor que desees), 
he indica cual es mayor de los dos. Si son iguales indicarlo también.
 Ves cambiando los valores para comprobar que funciona.
 */
package ejerciciocuatro;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioCuatro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num1 = leer.nextInt();

        System.out.println("Ingrese otro número");
        int num2 = leer.nextInt();

        if (num1==num2){
            System.out.println("Los números ingresados son iguales");
        }else{
            System.out.println("El número mayor es " + Math.max(num1, num2));
        }
    }

}
