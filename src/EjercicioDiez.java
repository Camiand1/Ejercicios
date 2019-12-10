import java.util.Scanner;

public class EjercicioDiez {

    public void eliminarEspacios(){

        System.out.println("Se eliminarán los espacion de la frase que digite");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir una frase: ");
        String frase = teclado.nextLine();
        System.out.println(frase.replace(" ", "")+ "\n");
        Menu volverMenu = new Menu();
        volverMenu.preguntarMenu();
    }
}
