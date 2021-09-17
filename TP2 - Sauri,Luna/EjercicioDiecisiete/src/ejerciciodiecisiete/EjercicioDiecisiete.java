/*
- Cree una clase FuncionesPrograma y codifique una función estática que reciba
como parámetro una fecha de tipo Date y retorne la fecha como una cadena.
public static String getFechaString(Date fecha){
……….
}
Cree una clase Principal que contenga un método main y haga uso de la función
getFechaString.

 */
package ejerciciodiecisiete;

import java.util.Date;

/**
 *
 * @author Luna
 */
public class EjercicioDiecisiete {

    public static void main(String[] args) {
        
        Date fecha = new Date(2012, 3, 25);
        
        FuncionesPrograma datoFecha = new FuncionesPrograma();
        
        System.out.println(datoFecha.getFechaString(fecha));
       
        
        
    }
    
}
