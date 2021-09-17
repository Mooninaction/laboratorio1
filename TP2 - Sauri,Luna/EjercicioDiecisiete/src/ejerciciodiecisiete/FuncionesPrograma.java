/*
 - Cree una clase FuncionesPrograma y codifique una función estática que reciba
como parámetro una fecha de tipo Date y retorne la fecha como una cadena.
public static String getFechaString(Date fecha){
……….
}
 */
package ejerciciodiecisiete;

import java.util.Date;

/**
 *
 * @author Luna
 */
public class FuncionesPrograma {
    
    public static String getFechaString(Date fecha) {
        return fecha.toString();
    }
}
