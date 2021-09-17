/*
 - Desarrolle un programa que ayude a una cajera a determinar el número de
billetes y monedas que se necesitan de cada una de las siguientes
denominaciones 200, 100, 50, 20, 10, 5, 2 y 1, y monedas de 0.50, 0.25, 0.10 y
0.05 centavos para una cantidad de dinero dada. 

Ejemplo si la cantidad es 1390,55 se necesitan
6 billetes de 200, 
1 billete de 100,
1 billete de 50, 
2 billetes de 20, 
1 moneda de 0.50 
y una moneda de 0.05 centavos. 
 */
package ejerciciocuatro;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioCuatro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de dinero");
        double dinero = sc.nextDouble();

        int doscientos = ((int) dinero - ((int) dinero % 200)) / 200;
        dinero = dinero % 200;

        int cien = ((int) dinero - ((int) dinero % 100)) / 100;
        dinero = dinero % 100;

        int cincuenta = ((int) dinero - ((int) dinero % 50)) / 50;
        dinero = dinero % 50;

        int veinte = ((int) dinero - ((int) dinero % 20)) / 20;
        dinero = dinero % 20;

        int diez = ((int) dinero - ((int) dinero % 10)) / 10;
        dinero = dinero % 10;

        int cinco = ((int) dinero - ((int) dinero % 5)) / 5;
        dinero = dinero % 5;

        int dos = ((int) dinero - ((int) dinero % 2)) / 2;
        dinero = dinero % 2;

        int uno = ((int) dinero - ((int) dinero % 1)) / 1;
        dinero = dinero % 1;

        double moneda50 = dinero / 0.50;
        dinero = dinero % 0.50;
        double moneda25 = dinero / 0.25;
        dinero = dinero % 0.25;
        double moneda10 = dinero / 0.10;
        dinero = dinero % 0.10;
        double moneda05 = dinero / 0.05;
        
        System.out.println(" USTED NECESITA: ");
        if (doscientos > 0) {
            System.out.println(doscientos + " billetes de 200");
        }
        if (cien > 0) {
            System.out.println(cien + " billetes de 100 ");
        }
        if (cincuenta > 0) {
            System.out.println(cincuenta + " billetes de 50 ");
        }
        if (veinte > 0) {
            System.out.println(veinte + " billetes de 20 ");
        }
        if (diez > 0) {
            System.out.println(diez + " billetes de 10 ");
        }
        if (cinco > 0) {
            System.out.println(cinco + " billetes de 5 ");
        }
        if (dos > 0) {
            System.out.println(dos + " billetes de 2 ");
        }
        if (uno > 0) {
            System.out.println(uno + " billetes de 1 ");
        }
        if (Math.round(moneda50) > 0) {
            System.out.println(Math.round(moneda50) + " monedas de 0.50 ");
        }
        if (Math.round(moneda25) > 0) {
            System.out.println(Math.round(moneda25) + " monedas de 0.25 ");
        }
        if (Math.round(moneda10) > 0) {
            System.out.println(Math.round(moneda10) + " monedas de 0.10 ");
        }
        if (Math.round(moneda05) > 0) {
            System.out.println(Math.round(moneda05) + " monedas de 0.05 ");
        }

    }

}
