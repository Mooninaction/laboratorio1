/*
  En la clase FuncionesPrograma codifique una función estática que reciba como
parámetro 3 valores enteros, día, mes, anio y retorne la fecha de tipo Date
correspondiente.
public static Date getFechaDate(int día, int mes, int anio){
……….
}
En la clase Principal creada en el punto anterior haga uso de la función
getFechaDate.
 */
package ejerciciodieciocho;

import java.util.Date;

/**
 *
 * @author Luna
 */
public class EjercicioDieciocho {

    public static void main(String[] args) {

        int dia = 25;
        int mes = 3;
        int anio = 2015;

        FuncionesPrograma datoFecha = new FuncionesPrograma();

        System.out.println(datoFecha.getFechaDate(dia, mes, anio));

    }

}
