import java.util.Scanner;

public class EjercicioNueve {

    private String frase = "La sonrisa será la mejor arma contra la tristeza - ";
    private String fraseIntroducida;

    public void cambiarVocal() {

        frase = frase.replace('a', 'e');
    }
    public void introducirFrase(){

        System.out.println("Digite una frase, esta se concatenará con otra y se remplazarán sus vocales “a” por “e”.\n");
        ValidacionEntradaScanner validadorPalabra = new ValidacionEntradaScanner();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir una frase: ");
        fraseIntroducida = validadorPalabra.validacionPalabra(teclado);
    }
    public void concatenarFrase(){

        String frasesConcatenadas = frase.concat(fraseIntroducida);
        System.out.println(frasesConcatenadas+ "\n");
        Menu volverMenu = new Menu();
        volverMenu.preguntarMenu();
    }
}
