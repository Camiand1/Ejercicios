import java.util.Scanner;

public class EjercicioOnce {

    private String frase = "";

    public void introducirFrase() {

        ValidacionEntradaScanner validadorPalabra = new ValidacionEntradaScanner();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir una frase: ");
        frase = validadorPalabra.validacionPalabra(teclado);
        frase = frase.toLowerCase();
    }

    public void contarVocales() {

        int contadorVocala = 0;
        int contadorVocale = 0;
        int contadorVocali = 0;
        int contadorVocalo = 0;
        int contadorVocalu = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                contadorVocala++;
            }
            if (frase.charAt(i) == 'e') {
                contadorVocale++;
            }
            if (frase.charAt(i) == 'i') {
                contadorVocali++;
            }
            if (frase.charAt(i) == 'o') {
                contadorVocalo++;
            }
            if (frase.charAt(i) == 'u') {
                contadorVocalu++;
            }
        }
        System.out.println("La palabra " + frase + " contiene " + contadorVocala + " vocales a, " + contadorVocale + " vocales e, " + contadorVocali + " vocales i, " + contadorVocalo + " vocales o y " + contadorVocalu + " vocales u\n");
        Menu volverMenu = new Menu();
        volverMenu.preguntarMenu();
    }
}