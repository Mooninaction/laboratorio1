/*
 Cree una clase Fracción con 
dos atributos numéricos enteros, numerador y denominador.

Agregue un constructor sobrecargado
(debe contener como parámetros el numerador y el denominador)
que cree el objeto Fracción correspondiente.

Agregue a la clase los siguientes 4 métodos e implemente los mismos:
public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
……….
} 

public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
……….
}
public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
……….
}
public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
……….
}
 */
package ejercicioveinte;

/**
 *
 * @author Luna
 */
public class Fraccion {

    int numerador;
    int denominador;

    public Fraccion() {
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public double Fraccion(int numerador, int denominador) {
        return numerador / denominador;
    }

    public double sumarFracciones(double f1, double f2) {
        return f1 + f2 ;
    }

    public double restarFracciones(double f1, double f2) {
        return f1 - f2;
    }

    public double multiplicarFracciones(double f1, double f2) {
        return f1 * f2;
    }

    public double dividirFracciones(double f1, double f2) {
        return f1/f2;
    }
}
