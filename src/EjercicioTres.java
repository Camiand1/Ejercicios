import java.util.Scanner;

import static java.lang.Math.PI;

public class EjercicioTres {

    private double radio;

    public void areaCirculo(){

        ValidacionEntradaScanner validadorNumero = new ValidacionEntradaScanner();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Se calculará el area de un circulo.\n" +
                "Por favor introduzca el valor del radio del circulo: ");
        validadorNumero.validacionNumero(teclado);
        radio = teclado.nextDouble();

    }
    public void calculoAreaCirculo(){
        radio = Math.pow(radio, 2);
        double area = (PI * radio);
        System.out.println("El area del circulo es: " + area +"\n");
        Menu volverMenu = new Menu();
        volverMenu.preguntarMenu();
    }
}
