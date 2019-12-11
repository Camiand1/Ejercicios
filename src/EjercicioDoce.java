import java.util.Scanner;

public class EjercicioDoce {

    private String palabra1 = "";
    private String palabra2 = "";

    public void introducirPalabra() {

        ValidacionEntradaScanner validadorPalabra = new ValidacionEntradaScanner();
        System.out.println("Digite dos palabras, indicará si son iguales, sino, se mostrarán sus diferencias");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la primer palabra: ");
        palabra1 = validadorPalabra.validacionPalabra(teclado);
        System.out.println("Introduzca la segunda palabra: ");
        palabra2 = validadorPalabra.validacionPalabra(teclado);
    }

    public void diferenciaPalabras() {

        int contPalabra1Vocala = 0;
        int contPalabra1Voca1e = 0;
        int contPalabra1Vocali = 0;
        int contPalabra1Vocalo = 0;
        int contPalabra1Vocalu = 0;
        int contPalabra2Vocala = 0;
        int contPalabra2Vocale = 0;
        int contPalabra2Vocali = 0;
        int contPalabra2Vovalo = 0;
        int contPalabra2Vocalu = 0;

        int palabraUno = palabra1.toLowerCase().length();
        int palabraDos = palabra2.toLowerCase().length();

        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println("Las palabras son iguales");

        }
        if (palabraUno > palabraDos) {
            System.out.println("La palabra " + palabra1 + " es mas larga");
        }
        if(palabraDos > palabraUno) {
            System.out.println("La palabra " + palabra2 + " es mas larga");
        }

        for (int i = 0; i < palabra1.length(); i++) {
            if (palabra1.charAt(i) == 'a') {
                contPalabra1Vocala++;
            }
            if (palabra1.charAt(i) == 'e') {
                contPalabra1Voca1e++;
            }
            if (palabra1.charAt(i) == 'i') {
                contPalabra1Vocali++;
            }
            if (palabra1.charAt(i) == 'o') {
                contPalabra1Vocalo++;
            }
            if (palabra1.charAt(i) == 'u') {
                contPalabra1Vocalu++;
            }
        }
        System.out.println("La palabra " + palabra1 + " contiene " + contPalabra1Vocala + " vocales a, " + contPalabra1Voca1e + " vocales e, " + contPalabra1Vocali + " vocales i, " + contPalabra1Vocalo + " vocales o y " + contPalabra1Vocalu + " vocales u");
        for (int i = 0; i < palabra2.length(); i++) {
            if (palabra2.charAt(i) == 'a') {
                contPalabra2Vocala++;
            }
            if (palabra2.charAt(i) == 'e') {
                contPalabra2Vocale++;
            }
            if (palabra2.charAt(i) == 'i') {
                contPalabra2Vocali++;
            }
            if (palabra2.charAt(i) == 'o') {
                contPalabra2Vovalo++;
            }
            if (palabra2.charAt(i) == 'u') {
                contPalabra2Vocalu++;
            }
        }
        System.out.println("La palabra " + palabra2 + " contiene " + contPalabra2Vocala + " vocales a, " + contPalabra2Vocale + " vocales e, " + contPalabra2Vocali + " vocales i, " + contPalabra2Vovalo + " vocales o y " + contPalabra2Vocalu + " vocales u\n");
        Menu volverMenu = new Menu();
        volverMenu.preguntarMenu();
    }
}