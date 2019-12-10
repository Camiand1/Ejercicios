import java.util.Scanner;

public class EjercicioDos {

    private double primerNumero;
    private double segundoNumero;

    public void numerosAComparar(){

        System.out.println("Dependiendo el número que digite, indica cual es mayor o si son iguales:");
        ValidacionEntradaScanner validadorNumero = new ValidacionEntradaScanner();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir el primer número: ");
        validadorNumero.validacionNumero(teclado);
        primerNumero = teclado.nextDouble();

        System.out.println("Introducir el segundo número: ");
        validadorNumero.validacionNumero(teclado);
        segundoNumero = teclado.nextDouble();

    }

    public void comparacionNumeros(){
        if (primerNumero == segundoNumero) {
            System.out.println("Los números son iguales\n");
        }
        else if (primerNumero > segundoNumero) {
            System.out.println("El número mayor es: " + primerNumero+ "\n");
        }else {
            System.out.println("El número mayor es: " + segundoNumero+ "\n");
        }
        Menu volverMenu = new Menu();
        volverMenu.preguntarMenu();
    }
}