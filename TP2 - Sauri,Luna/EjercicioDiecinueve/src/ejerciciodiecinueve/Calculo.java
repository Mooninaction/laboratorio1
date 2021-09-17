/*
Cree una clase Calculo que contenga un método main, donde cree una
instancia de la clase OperacionMatematica, asigne 2 valores para las variables
de la instancia y ejecute la función aplicarOperacion, pasando como parámetro
primero “+”, después “-”, a continuación “*” y finalmente “/”. 
Muestre por pantalla el resultado de las operaciones.
 */
package ejerciciodiecinueve;

/**
 *
 * @author Luna
 */
public class Calculo {

    public static void main(String[] args) {
        
        OperacionMatematica nuevaOperacion = new OperacionMatematica(12.52,15.63);
        
        System.out.println("Los números son "  + nuevaOperacion.getValor1()+ " y " + nuevaOperacion.getValor2());
        System.out.println("---- OPERACIONES ----");
        System.out.println("Suma " + nuevaOperacion.aplicarOperacion("+"));
        System.out.println("Resta " + nuevaOperacion.aplicarOperacion("-"));
        System.out.println("Multiplicacion " + nuevaOperacion.aplicarOperacion("*"));
        System.out.println("Division " + nuevaOperacion.aplicarOperacion("/"));
        
        
    }
    
}
