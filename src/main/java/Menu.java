import java.util.Scanner;

public class Menu {

    public void menuCompleto() {

        int numeroEjercicio = 0;
        System.out.println("Ejercicio 1. Indica que número es mayor, menor o igual.\n" +
                "Ejercicio 2. Digitar 2 números e indica cual es mayor menor o igual.\n" +
                "Ejercicio 3. Digitar el valor del radio de un círculo, e indica cual es el área del circulo.\n" +
                "Ejercicio 4. Digitar el precio de un producto e indica cuanto es el valor del producto más el IVA del 21%.\n" +
                "Ejercicio 5. Muestra los números impares y pares del 1 al 100. (ciclo while).\n" +
                "Ejercicio 6. Muestra los números impares y pares del 1 al 100. (ciclo for).\n" +
                "Ejercicio 7. Digitar un número por consola si es mayor o igual a cero se muestra, si no, se volverá a pedir.\n" +
                "Ejercicio 8. Digitar un dia de la semana y muestra si es día laboral o no.\n" +
                "Ejercicio 9. Digitar una frase, la cual se concatena con la frase “la sonrisa será la mejor arma contra la tristeza” y\n" +
                "se remplazan todas las “a” por “e”, de la última frase.\n" +
                "Ejercicio 10. Digitar una frase la cual se mostrará sin espacios.\n" +
                "Ejercicio 11. Digitar una frase, se mostrará su longitud y cuantas vocales tiene.\n" +
                "Ejercicio 12. Digitar dos palabras, e indica si son iguales, sino son iguales se mostrarán sus diferencias.\n" +
                "Ejercicio 13. Se mostrará la fecha y hora actual en el formato (aaaa/mm/dd) (hh:mm:ss).\n" +
                "Ejercicio 14. Digitar un numero e imprime los números desde el numero introducido hasta 1000 con saltos de 2 en 2. \n" +
                "Ejercicio 15. Se mostrará un menú de opciones mientras se digite una de las 7 opciones se seguirá mostrado el menú y\n" +
                "si digita un número que no está en el menú arroja un mensaje opción incorrecta y mostrará el menú nuevamente.\n" +
                "Ejercicio 16. Se calcuará su IMC, si tiene la mayoria de edad de acuerdo a unos datos pedidos por teclado, de dos personas y una por defecto.\n" +
                "Ejercicio 17. Mostrará el precio de todos los televisores, lavadoras y la suma del precio de todos los Electrodomésticos.\n" +
                "Ejercicio 18. De acuerdo a los datos del array de video juego y series, indicará el número de la serie que mas\n" +
                "tiene temporadas y el número mayor de horas del video juego.\n");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número del ejercicio al que desea ingresar: ");
        ValidacionEntradaScanner validacionEntradaScanner = new ValidacionEntradaScanner();
        validacionEntradaScanner.validacionNumero(teclado);
        numeroEjercicio = teclado.nextInt();
        do {
            switch (numeroEjercicio) {
                case 1:

                    ejercicioUno();
                    break;
                case 2:
                    ejercicioDos();
                    break;
                case 3:
                    ejercicioTres();
                    break;
                case 4:
                    ejercicioCuatro();
                    break;
                case 5:
                    ejercicioCinco();
                    break;
                case 6:
                    ejercicioSeis();
                    break;
                case 7:
                    ejercicioSiete();
                    break;
                case 8:
                    ejercicioOcho();
                    break;
                case 9:
                    ejercicioNueve();
                    break;
                case 10:
                    ejercicioDiez();
                    break;
                case 11:
                    ejercicioOnce();
                    break;
                case 12:
                    ejercicioDoce();
                    break;
                case 13:
                    ejercicioTrece();
                    break;
                case 14:
                    ejercicioCatorce();
                    break;
                case 15:
                    ejercicioQuince();
                    break;
                case 16:
                    ejercicioDieciSeis();
                    break;
                case 17:
                    ejercicioDieciSiete();
                    break;
                case 18:
                    ejercicioDieciOcho();
                    break;
                default:
            }
        }

        while (numeroEjercicio < 19);
    }

    public static void ejercicioUno(){
        System.out.println("\uD83D\uDE0D Ejercicio número 1.");
        EjercicioUno comparacionNumero = new EjercicioUno();
        comparacionNumero.compararNumero();
    }
    public static void ejercicioDos(){
        System.out.println("\uD83D\uDE04  Ejercicio número 2.");
        EjercicioDos comparacionNumeroIngresado = new EjercicioDos();
        comparacionNumeroIngresado.numerosAComparar();
        comparacionNumeroIngresado.comparacionNumeros();
    }
    public static void ejercicioTres(){
        System.out.println("\uD83D\uDE0A Ejercicio número 3.");
        EjercicioTres areaCirculo = new EjercicioTres();
        areaCirculo.areaCirculo();
        areaCirculo.calculoAreaCirculo();
    }
    public static void ejercicioCuatro(){
        System.out.println("\uD83D\uDE1D Ejercicio número 4:");
        EjercicioCuatro prodcutoMasIVA = new EjercicioCuatro();
        prodcutoMasIVA.ejercicioCuatro();
        prodcutoMasIVA.precioProductoMasIVA();
    }
    public static void ejercicioCinco(){
        System.out.println("\uD83D\uDE07 Ejercicio número 5.");
        EjercicioCinco numeroParesImparesWhile = new EjercicioCinco();
        numeroParesImparesWhile.numerosParImpar();
    }
    public static void ejercicioSeis(){
        System.out.println("\uD83D\uDE0E Ejercicio número 6.");
        EjercicioSeis numerosParesImparesFor = new EjercicioSeis();
        numerosParesImparesFor.numeroParImpar();
    }
    public static void ejercicioSiete(){
        System.out.println("\uD83D\uDE3B Ejercicio número 7.");
        EjercicioSiete comprobarNumero = new EjercicioSiete();
        comprobarNumero.comprobacionNumero();
    }
    public static void ejercicioOcho(){
        System.out.println("Ejercicio número 8.");
        EjercicioOcho tipoDiaSemana = new EjercicioOcho();
        tipoDiaSemana.diaSemana();
        tipoDiaSemana.tipoDiaSemana();
    }
    public static void ejercicioNueve(){
        System.out.println("Ejercicio número 9.");
        EjercicioNueve concatenarFrases = new EjercicioNueve();
        concatenarFrases.cambiarVocal();
        concatenarFrases.introducirFrase();
        concatenarFrases.concatenarFrase();

    }
    public static void ejercicioDiez(){
        System.out.println("Ejercicio número 10.");
        EjercicioDiez eliminarEspaciosFrase = new EjercicioDiez();
        eliminarEspaciosFrase.eliminarEspacios();
    }
    public static void ejercicioOnce(){
        System.out.println("Ejercicio número 11:");
        EjercicioOnce contarVocalesFrase = new EjercicioOnce();
        contarVocalesFrase.introducirFrase();
        contarVocalesFrase.contarVocales();
    }
    public static void ejercicioDoce(){
        System.out.println("Ejercicio número 12.");
        EjercicioDoce diferenciasPalabras = new EjercicioDoce();
        diferenciasPalabras.introducirPalabra();
        diferenciasPalabras.diferenciasPalabras();
    }
    public static void ejercicioTrece(){
        System.out.println("Ejercicio número 13.");
        EjercicioTrece fechaHora = new EjercicioTrece();
        fechaHora.obtenerFechaHora();
    }
    public static void ejercicioCatorce(){
        System.out.println("Ejercicio número 14.");
        EjercicioCatorce imprimirNumero = new EjercicioCatorce();
        imprimirNumero.introducirNumero();
        imprimirNumero.imprimiNumeros();
    }
    public static void ejercicioQuince(){
        System.out.println("Ejercicio número 15:");
        EjercicioQuince ejercicioQuince = new EjercicioQuince();
        ejercicioQuince.ejercicioQuince();
    }
    public static void ejercicioDieciSeis(){
        System.out.println("Ejercicio número 16:");
        Persona ejercicioDieciSeis = new Persona();
        ejercicioDieciSeis.ejercicioDieciSeis();
    }
    public static void ejercicioDieciSiete(){
        System.out.println("Ejercicio número 17:");
        EjercicioDieciSiete ejercicioDieciSiete = new EjercicioDieciSiete();
        ejercicioDieciSiete.ejercicioDieciSiete();
    }
    public static void ejercicioDieciOcho(){
        System.out.println("Ejercicio número 18:");
        EjercicioDieciOcho ejercicioDieciOcho = new EjercicioDieciOcho();
        ejercicioDieciOcho.creacionArrays();
    }
    public void preguntarMenu() {
        int pregunta = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Desea volver al menu? Digite 1 si desea volver al menu, si no -> 0");
        pregunta = teclado.nextInt();

        if (pregunta == 1) {
            Menu volverMenu = new Menu();
            volverMenu.menuCompleto();
        }
    }
}