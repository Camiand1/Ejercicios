import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numeroEjercicio = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número del ejercicio: ");
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

                    break;
                case 17:

                    break;
                case 18:

                    break;
                default:

            }
            break;

        }

        while (numeroEjercicio < 19);
        // System.out.println("No existe este número de ejercicio");

    }
    public static void ejercicioUno(){
        System.out.println("\uD83D\uDE0D Ejercicio número 1:");
        EjercicioUno comparacionNumero = new EjercicioUno();
        comparacionNumero.compararNumero();
    }
    public static void ejercicioDos(){
        System.out.println("\uD83D\uDE04  Ejercicio número 2:" );
        EjercicioDos comparacionNumeroIngresado = new EjercicioDos();
        comparacionNumeroIngresado.numerosAComparar();
        comparacionNumeroIngresado.comparacionNumeros();
    }
    public static void ejercicioTres(){
        System.out.println("\uD83D\uDE0A Ejercicio número 3:");
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
        System.out.println("\uD83D\uDE07 Ejercicio número 5:");
        EjercicioCinco numeroParesImparesWhile = new EjercicioCinco();
        numeroParesImparesWhile.numerosParImpar();
    }
    public static void ejercicioSeis(){
        System.out.println("\uD83D\uDE0E Ejercicio número 6:");
        EjercicioSeis numerosParesImparesFor = new EjercicioSeis();
        numerosParesImparesFor.numeroParImpar();
    }
    public static void ejercicioSiete(){
        System.out.println("\uD83D\uDE3B Ejercicio número 7:");
        EjercicioSiete comprobarNumero = new EjercicioSiete();
        comprobarNumero.comprobacionNumero();
    }
    public static void ejercicioOcho(){
        System.out.println("Ejercicio número 8:");
        EjercicioOcho tipoDiaSemana = new EjercicioOcho();
        tipoDiaSemana.diaSemana();
        tipoDiaSemana.tipoDiaSemana();
    }
    public static void ejercicioNueve(){
        System.out.println("Ejercicio número 9:");
        EjercicioNueve concatenarFrases = new EjercicioNueve();
        concatenarFrases.cambiarVocal();
        concatenarFrases.introducirFrase();
        concatenarFrases.concatenarFrase();

    }
    public static void ejercicioDiez(){
        System.out.println("Ejercicio número 10:");
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
        System.out.println("Ejercicio número 12:");
        EjercicioDoce diferenciasPalabras = new EjercicioDoce();
        diferenciasPalabras.introducirPalabra();
        diferenciasPalabras.diferenciasPalabras();
    }
    public static void ejercicioTrece(){
        System.out.println("Ejercicio número 13:");
        EjercicioTrece fechaHora = new EjercicioTrece();
        fechaHora.obtenerFechaHora();
    }
    public static void ejercicioCatorce(){
        System.out.println("Ejercicio número 14:");
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
        Electrodomestico ejercicioDieciSiete = new Electrodomestico();
        ejercicioDieciSiete.ejercicioDieciSiete();
    }
    public static void ejercicioDieciOcho(){
        System.out.println("Ejercicio número 18:");
        EjercicioDieciOcho ejercicioDieciOcho = new EjercicioDieciOcho();
        ejercicioDieciOcho.ejercicioDieciOcho();
    }
}