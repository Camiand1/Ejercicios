import java.util.Scanner;

public class EjercicioSiete {

    public void comprobacionNumero(){

        int numero;
        System.out.println("Digite un número por consola y se indicará si es mayor o igual a cero, si no cumple, se volverá a pedir:\n");
        do {
            ValidacionEntradaScanner validadorNumero = new ValidacionEntradaScanner();
            Scanner teclado = new Scanner(System.in);
            System.out.println("Escriba un numero: ");
            validadorNumero.validacionNumero(teclado);
            numero = teclado.nextInt();
        } while (numero < 0);
        System.out.println("El numero es: " + numero+ "\n");
        Menu volverMenu = new Menu();
        volverMenu.preguntarMenu();
    }
}
