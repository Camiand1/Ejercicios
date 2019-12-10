import java.util.Scanner;

public class EjercicioCatorce {

    private int numero;

    public void introducirNumero() {

        System.out.println("Se imprimirán los números desde el numero que introduzca hasta 1000 con saltos de 2 en 2");
        ValidacionEntradaScanner validadorNumero = new ValidacionEntradaScanner();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        validadorNumero.validacionNumero(teclado);
        numero = teclado.nextInt();

    }

    public void imprimiNumeros() {
        int numeroLimite = 1000;
        for (int i = numero; i <= numeroLimite; i += 2) {
            System.out.print(i + "\n");
        }
        Menu volverMenu = new Menu();
        volverMenu.preguntarMenu();
    }
}
