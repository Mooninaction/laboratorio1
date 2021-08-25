/*
    Lee un número por teclado que pida el precio de un producto 
    puede tener decimales) y calcule el precio final con IVA. 
    El IVA sera una constante que sera del 21%
 */
package ejercicioseistp;

import java.util.Scanner;

/**
 *
 * @author Luna
 */
public class EjercicioSeisTP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto");
        double precio = sc.nextDouble();

        double precioFinal = precio * 0.21;

        System.out.println("El precio final con un iva del 21% es de: "
                + precioFinal);
    }

}
