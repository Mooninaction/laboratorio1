/*
Arreglos Multidimensionales.

 Codifique la siguiente matriz de 2 dimensiones, que se corresponde a una máquina
expendedora de golosinas donde la columna 1 es la golosina, la columna 2 el precio
y la columna 3 la cantidad (stock) actual de golosinas
KitKat 32 10
Chicles 2 50
Caramelos de Menta 2 50
Huevo Kinder 25 10
Chetoos 30 10
Twix 26 10
M&M'S 35 10
Papas Lays 40 20
Milkybar 30 10
Alfajor Tofi 20 15
Lata Coca 50 20
Chitos 45 10
Tendremos un pequeño menú con las siguientes opciones:
a. Pedir golosina: pedirá la posición de la golosina que quiera. Esta máquina
tiene golosinas en cada posición, identificados por su fila y columna, que
será lo que introduzca el usuario al pedir una golosina, por ejemplo si el
usuario teclea 2 significa que está pidiendo la golosina que está en la fila 2.
Al seleccionar una golosina debe disminuir la cantidad disponible de la
golosina. En caso de agotar el stock de la golosina deberá informar de la
situación al cliente y solicitarle que seleccione otra golosina.
b. Mostrar golosinas: mostrara todas las golosinas con la cantidad actual
disponible.
c. Rellenar golosinas: esta es una función exclusiva de un técnico por lo que
para su ejecución nos pedirá una contraseña, si el usuario escribe
“AdminXYZ” nos autorizara y pedirá la posición de la golosina y la cantidad a
recargar. La cantidad ingresada se sumara a la cantidad actual existente.
d. Apagar maquina: sale del programa, antes de salir mostrara las ventas
totales durante la ejecución del programa. Es decir la suma de todos los
precios de las golosinas seleccionadas desde el inicio del programa.
 */
package ejerciciocinco;

import java.util.Scanner;

public class EjercicioCinco {

    public static void main(String[] args) {

        llenarMatriz();
        mostrarMenu();
        opcionMenu();

    }

    private static void mostrarMenu() {
        System.out.println(" ** MENU ** \n"
                + "a. Pedir golosina"
                + "b. Mostrar golosinas"
                + "c. Rellenar golosinas"
                + "d. Apagar maquina"
                + "e. SALIR");
    }

    private static void llenarMatriz() {
        String[][] array = new String[3][11];

        array[0][0] = "KitKat";
        array[0][1] = "Chicles";
        array[0][2] = "Caramelos de Menta";
        array[0][3] = "Huevo Kinder";
        array[0][4] = "Chetoos";
        array[0][5] = "Twix";
        array[0][6] = "M&M's";
        array[0][7] = "Papas Lays";
        array[0][8] = "Milkybar";
        array[0][9] = "Alfajor Tofi";
        array[0][10] = "Lata Coca";
        array[0][11] = "Chitos";

        array[1][0] = "32";
        array[1][1] = "2";
        array[1][2] = "2";
        array[1][3] = "25";
        array[1][4] = "30";
        array[1][5] = "26";
        array[1][6] = "35";
        array[1][7] = "40";
        array[1][8] = "30";
        array[1][9] = "20";
        array[1][10] = "50";
        array[1][11] = "45";

        array[2][0] = "10";
        array[2][1] = "50";
        array[2][2] = "50";
        array[2][3] = "10";
        array[2][4] = "10";
        array[2][5] = "10";
        array[2][6] = "10";
        array[2][7] = "20";
        array[2][8] = "10";
        array[2][9] = "15";
        array[2][10] = "20";
        array[2][11] = "10";
    }

    private static void opcionMenu() {

        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine();
        boolean salir = false;
        do {
            switch (opcion) {
                case "a":
                    pedirComida();
                    break;
                case "b":
                    mostrarGolosina();
                    break;
                case "c":
                    rellenarGolocina();
                    break;
                case "d":
                    apagarMaquina();
                    break;
                case "e":
                    salir = true;
            }
        } while (salir == true);

    }

    private static void pedirComida() {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la posicion de la golosina que desea");
        int y = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == 0) {
                    if (array[i][j] == array[i][y]) {
                        System.out.println("Golosina encontrada");
                    }
                }
            }
        }

    

    private static void mostrarGolosina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void rellenarGolocina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void apagarMaquina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

}
