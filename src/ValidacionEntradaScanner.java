import java.util.Scanner;
public class ValidacionEntradaScanner {

    public void validacionNumero(Scanner teclado){
        while(!teclado.hasNextDouble()){
            System.out.println("Valor ingresado incorrecto, no es un numero, vuelva a intentarlo");
            teclado.next();
        }
    }

    public String validacionPalabra(Scanner teclado){
        String tecladoString = teclado.nextLine();
        if (!tecladoString.matches("[a-zA-Z- ]+$")) {
            System.out.println("Valor ingresado incorrecto, no es una palabra, vuelva a intentarlo");
            tecladoString=teclado.next();
        }return tecladoString;
    }
}