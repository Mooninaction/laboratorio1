/*
 - Indique cual es la diferencia entre los datos primitivos (por valor) 
ejemplo el int y su contraparte por referencia ejemplo Integer.
 */
package ejerciciocatorce;

/**
 *
 * @author Luna
 */
public class EjercicioCatorce {

    public static void main(String[] args) {
        
        int n = 9;
        Integer num = 9;
        
        Integer.parseInt("1");
         /* int.parseInt("1"); <- esto no se puede hacer porque:

        int es un tipo primitivo, no un objeto, 
        mientras que Integer es un objeto o una Clase.

        Dicho en lenguaje coloquial:
        un intes un número, y un Integeres un puntero que hace referencia a 
        una clase que contiene un entero. O... más coloquial todavía: 
        un Integeres una caja, y un int es lo que hay dentro de esa caja.
         */
        
    }

}
