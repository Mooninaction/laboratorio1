/*
Arreglos Multidimensionales.

 Codifique la siguiente matriz de 2 dimensiones, que se corresponde a una mÃ¡quina
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
Tendremos un pequeÃ±o menÃº con las siguientes opciones:
a. Pedir golosina: pedirÃ¡ la posiciÃ³n de la golosina que quiera. Esta mÃ¡quina
tiene golosinas en cada posiciÃ³n, identificados por su fila y columna, que
serÃ¡ lo que introduzca el usuario al pedir una golosina, por ejemplo si el
usuario teclea 2 significa que estÃ¡ pidiendo la golosina que estÃ¡ en la fila 2.
Al seleccionar una golosina debe disminuir la cantidad disponible de la
golosina. En caso de agotar el stock de la golosina deberÃ¡ informar de la
situaciÃ³n al cliente y solicitarle que seleccione otra golosina.
b. Mostrar golosinas: mostrara todas las golosinas con la cantidad actual
disponible.
c. Rellenar golosinas: esta es una funciÃ³n exclusiva de un tÃ©cnico por lo que
para su ejecuciÃ³n nos pedirÃ¡ una contraseÃ±a, si el usuario escribe
â€œAdminXYZâ€? nos autorizara y pedirÃ¡ la posiciÃ³n de la golosina y la cantidad a
recargar. La cantidad ingresada se sumara a la cantidad actual existente.
d. Apagar maquina: sale del programa, antes de salir mostrara las ventas
totales durante la ejecuciÃ³n del programa. Es decir la suma de todos los
precios de las golosinas seleccionadas desde el inicio del programa.
 */
package ejerciciocinco;

import java.util.Scanner;

public class EjercicioCinco {

    public static void main(String[] args) {

         static String[][]golosinas = {{"KitKat","32","10"},{"Chicles","2","50"},{"Caramelos de Menta","2","50"},{"Huevo Kinder","25","10"},
        {"Chetoos","30","10"},{"Twix","26","10"},{"M&M'S","35","10"},{"Papas Lays","40","20"},{"Milkybar","30","10"},{"Alfajor Tofi","20","15"}
    ,{"Lata Coca","50","20"},{"Chitos","45","1"}};
    
    static double montoTotal = 0;
    
    public static void main(String[] args) {
       
        menuOpciones();
        
    }
    
    static boolean salir = false;
    private static void menuOpciones(){
        System.out.println("Inicia");
        //a diferencia del video agregue esta opción para que quede mas claro la opción de salida
        while(!salir){
            System.out.println("----------------------");
            System.out.println("Menú Opciones");
            System.out.println("----------------------");
            System.out.println("a- Pedir Golosina");
            System.out.println("b- Mostrar Golosina");
            System.out.println("c- Rellenar Golosinas");
            System.out.println("d- Apagar Maquina");
            System.out.println("Seleccione la opción a ejecutar");
            String opcion = new Scanner(System.in).nextLine();
            if(opcion.equals("a")){
                pedirGolosina();
            }else if(opcion.equals("b")){
                System.out.println("Las Golosinas Disponibles son:");
                mostrarGolosina();
            }else if(opcion.equals("c")){
                rellenarGolosina();
            }else if(opcion.equals("d")){
                apagarMaquina();
                salir = true;
            }else{
                System.out.println("Opción Incorrecta. Intente nuevamente.");
                System.out.println("----------------------");
            }
        }
            
    }
    
    private static void pedirGolosina(){
    
        mostrarGolosina();
        System.out.println("--------------------");
        System.out.println("Ingrese código golosina");
        int codigo = new Scanner(System.in).nextInt();
        if(!isCodigoCorrecto(codigo)){
            System.out.println("ERROR: Código incorrecto");
            pedirGolosina();
        }
        int stockActual = Integer.parseInt(golosinas[codigo - 1][2]);
        if(stockActual > 0){
            golosinas[codigo - 1][2] = Integer.toString(stockActual - 1);
            System.out.println("Gracias por comprar " + golosinas[codigo - 1][0] + ".");
            montoTotal += Double.parseDouble(golosinas[codigo - 1][1]);
            menuOpciones();
        }else{
            System.out.println("La golosina " + golosinas[codigo - 1][0] + " no posee stock, seleccione otra golosina");
            pedirGolosina();
        }
        
    }
    
    private static void mostrarGolosina(){
        System.out.println("-----------------------------------------");
        for(int i=0; i < golosinas.length; i++){
            System.out.println((i+1) + "\t" + completarConEspacios(golosinas[i][0]) + "\t" + "$"+ golosinas[i][1] + "\t" + golosinas[i][2] + " Unidades");
        }
        System.out.println("-----------------------------------------");
    }
    
    private static String completarConEspacios(String cadena){
        int cantidadEspacios = 25 - cadena.length();
        for(int i=0; i < cantidadEspacios; i++){
            cadena += " ";
        }
        return cadena;
    }
    
    private static void rellenarGolosina(){
    
        System.out.println("Ingrese la clave para ejecutar esta función.");
       
        String clave = new Scanner(System.in).nextLine();
        if(clave.equalsIgnoreCase("AdminXYZ")){
            System.out.println("Clave Correcta");
            while(true){
                mostrarGolosina();
                System.out.println("Ingrese código golosina");
                int codigo = new Scanner(System.in).nextInt();
                if(!isCodigoCorrecto(codigo)){
                    System.out.println("ERROR: Código golosina incorrecto, intente nuevamente");
                }else{
                    System.out.println("Ingrese la cantidad a rellenar");
                    int cantidad = new Scanner(System.in).nextInt();
                    golosinas[codigo - 1][2] = Integer.toString(Integer.parseInt(golosinas[codigo - 1][2]) + cantidad);
                    System.out.println("El stock de la golosina " + golosinas[codigo - 1][0] + " fue actualizado. Stock Actual " + golosinas[codigo - 1][2]);
                    break;
                }
            }
        }else{
            System.out.println("ERROR: La clave es incorrecta, no puede continuar.");
        }
        menuOpciones();
    }
    
    private static void apagarMaquina(){
        System.out.println("TOTAL de VENTAS REALIZADAS: $" + montoTotal);
        System.out.println("Gracias por su compra.");
    }
    
    private static boolean isCodigoCorrecto(int codigo){
        if(codigo < 1 || codigo > 12){
            return false;
        }
        return true;
    }
        
}

//        llenarMatriz();
//        mostrarMenu();
//        opcionMenu();
//
//    }
//
//    private static void mostrarMenu() {
//        System.out.println(" ** MENU ** \n"
//                + "a. Pedir golosina"
//                + "b. Mostrar golosinas"
//                + "c. Rellenar golosinas"
//                + "d. Apagar maquina"
//                + "e. SALIR");
//    }
//
//    private static void llenarMatriz() {
//        String[][] array = new String[3][11];
//
//        array[0][0] = "KitKat";
//        array[0][1] = "Chicles";
//        array[0][2] = "Caramelos de Menta";
//        array[0][3] = "Huevo Kinder";
//        array[0][4] = "Chetoos";
//        array[0][5] = "Twix";
//        array[0][6] = "M&M's";
//        array[0][7] = "Papas Lays";
//        array[0][8] = "Milkybar";
//        array[0][9] = "Alfajor Tofi";
//        array[0][10] = "Lata Coca";
//        array[0][11] = "Chitos";
//
//        array[1][0] = "32";
//        array[1][1] = "2";
//        array[1][2] = "2";
//        array[1][3] = "25";
//        array[1][4] = "30";
//        array[1][5] = "26";
//        array[1][6] = "35";
//        array[1][7] = "40";
//        array[1][8] = "30";
//        array[1][9] = "20";
//        array[1][10] = "50";
//        array[1][11] = "45";
//
//        array[2][0] = "10";
//        array[2][1] = "50";
//        array[2][2] = "50";
//        array[2][3] = "10";
//        array[2][4] = "10";
//        array[2][5] = "10";
//        array[2][6] = "10";
//        array[2][7] = "20";
//        array[2][8] = "10";
//        array[2][9] = "15";
//        array[2][10] = "20";
//        array[2][11] = "10";
//    }
//
//    private static void opcionMenu() {
//
//        Scanner sc = new Scanner(System.in);
//        String opcion = sc.nextLine();
//        boolean salir = false;
//        do {
//            switch (opcion) {
//                case "a":
//                    pedirComida();
//                    break;
//                case "b":
//                    mostrarGolosina();
//                    break;
//                case "c":
//                    rellenarGolocina();
//                    break;
//                case "d":
//                    apagarMaquina();
//                    break;
//                case "e":
//                    salir = true;
//            }
//        } while (salir == true);
//
//    }
//
//    private static void pedirComida() {
//
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Ingrese la posicion de la golosina que desea");
//        int y = sc.nextInt();
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (i == 0) {
//                    if (array[i][j] == array[i][y]) {
//                        System.out.println("Golosina encontrada");
//                    }
//                }
//            }
//        }
//
//    
//
//    private static void mostrarGolosina() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private static void rellenarGolocina() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private static void apagarMaquina() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }